CREATE DATABASE college;

USE college;

CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks INT
);

INSERT INTO student VALUES
(101,'Ombabu Rauniyar','Computer Science',85),
(102,'Rahul Sharma','Computer Science',78),
(103,'Aryan Singh','Information Technology',88),
(104,'Rohan Patil','Computer Science',81);