package com.hrportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrportal.dos.EmployeeDO;
import com.hrportal.util.DBUtil;

public class EmployeeDAO {

    public boolean add(EmployeeDO employeeDO) {
	try {
	    //@formatter:off
	    String sql = "INSERT INTO employee (name, email, address, age, sex, dob) VALUES" 
		    + " ('"
		    + employeeDO.getName() 
		    + "', '" 
		    + employeeDO.getEmail() 
		    + "', '" 
		    + employeeDO.getAddress() 
		    + "', '" 
		    + employeeDO.getAge() 
		    + "', '" 
		    + employeeDO.getSex() 
		    + "', '" 
		    + employeeDO.getDob() 
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

    public EmployeeDO fetch(int id) {
	try {
	    String sql = "SELECT * FROM employee where id = " + id;

	    System.out.println(sql);

	    ResultSet rs = DBUtil.getStatement().executeQuery(sql);
	    EmployeeDO employeeDO = new EmployeeDO();
	    while (rs.next()) {
		employeeDO.setId(rs.getInt(1));
		employeeDO.setName(rs.getString(2));
		employeeDO.setEmail(rs.getString(3));
		employeeDO.setAddress(rs.getString(4));
		employeeDO.setAge(rs.getInt(5));
		employeeDO.setSex(rs.getString(6).charAt(0));
		employeeDO.setDob(rs.getDate(7));
	    }
	    return employeeDO;
	} catch (SQLException e) {
	    e.printStackTrace();
	    return null;
	} finally {
	    try {
		DBUtil.closeAll();
	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
    }

    public boolean update(EmployeeDO employeeDO) {
	try {
	    //@formatter:off
   	    String sql = "UPDATE employee SET "
                + "name = '"
                + employeeDO.getName() 
                + "', email = '" 
                + employeeDO.getEmail()
                + "', address = '"
                + employeeDO.getAddress()
                + "', age = '"
                + employeeDO.getAge()
                + "', sex = '"
                + employeeDO.getSex()
                + "', dob = '"
                + employeeDO.getDob()
                + "' WHERE id = " 
                + employeeDO.getId();
   	    
	    System.out.println(sql);
   	    
   	    //@formatter:on
	    boolean updated = DBUtil.getStatement().execute(sql);
	    return updated;
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

    public boolean delete(int id) {
	try {
	    String sql = "DELETE FROM employee WHERE id = " + id;

	    System.out.println(sql);

	    boolean deleted = DBUtil.getStatement().execute(sql);
	    return deleted;
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
