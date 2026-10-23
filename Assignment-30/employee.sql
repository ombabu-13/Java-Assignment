CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;
CREATE TABLE IF NOT EXISTS employee(
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DOUBLE
);
INSERT IGNORE INTO employee VALUES
(101,'Ombabu Rauniyar','CSE',25000),
(102,'Rahul Sharma','IT',30000),
(103,'Aryan Singh','ECE',28000),
(104,'Rohan Patil','CSE',32000);