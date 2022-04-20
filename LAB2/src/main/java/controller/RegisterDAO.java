package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDAO {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	PreparedStatement preparedStatement = null;
	
	public boolean save(student u) {
		boolean flag = false;

		try {
			String sql = "INSERT INTO student(id, name, department, math, science, english)VALUES" + "('"
					+ u.getId() + "','" + u.getName() + "', '" + u.getDepartment() + "', '" + u.getMath()
					+ "', '" + u.getScience() + "', '" + u.getEnglish() + "')";
			
			connection = MySQLJDBCUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}

	public List<student> getUser() {
		List<student> list = null;
		student student = new student();

		try {
			list = new ArrayList<student>();
			String sql = "SELECT * FROM student order by id asc";
			connection = MySQLJDBCUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				student = new student();
				student.setId(Integer.parseInt(resultSet.getString("id")));
				student.setName(resultSet.getString("name"));
				student.setDepartment(resultSet.getString("department"));
				student.setMath(resultSet.getString("math"));
				student.setScience(resultSet.getString("science"));
				student.setEnglish(resultSet.getString("english"));

				list.add(student);
			}
		} catch (Exception e) {
		}

		return list;
	}
}

