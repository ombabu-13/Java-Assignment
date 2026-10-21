CREATE DATABASE IF NOT EXISTS bookissue_db;
USE bookissue_db;

CREATE TABLE IF NOT EXISTS book_issue(
    issue_id INT PRIMARY KEY,
    book_id INT,
    student_name VARCHAR(100),
    issue_date DATE,
    return_date DATE
);

INSERT IGNORE INTO book_issue VALUES
(1,101,'Ombabu Rauniyar','2026-10-01','2026-10-15'),
(2,102,'Rahul Sharma','2026-10-02','2026-10-16'),
(3,103,'Aryan Singh','2026-10-03','2026-10-17'),
(4,104,'Rohan Patil','2026-10-04','2026-10-18');