package com.virtusa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO implements DaoInterface {

	static int EmpNo;
	static String EmpName = "";
	static String EmpAtc = "";

	public void addEmploye(Employee t) throws SQLException {

		String query = "insert into employee (empID,empName,empAtc) values (?,?,?)";
		PreparedStatement statement = ConnectionUtil.conn.prepareStatement(query);
		statement.setInt(1, t.getEmpNo());
		statement.setString(2, t.getEmpName());
		statement.setString(3, t.getEmpAtc());

		statement.executeUpdate();
	}

	public Employee getEmployee(int empId) throws SQLException {
		String query = "SELECT * FROM employee where empId=?";
		PreparedStatement statement = ConnectionUtil.conn.prepareStatement(query);
		statement.setInt(1, empId);
		ResultSet results = statement.executeQuery();
		Employee emp = null;
		while (results.next()) {

			EmpNo = results.getInt("empID");
			EmpName = results.getString("empName");
			EmpAtc = results.getString("empAtc");
			emp = new Employee(results.getInt("empId"), results.getString("empName"), results.getString("empAtc"));

		}
		return emp;

	}

}
