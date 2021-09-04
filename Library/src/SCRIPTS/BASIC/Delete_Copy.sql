UPDATE book_copy
SET book_status_id = (SELECT id FROM book_status WHERE status='deleted')
WHERE id=0;