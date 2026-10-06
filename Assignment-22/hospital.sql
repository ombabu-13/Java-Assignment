CREATE DATABASE IF NOT EXISTS hospital_db;
USE hospital_db;

CREATE TABLE IF NOT EXISTS hospital_staff(
    staff_id INT PRIMARY KEY,
    staff_type VARCHAR(30),
    password VARCHAR(50)
);

INSERT INTO hospital_staff VALUES
(101,'Doctor','doc123'),
(102,'Nurse','nurse123'),
(103,'Doctor','doctor456'),
(104,'Nurse','nurse456');