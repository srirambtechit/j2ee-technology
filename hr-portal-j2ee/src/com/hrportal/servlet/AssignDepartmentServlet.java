package com.hrportal.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.EmployeeDepartmentAssignmentDAO;
import com.hrportal.dos.EmployeeDepartmentAssignmentDO;

/**
 * Servlet implementation class AssignDepartmentServlet
 */
public class AssignDepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignDepartmentServlet() {
	super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
	String deptId = request.getParameter("dept_name");
	String[] employeeIds = request.getParameterValues("employee_id");
	EmployeeDepartmentAssignmentDAO dao = new EmployeeDepartmentAssignmentDAO();

	if (deptId != null && employeeIds != null) {
	    EmployeeDepartmentAssignmentDO empDeptDO = new EmployeeDepartmentAssignmentDO();
	    for (String empId : employeeIds) {
		empDeptDO.setDepartmentId(Integer.parseInt(deptId));
		empDeptDO.setEmployeeId(Integer.parseInt(empId));
		dao.add(empDeptDO);
	    }
	}
	try {
	    request.setAttribute("message", "Emp ID" + Arrays.toString(employeeIds) + " has been assigned with Dept ID[" + deptId + "] successfully");
	    request.getRequestDispatcher("view_dept.jsp").forward(request, response);
	} catch (ServletException | IOException e) {
	    e.printStackTrace();
	}
    }

}
