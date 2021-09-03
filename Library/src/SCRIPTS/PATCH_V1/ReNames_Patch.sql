ALTER TABLE autor
    RENAME author,
    RENAME COLUMN idautor TO id;

ALTER TABLE autor_has_book
    RENAME authors_books,
    RENAME COLUMN autor_idautor TO author_id,
    RENAME COLUMN book_idbook TO book_id,
    RENAME COLUMN co_autor TO isMainAuthor;

ALTER TABLE book
    RENAME COLUMN idbook TO id,
    RENAME COLUMN genre_idgenre TO genre_id;

ALTER TABLE book_copy
    RENAME COLUMN idbook_copy TO id,
    RENAME COLUMN book_idbook TO book_id,
    RENAME COLUMN book_status_idbook_status TO book_status_id;

ALTER TABLE book_order
    RENAME COLUMN idbookBorrow TO id,
    RENAME COLUMN book_copy_idbook_copy TO book_copy_id,
    RENAME COLUMN user_idUser TO user_id;

ALTER TABLE book_status
    RENAME COLUMN idbook_status TO id,
    RENAME COLUMN title TO status;

ALTER TABLE genre
    RENAME COLUMN idgenre TO id,
    RENAME COLUMN title TO genre;

ALTER TABLE role
    RENAME COLUMN idrole TO id,
    RENAME COLUMN description TO role;

ALTER TABLE user
    RENAME COLUMN idUser TO id,
    RENAME COLUMN role_idrole TO role_id;