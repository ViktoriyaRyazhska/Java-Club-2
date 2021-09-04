SELECT AVG(DATEDIFF( book_order.CLOSED_AT, book_order.CREATED_AT)) as Average_Reading_Time,
       book.title, book.description, book.publicationDate, book_copy.book_idbook, book_copy.book_status_idbook_status,
        user.firstName, user.lastName
FROM book_order
         JOIN book ON book.idbook = book_order.book_copy_idbook_copy
         JOIN book_copy ON book.idbook = book_copy.book_idbook
         JOIN user ON book_order.user_idUser = user.idUser and book_order.user_lastName = user.lastName
    WHERE book_order.CLOSED_AT IS NOT NULL;