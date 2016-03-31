package com.hrportal.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrportal.dao.EmployeeDAO;
import com.hrportal.dos.EmployeeDO;

/**
 * Servlet implementation class AddEmployeeServlet
 */
public class AddOrUpdateEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrUpdateEmployeeServlet() {
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
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String email = request.getParameter("email");
	String address = request.getParameter("address").trim();
	char sex = request.getParameter("gender").charAt(0);

	int dobDate = Integer.parseInt(request.getParameter("dob_date"));
	int dobMonth = Integer.parseInt(request.getParameter("dob_month"));
	int dobYear = Integer.parseInt(request.getParameter("dob_year"));

	EmployeeDO employeeDO = new EmployeeDO();
	employeeDO.setAddress(address);
	employeeDO.setAge(age);

	Calendar cal = Calendar.getInstance();
	cal.set(dobYear, dobMonth, dobDate);
	employeeDO.setDob(new java.sql.Date(cal.getTime().getTime()));
	employeeDO.setEmail(email);
	employeeDO.setName(name);
	employeeDO.setSex(sex);

	String message = "";
	EmployeeDAO dao = new EmployeeDAO();
	// Request is for insert new Employee to Database
	if (id == null) {
	    dao.add(employeeDO);
	    message = "Employee " + name + " is added successfully";
	}
	// Request is for update existing employee in Database
	else {
	    employeeDO.setId(Integer.parseInt(id));
	    dao.update(employeeDO);
	    message = "Employee ID " + id + " - " + name + " is updated successfully";
	}
	try {
	    request.getSession().setAttribute("message", message);
	    response.sendRedirect("view_employee.jsp");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
