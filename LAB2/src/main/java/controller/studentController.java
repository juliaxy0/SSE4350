package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterDAO regDAO = null;
	RequestDispatcher rd = null;

	public studentController() {
		regDAO = new RegisterDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		switch (action) {
		case "ADD":
			rd = request.getRequestDispatcher("FormRegistration.jsp");
			rd.forward(request, response);
			break;
		case "LIST":
			listUser(request, response);
			break;
		case "EXIT":
			System.exit(0);
			break;
		default:
			listUser(request, response);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "ADD":
			saveUser(request, response);
			break;
		default:
			listUser(request, response);
			break;
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RegisterDAO dao = new RegisterDAO();
		List<student> theList = dao.getUser();
		request.setAttribute("user", theList);
		RequestDispatcher rd = request.getRequestDispatcher("FormList.jsp");
		rd.forward(request, response);

	}

	protected void saveUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		student u = new student();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setName(request.getParameter("name"));
		u.setDepartment(request.getParameter("department"));
		u.setMath(request.getParameter("math"));
		u.setScience(request.getParameter("science"));
		u.setEnglish(request.getParameter("english"));

		if (regDAO.save(u)) {
			request.setAttribute("NOTIFICATION", "student Registered Successfully!");
		}

		request.setAttribute("user", u);
		RequestDispatcher rd = request.getRequestDispatcher("FormRegistration.jsp");
		rd.forward(request, response);
	}

}
