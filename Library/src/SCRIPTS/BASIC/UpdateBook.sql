
UPDATE book
SET publicationDate = '2021-01-01'
WHERE title = 'Some name';

UPDATE book
    INNER JOIN autor_has_book ON book.idbook = autor_has_book.book_idbook
    INNER JOIN autor on autor_has_book.autor_idautor = autor.idautor
SET title = 'Some title', description = 'some description'
WHERE autor.firstName = 'John' AND autor.lastName = 'Stone';

