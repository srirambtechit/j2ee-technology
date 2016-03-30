package com.hrportal.util;

public class DateUtil {

    public static java.sql.Date toSqlDate(java.util.Date date) {
	if (date == null)
	    return null;
	return new java.sql.Date(date.getTime());
    }

    public static java.util.Date toDate(java.sql.Date date) {
	if (date == null)
	    return null;
	return new java.util.Date(date.getTime());
    }

}
