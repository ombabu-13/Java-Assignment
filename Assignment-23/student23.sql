CREATE DATABASE IF NOT EXISTS college;
USE college;
CREATE TABLE IF NOT EXISTS student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks INT
);
INSERT INTO student VALUES
(1,'Ombabu Rauniyar','CSE',90),
(2,'Rahul Sharma','IT',85),
(3,'Aryan Singh','ECE',88),
(4,'Rohan Patil','CSE',92);