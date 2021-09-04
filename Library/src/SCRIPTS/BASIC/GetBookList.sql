SELECT book.id, book.title, book.description, book.publicationYear,
       (SELECT COUNT(copy.id) FROM book_copy_table AS copy WHERE book.id = copy.book_id AND copy.book_status='available') AS count,
       IF ((SELECT COUNT(copy.id) FROM book_copy_table AS copy WHERE book.id = copy.book_id AND copy.book_status='available') > 0, 'available', 'unavailable') AS status,
       (SELECT GROUP_CONCAT(firstName+lastName)
        FROM author_table AS author, author_books_table AS bookauthor
        WHERE book.id=bookauthor.book_id AND author.id=bookauthor.author_id
        ) as "authors"
FROM book_table as book;