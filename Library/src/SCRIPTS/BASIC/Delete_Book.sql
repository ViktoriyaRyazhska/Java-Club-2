UPDATE book
SET is_deleted=TRUE
WHERE id=0;

UPDATE book_copy
SET book_status_id = (SELECT id FROM book_status WHERE status='deleted')
WHERE book_id=0;