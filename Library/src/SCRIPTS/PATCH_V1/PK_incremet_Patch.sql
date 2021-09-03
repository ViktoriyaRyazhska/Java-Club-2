ALTER TABLE authors_books
    DROP FOREIGN KEY fk_autor_has_book_autor;
ALTER TABLE author
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE authors_books
    ADD FOREIGN KEY (author_id) REFERENCES author (id);

ALTER TABLE authors_books
    DROP FOREIGN KEY fk_autor_has_book_book1;
ALTER TABLE book_copy
    DROP FOREIGN KEY fk_book_copy_book1;
ALTER TABLE requests
    DROP FOREIGN KEY requests_ibfk_1;
ALTER TABLE book
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE authors_books
    ADD FOREIGN KEY (book_id) REFERENCES book (id);
ALTER TABLE book_copy
    ADD FOREIGN KEY (book_id) REFERENCES book (id);
ALTER TABLE requests
    ADD FOREIGN KEY (book_id) REFERENCES book (id);

ALTER TABLE book_order
    DROP FOREIGN KEY fk_bookBorrow_book_copy1;
ALTER TABLE book_copy
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE book_order
    ADD FOREIGN KEY (book_copy_id) REFERENCES book_copy (id);

ALTER TABLE book_order
    MODIFY id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE book_copy
    DROP FOREIGN KEY fk_book_copy_book_status1;
ALTER TABLE book_status
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE book_copy
    ADD FOREIGN KEY (book_status_id) REFERENCES book_status (id);

ALTER TABLE book
    DROP FOREIGN KEY fk_book_genre1;
ALTER TABLE genre
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE book
    ADD FOREIGN KEY (genre_id) REFERENCES genre (id);

ALTER TABLE requests
    MODIFY id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE user
    DROP FOREIGN KEY user_ibfk_1;
ALTER TABLE role
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE user
    ADD FOREIGN KEY (role_id) REFERENCES role (id);

ALTER TABLE book_order
    DROP FOREIGN KEY book_order_ibfk_1;
ALTER TABLE user
    MODIFY id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE book_order
    ADD FOREIGN KEY (user_id) REFERENCES user (id);