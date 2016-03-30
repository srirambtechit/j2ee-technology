CREATE DATABASE hrdb;

USE hrdb;

CREATE TABLE employee(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	name VARCHAR(50), 
	email VARCHAR(200), 
	address VARCHAR(1500), 
	age INT, 
	sex VARCHAR(1), 
	dob DATE
);

CREATE TABLE department(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100), 
	category VARCHAR(1)
);

CREATE TABLE emp_dept_assignment_xref (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	employee_id INT, 
	dept_id INT, 
	CONSTRAINT `edax_emp_id_fk` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`), 
	CONSTRAINT `edax_dept_id_fk` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`)
);














