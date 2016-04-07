package com.hrportal.dos;

import java.io.Serializable;

public class EmployeeDepartmentAssignmentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int employeeId;
    private int departmentId;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
    }

    public int getDepartmentId() {
	return departmentId;
    }

    public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
    }

}
