
SELECT book.title
FROM book_order JOIN book ON book.idbook = book_order.book_copy_idbook_copy
WHERE '30-09-2001' >= book_order.CREATED_AT AND
        '30-09-2001' <= book_order.CLOSED_AT
GROUP BY book.title
ORDER BY COUNT(book_order.book_copy_idbook_copy) DESC
LIMIT 1;


SELECT book.title
FROM book_order JOIN book ON book.idbook = book_order.book_copy_idbook_copy
WHERE '30-09-2001' >= book_order.CREATED_AT AND
        '30-09-2001' <= book_order.CLOSED_AT
GROUP BY book.title
ORDER BY COUNT(book_order.book_copy_idbook_copy)
LIMIT 1;
