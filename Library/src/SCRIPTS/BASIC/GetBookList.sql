SELECT book.id, book.title, book.description, book.year, book.copies, book.available,
       (SELECT GROUP_CONCAT(Name)
        FROM author, bookauthor
        WHERE book.id=bookauthor.BookId AND author.id=AuthorId
        ) as "authors"
FROM book;
#concat((SELECT Name FROM author JOIN bookauthor b on author.id = b.AuthorId JOIN library.book b2 on b2.id = b.BookId), '<-', GROUP_CONCAT('Name' ORDER BY 'Name' DESC SEPARATOR '<-')) AS author #author.Name as "author"
# INNER JOIN author JOIN bookauthor b on book.id = b.BookId and author.id = b.AuthorId;

/*
INNER JOIN author JOIN bookauthor b on book.id = b.BookId and author.id = b.AuthorId
GROUP BY book.id;
 */
/*
SELECT ba.AuthorId, a.name AS author_name, b.title
FROM
    bookauthor ba JOIN book b ON ba.BookId = b.id
                   JOIN author a ON ba.AuthorId = a.id
WHERE
        b.id IN (SELECT c.BookId
                      FROM bookauthor c
                      GROUP BY c.BookId
                      HAVING count(c.BookId) >= 2);
SELECT b.Id, b.title, COUNT(*) as num_authors
FROM bookauthor ba JOIN
     book b
     ON ba.BookId = b.id
GROUP BY b.id, b.title
HAVING COUNT(*) >= 2;
 */
