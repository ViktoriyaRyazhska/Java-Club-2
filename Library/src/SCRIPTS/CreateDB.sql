CREATE DATABASE IF NOT EXISTS library;

CREATE TABLE IF NOT EXISTS Role (
      id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(32) not null
);

Create TABLE IF NOT EXISTS User (
      id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
      firstName VARCHAR(32) not null,
      lastName VARCHAR(32) not null,
      email VARCHAR(64) not null unique,
      password VARCHAR(64) not null,
      birth DATE not null
);

CREATE TABLE IF NOT EXISTS UserRole (
      UserID INTEGER,
      RoleID INTEGER,
      FOREIGN KEY (UserId) REFERENCES User (id),
      FOREIGN KEY (RoleId) REFERENCES Role (id)
);

CREATE TABLE IF NOT EXISTS Author (
    id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(64) not null
);

CREATE TABLE IF NOT EXISTS Book (
    id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128) not null,
    description VARCHAR(512),
    year INTEGER not null,
    copies INTEGER not null DEFAULT 0,
    available INTEGER not null DEFAULT 0
);

CREATE TABLE IF NOT EXISTS BookAuthor (
        BookId INTEGER,
        AuthorId INTEGER,
        FOREIGN KEY (BookId) REFERENCES Book (id),
        FOREIGN KEY (AuthorId) REFERENCES Author (id)
);

CREATE TABLE IF NOT EXISTS HISTORY (
     UserID INTEGER,
     BookID INTEGER,
     dateBorrowed DATETIME,
     dateReturned DATETIME,
     deadLine DATETIME,
     approved BOOLEAN not null DEFAULT FALSE,
     FOREIGN KEY (UserID) REFERENCES User (id),
     FOREIGN KEY (BookID) REFERENCES Book (id)
); 
