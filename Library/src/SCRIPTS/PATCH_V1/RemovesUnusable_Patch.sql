ALTER TABLE book_copy
    DROP COLUMN is_deleted;

ALTER TABLE book_order
    DROP COLUMN is_deleted,
    DROP COLUMN order_status_idorder_status,
    DROP COLUMN reader_take_at,
    DROP INDEX fk_book_order_order_status1_idx,
    DROP INDEX fk_book_order_user1_idx,
    ADD FOREIGN KEY (user_id) REFERENCES user (id),
    DROP COLUMN user_lastName;

DROP TABLE order_status;