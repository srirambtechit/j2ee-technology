package com.hrportal.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrportal.util.DBUtil;

public class Main {

    public static void main(String[] args) throws SQLException {
	System.out.println("Query department table");
	ResultSet rs = DBUtil.getStatement().executeQuery("select * from department");
	while (rs.next()) {
	    System.out.println(rs.getString(2));
	}
	DBUtil.closeAll();

	rs = DBUtil.getStatement().executeQuery("select * from employee");
	System.out.println("Query employee table");
	while (rs.next()) {
	    System.out.println(rs.getString(2));
	}
	rs.close();
	DBUtil.closeAll();
    }

}
