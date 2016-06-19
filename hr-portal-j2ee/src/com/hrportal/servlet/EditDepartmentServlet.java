package com.hrportal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.impl.DepartmentDAOImpl;
import com.hrportal.dos.DepartmentDO;

/**
 * Servlet implementation class EditDepartmentServlet
 */
public class EditDepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditDepartmentServlet() {
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

	DepartmentDAOImpl dao = new DepartmentDAOImpl();
	DepartmentDO deptDO = dao.fetch(id);
	try {
	    request.setAttribute("deptDO", deptDO);
	    request.getRequestDispatcher("edit_dept.jsp").forward(request, response);
	} catch (ServletException | IOException e) {
	    e.printStackTrace();
	}
    }

}
