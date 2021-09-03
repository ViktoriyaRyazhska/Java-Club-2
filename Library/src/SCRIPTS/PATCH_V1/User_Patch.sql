-- unable to fix - recreate
ALTER TABLE book_order
    DROP FOREIGN KEY fk_book_order_user1,
    DROP FOREIGN KEY fk_book_order_order_status1;

DROP TABLE user;

CREATE TABLE user (
    id INT NOT NULL PRIMARY KEY,
    firstName VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    birthdate DATE,
    CREATED_AT DATE,
    UPDATED_AT DATE,
    role_id INT,
    is_deleted BOOLEAN,
    FOREIGN KEY (role_id) REFERENCES role (id)
);
