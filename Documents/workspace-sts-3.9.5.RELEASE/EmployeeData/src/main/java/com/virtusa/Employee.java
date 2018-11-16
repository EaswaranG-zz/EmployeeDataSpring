package com.virtusa;

public class Employee {
	private int empNo;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAtc() {
		return empAtc;
	}

	public void setEmpAtc(String empAtc) {
		this.empAtc = empAtc;
	}

	private String empName;
	private String empAtc;

	public Employee(int empNo, String empName, String empAtc) {
		this.empNo = empNo;
		this.empName = empName;
		this.empAtc = empAtc;
		
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAtc=" + empAtc + "]";
		
	}

}
