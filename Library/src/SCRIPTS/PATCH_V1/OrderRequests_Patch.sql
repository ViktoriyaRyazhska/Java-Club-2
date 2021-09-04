CREATE TABLE IF NOT EXISTS requests (
    id INT PRIMARY KEY NOT NULL,
    book_id INT,
    user_id INT,
    isOpen BOOLEAN,
    FOREIGN KEY (book_id) REFERENCES book (id),
    FOREIGN KEY (user_id) REFERENCES user (id)
); -- for user requests