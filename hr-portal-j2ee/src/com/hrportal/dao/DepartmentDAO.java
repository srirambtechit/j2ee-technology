package com.hrportal.dao;

import com.hrportal.dos.DepartmentDO;

public interface DepartmentDAO {

	public boolean add(DepartmentDO departmentDO);

	public boolean update(DepartmentDO departmentDO);

	public boolean delete(int id);

	public DepartmentDO fetch(int id);
	
}
