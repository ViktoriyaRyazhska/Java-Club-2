SELECT title
FROM book
JOIN requests r
JOIN book_copy bc ON r.user_id = 1
AND r.book_copy_id = bc.id
AND bc.book_id = book.id;



SELECT DATEDIFF( CURRENT_TIMESTAMP, CREATED_AT)
FROM user
WHERE user.id = 1;






