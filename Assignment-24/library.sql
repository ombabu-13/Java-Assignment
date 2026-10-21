CREATE DATABASE IF NOT EXISTS library_db;
USE library_db;

CREATE TABLE IF NOT EXISTS books(
    book_id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE
);

INSERT IGNORE INTO books VALUES
(101,'Effective Java','Joshua Bloch',750),
(102,'Clean Code','Robert Martin',650),
(103,'Java Programming','Herbert Schildt',550),
(104,'The Alchemist','Paulo Coelho',400);