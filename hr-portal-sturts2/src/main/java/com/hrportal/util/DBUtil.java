package com.hrportal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

    private static Connection con;
    private static Statement st;

    private static Connection establishConnection() throws SQLException {
	String host = PropertyFileReader.getProperty(PropertyFileReader.DB_HOST);
	String port = PropertyFileReader.getProperty(PropertyFileReader.DB_PORT);
	String dbName = PropertyFileReader.getProperty(PropertyFileReader.DB_NAME);
	String dbUser = PropertyFileReader.getProperty(PropertyFileReader.DB_USERNAME);
	String dbPassword = PropertyFileReader.getProperty(PropertyFileReader.DB_PASSWORD);
	try {
	    String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
	    Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(url, dbUser, dbPassword);
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	return con;
    }

    public static Statement getStatement() throws SQLException {
	if (con == null || con.isClosed()) {
	    con = establishConnection();
	}
	st = con.createStatement();
	return st;
    }

    public static void closeAll() throws SQLException {
	if (st != null)
	    st.close();
	if (con != null)
	    con.close();
    }

}
