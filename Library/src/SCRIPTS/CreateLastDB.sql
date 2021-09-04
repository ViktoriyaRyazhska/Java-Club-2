CREATE DATABASE IF NOT EXISTS library_v2;

CREATE TABLE IF NOT EXISTS genre_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    genre VARCHAR(64) NOT NULL
);

CREATE TABLE IF NOT EXISTS author_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS book_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    description VARCHAR(256) NOT NULL,
    is_deleted BOOLEAN NOT NULL DEFAULT FALSE,
    publicationYear YEAR NOT NULL,
    genre_id INT,
    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    FOREIGN KEY (genre_id) REFERENCES genre_table (id)
);

CREATE TABLE IF NOT EXISTS author_books_table (
    author_id INT NOT NULL,
    book_id INT NOT NULL,
    isMain BOOLEAN NOT NULL DEFAULT TRUE,
    PRIMARY KEY (author_id, book_id),
    FOREIGN KEY (author_id) REFERENCES author_table (id),
    FOREIGN KEY (book_id) REFERENCES book_table (id)
);

CREATE TABLE IF NOT EXISTS book_copy_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book_id INT NOT NULL,
    book_status ENUM('available', 'unavailable', 'deleted', 'lost') NOT NULL DEFAULT 'available',
    FOREIGN KEY (book_id) REFERENCES book_table (id)
);

CREATE TABLE IF NOT EXISTS user_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    role ENUM('reader', 'manager') NOT NULL DEFAULT 'reader',
    firstName VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    birthdate DATE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    is_deleted BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS requests_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book_copy_id INT NOT NULL,
    user_id INT NOT NULL,
    isOpen BOOLEAN NOT NULL DEFAULT TRUE,
    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CLOSED_AT TIMESTAMP,
    FOREIGN KEY (book_copy_id) REFERENCES book_copy_table (id),
    FOREIGN KEY (user_id) REFERENCES user_table (id)
);

CREATE TABLE IF NOT EXISTS book_order_table (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book_copy_id INT NOT NULL,
    user_id INT NOT NULL,
    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CLOSED_AT TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    RETURN_AT TIMESTAMP NOT NULL DEFAULT (CURRENT_TIMESTAMP + INTERVAL 7 DAY),
    FOREIGN KEY (book_copy_id) REFERENCES book_copy_table (id),
    FOREIGN KEY (user_id) REFERENCES user_table (id)
);