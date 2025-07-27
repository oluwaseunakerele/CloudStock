CREATE DATABASE IF NOT EXISTS cloudstock;
USE cloudstock;

CREATE TABLE IF NOT EXISTS item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL
);

INSERT INTO item (name, quantity, price) VALUES
('Laptop', 10, 899.99),
('Keyboard', 25, 29.99),
('Mouse', 30, 19.99),
('Monitor', 15, 199.99),
('USB Cable', 50, 5.99);
