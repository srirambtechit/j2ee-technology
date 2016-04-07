package com.hrportal.actions;

import java.sql.Date;
import java.util.Calendar;

import com.hrportal.dao.EmployeeDAO;
import com.hrportal.dos.EmployeeDO;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private int age;
	private String address;
	private int gender;
	private int date;
	private int month;
	private int year;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() throws Exception {

		EmployeeDO employeeDO = new EmployeeDO();
		employeeDO.setAddress(address);
		employeeDO.setAge(age);

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		employeeDO.setDob(new java.sql.Date(cal.getTime().getTime()));
		employeeDO.setEmail(email);
		employeeDO.setName(name);
		if (gender == 1)
			employeeDO.setSex('M');
		else
			employeeDO.setSex('F');

		String message = "";
		EmployeeDAO dao = new EmployeeDAO();
		// Request is for insert new Employee to Database
		if (id == 0) {
			dao.add(employeeDO);
			message = "Employee " + name + " is added successfully";
		}
		// Request is for update existing employee in Database
		else {
			employeeDO.setId(id);
			dao.update(employeeDO);
			message = "Employee ID " + id + " - " + name
					+ " is updated successfully";
		}
		addActionMessage(message);
		return SUCCESS;
	}

	public String editEmployee() {
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDO employeeDO = dao.fetch(id);
		setId(employeeDO.getId());
		setName(employeeDO.getName());
		setAge(employeeDO.getAge());
		setAddress(employeeDO.getAddress());
		setEmail(employeeDO.getEmail());
		if (employeeDO.getSex() == 'M')
			setGender(1);
		else
			setGender(2);
		Date dob = employeeDO.getDob();
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(dob.getTime());

		setDate(c.get(Calendar.DATE));
		setMonth(c.get(Calendar.MONTH) + 1);
		setYear(c.get(Calendar.YEAR));

		return "employeeForm";
	}

	public String deleteEmployee() {
		EmployeeDAO dao = new EmployeeDAO();
		dao.delete(id);
		addActionMessage("Employee ID " + id + " has been deleted successfully");
		return SUCCESS;
	}

}
