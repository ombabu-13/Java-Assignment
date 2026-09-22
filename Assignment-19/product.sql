CREATE DATABASE IF NOT EXISTS college;

USE college;

CREATE TABLE IF NOT EXISTS product(
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO product VALUES
(101,'Laptop',10,65000),
(102,'Keyboard',25,1200),
(103,'Mouse',30,700),
(104,'Headphones',15,1800);

SELECT * FROM product;