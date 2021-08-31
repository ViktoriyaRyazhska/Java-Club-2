SELECT book.title, book.year, book.description, book.copies, book.available FROM book
JOIN bookauthor b on book.id = b.BookId
JOIN author a on a.id = b.AuthorId
WHERE a.Name = 'Homer S';