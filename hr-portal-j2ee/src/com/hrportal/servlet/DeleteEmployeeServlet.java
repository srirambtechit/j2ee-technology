package com.hrportal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.impl.EmployeeDAOImpl;

/**
 * Servlet implementation class DeleteDepartmentServlet
 */
public class DeleteEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeServlet() {
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
	try {
	    dao.delete(id);
	    request.setAttribute("message", "Employee ID " + id + " has been deleted successfully");
	    request.getRequestDispatcher("view_employee.jsp").forward(request, response);
	} catch (IOException | ServletException e) {
	    e.printStackTrace();
	}
    }

}
