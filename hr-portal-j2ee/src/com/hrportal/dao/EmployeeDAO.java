package com.hrportal.dao;

import com.hrportal.dos.EmployeeDO;

public interface EmployeeDAO {

	public boolean add(EmployeeDO employeeDO);

	public boolean update(EmployeeDO employeeDO);

	public boolean delete(int id);

	public EmployeeDO fetch(int id);

}
