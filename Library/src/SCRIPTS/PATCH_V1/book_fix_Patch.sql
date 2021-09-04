ALTER TABLE book
    MODIFY COLUMN title VARCHAR(255) NOT NULL,
    MODIFY COLUMN description VARCHAR(255) NOT NULL,
    MODIFY COLUMN is_deleted BOOLEAN NOT NULL DEFAULT FALSE,
    MODIFY COLUMN publicationDate YEAR NOT NULL,
    MODIFY COLUMN CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    MODIFY COLUMN UPDATATED_AT TIMESTAMP,
    MODIFY COLUMN genre_id INT DEFAULT NULL;