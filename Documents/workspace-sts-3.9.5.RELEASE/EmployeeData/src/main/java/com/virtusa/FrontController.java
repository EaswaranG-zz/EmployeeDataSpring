package com.virtusa;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	Employee e = new Employee(0, null, null);

	@RequestMapping("addEmployee")
	public ModelAndView addEmployee(@RequestParam("empNo") int empNo, @RequestParam("empName") String empName,
			@RequestParam("empAtc") String empAtc) throws SQLException {

		int employeeNo = empNo;
		String employeeName = empName;
		String employeeAtc = empAtc;

		ModelAndView mv = new ModelAndView();
		mv.addObject("empNo", employeeNo);
		mv.addObject("empName", employeeName);
		mv.addObject("empAtc", employeeAtc);
		mv.setViewName("empAdded.jsp");

		e.setEmpNo(employeeNo);
		e.setEmpName(employeeName);
		e.setEmpAtc(employeeAtc);
		DAO d = new DAO();
		d.addEmploye(e);

		return mv;
	}

	@RequestMapping("searchEmployee")
	public ModelAndView searchEmployee(@RequestParam("empNumber") int empNo) throws SQLException {
		ModelAndView getEmp = new ModelAndView();
		// getEmp.addObject("empNumber", empNo);
		getEmp.setViewName("EmployeeSearch.jsp");
		e.setEmpNo(empNo);
		DAO d = new DAO();

		d.getEmployee(e.getEmpNo());

		getEmp.addObject("empNo", DAO.EmpNo);
		getEmp.addObject("empName", DAO.EmpName);
		getEmp.addObject("empAtc", DAO.EmpAtc);

		return getEmp;

	}

}
