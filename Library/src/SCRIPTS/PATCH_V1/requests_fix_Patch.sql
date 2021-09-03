ALTER TABLE requests
    RENAME COLUMN book_id TO book_copy_id,
    DROP FOREIGN KEY requests_ibfk_3,
    ADD FOREIGN KEY (book_copy_id) REFERENCES book_copy (id);