CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

CREATE TABLE IF NOT EXISTS login(
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

INSERT INTO login VALUES
('ombabu','java123'),
('rahul','rahul123'),
('aryan','aryan123'),
('rohan','rohan123');