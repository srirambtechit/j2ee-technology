package com.hrportal.dos;

import java.io.Serializable;

public class DepartmentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private char category;

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

    public char getCategory() {
	return category;
    }

    public void setCategory(char category) {
	this.category = category;
    }

}
