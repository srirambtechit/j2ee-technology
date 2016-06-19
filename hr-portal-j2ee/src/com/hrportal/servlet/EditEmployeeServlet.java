package com.hrportal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.impl.EmployeeDAOImpl;
import com.hrportal.dos.EmployeeDO;

/**
 * Servlet implementation class EditDepartmentServlet
 */
public class EditEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeServlet() {
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
	int id = Integer.parseInt(request.getParameter("id"));

	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	EmployeeDO employeeDO = dao.fetch(id);
	try {
	    request.setAttribute("employeeDO", employeeDO);
	    request.getRequestDispatcher("edit_employee.jsp").forward(request, response);
	} catch (ServletException | IOException e) {
	    e.printStackTrace();
	}
    }

}
