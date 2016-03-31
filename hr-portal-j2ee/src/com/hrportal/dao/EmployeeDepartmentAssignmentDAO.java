package com.hrportal.dao;

import java.sql.SQLException;

import com.hrportal.dos.EmployeeDepartmentAssignmentDO;
import com.hrportal.util.DBUtil;

public class EmployeeDepartmentAssignmentDAO {

    public boolean add(EmployeeDepartmentAssignmentDO empDeptAssgnDO) {
	try {
	    //@formatter:off
	    String sql = "INSERT INTO emp_dept_assignment_xref (employee_id, dept_id) VALUES" 
		    + " ('"
		    + empDeptAssgnDO.getEmployeeId()
		    + "', '" 
		    + empDeptAssgnDO.getDepartmentId()
		    + "') ";
	    
	    System.out.println(sql);
	    
	    //@formatter:on
	    boolean inserted = DBUtil.getStatement().execute(sql);
	    return inserted;
	} catch (SQLException e) {
	    e.printStackTrace();
	    return false;
	} finally {
	    try {
		DBUtil.closeAll();
	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
    }

}
