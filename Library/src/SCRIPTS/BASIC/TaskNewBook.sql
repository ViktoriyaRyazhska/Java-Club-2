INSERT INTO book(title, description, publicationDate)
VALUE ('HARRY POTTER 1', 'COOL', 2001);

INSERT INTO author(firstName, lastName)
VALUE ('J.K.', 'ROWLING');

INSERT INTO authors_books(AUTHOR_ID, BOOK_ID, ISMAINAUTHOR)
VALUE (1,1,TRUE);

INSERT INTO book_status(status)
VALUE ('available'), ('unavailable'), ('deleted');

INSERT INTO book_copy(BOOK_ID)
VALUES (1), (1), (1);