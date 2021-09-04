SELECT book.title,  book_copy.id, book_status.status
FROM book_status, book_copy, book
WHERE book_copy.book_id = book.id AND book.id = 1 AND book_copy.book_status_id = book_status.id;
