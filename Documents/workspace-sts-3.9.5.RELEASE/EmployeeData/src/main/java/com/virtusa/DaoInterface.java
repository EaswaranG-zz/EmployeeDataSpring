package com.virtusa;

import java.sql.SQLException;

public interface DaoInterface {
	public void addEmploye(Employee t) throws SQLException;

	public Employee getEmployee(int empId) throws SQLException;
}
