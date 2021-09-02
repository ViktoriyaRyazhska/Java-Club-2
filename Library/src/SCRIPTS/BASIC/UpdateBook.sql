UPDATE book
SET year = 2001
WHERE title = 'Some name';

UPDATE book
SET copies = 3, description = 'some description'
WHERE id = 4;

UPDATE book
    INNER JOIN bookauthor ON book.id = bookauthor.BookId
    INNER JOIN author on author.id = bookauthor.AuthorId
SET book.description = 'some description'
    WHERE author.Name = 'John Stone';