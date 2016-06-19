package com.hrportal.actions;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.hrportal.dao.impl.DepartmentDAOImpl;
import com.hrportal.dao.impl.EmployeeDepartmentAssignmentDAOImpl;
import com.hrportal.dos.DepartmentDO;
import com.hrportal.dos.EmployeeDepartmentAssignmentDO;
import com.opensymphony.xwork2.ActionSupport;

public class DepartmentAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private char type;

	private int employeeId;

	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

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

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Action used for insert and update scenario of department
	 * 
	 * @return
	 */
	public String actionDepartment() {
		// when id is null, it is new record, otherwise this request will be for
		// update

		DepartmentDO deptDO = new DepartmentDO();
		deptDO.setName(name);
		deptDO.setCategory(type);
		DepartmentDAOImpl dao = new DepartmentDAOImpl();

		String message;
		if (id == 0) {
//			dao.add(deptDO);
			message = "Department " + name + " is added successfully";
		} else {
			deptDO.setId(id);
			dao.update(deptDO);
			message = "Department ID " + id + " - " + name
					+ " is updated successfully";
		}
		addActionMessage(message);
		return SUCCESS;
	}

	public String editDepartment() {
		DepartmentDAOImpl dao = new DepartmentDAOImpl();
		DepartmentDO deptDO = dao.fetch(id);
		setId(deptDO.getId());
		setName(deptDO.getName());
		setType(deptDO.getCategory());
		return "departmentForm";
	}

	public String deleteDepartment() {
		DepartmentDAOImpl dao = new DepartmentDAOImpl();
		dao.delete(id);
		addActionMessage("Dept ID " + id + " has been deleted successfully");
		return SUCCESS;
	}

	public String assignDepartment() {
		String[] employeeIds = request.getParameterValues("employee_id");
		EmployeeDepartmentAssignmentDAOImpl dao = new EmployeeDepartmentAssignmentDAOImpl();
		if (employeeIds != null) {
			EmployeeDepartmentAssignmentDO empDeptDO = new EmployeeDepartmentAssignmentDO();
			for (String empId : employeeIds) {
				empDeptDO.setDepartmentId(id);
				empDeptDO.setEmployeeId(Integer.parseInt(empId));
				dao.add(empDeptDO);
			}
		}
		addActionMessage("Emp ID" + Arrays.toString(employeeIds)
				+ " has been assigned with Dept ID[" + id + "] successfully");
		return SUCCESS;
	}

}
