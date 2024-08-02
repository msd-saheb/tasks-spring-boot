-- Create table
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Insert data
INSERT INTO users (username, password, email) VALUES ('john_doe', 'password123', 'john.doe@example.com');
INSERT INTO users (username, password, email) VALUES ('jane_doe', 'password456', 'jane.doe@example.com');
