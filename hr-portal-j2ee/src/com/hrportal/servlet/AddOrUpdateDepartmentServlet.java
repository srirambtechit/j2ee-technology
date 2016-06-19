package com.hrportal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.impl.DepartmentDAOImpl;
import com.hrportal.dos.DepartmentDO;

/**
 * Servlet implementation class AddDepartmentServlet
 */
public class AddOrUpdateDepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrUpdateDepartmentServlet() {
	super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
	// when id is null, it is new record, otherwise this request will be for
	// update
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String type = request.getParameter("type");

	DepartmentDO deptDO = new DepartmentDO();
	deptDO.setName(name);
	deptDO.setCategory(type.charAt(0));

	String message = "";
	DepartmentDAOImpl dao = new DepartmentDAOImpl();

	if (id == null || id.isEmpty()) {
	    dao.add(deptDO);
	    message = "Department " + name + " is added successfully";
	} else {
	    deptDO.setId(Integer.parseInt(id));
	    dao.update(deptDO);
	    message = "Department ID " + id + " - " + name + " is updated successfully";
	}
	try {
	    request.getSession().setAttribute("message", message);
	    response.sendRedirect("view_dept.jsp");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
    }

}
