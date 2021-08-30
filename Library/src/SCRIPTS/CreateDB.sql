CREATE DATABASE IF NOT EXISTS library;

CREATE TABLE IF NOT EXISTS Role (
      id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
      name CHAR(30) not null
);

Create TABLE IF NOT EXISTS User (
      id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
      firstName CHAR(30) not null,
      lastName CHAR(30) not null,
      email CHAR(30) not null unique,
      password CHAR(30) not null,
      birth DATE not null
);

CREATE TABLE IF NOT EXISTS UserRole (
      UserID INTEGER,
      RoleID INTEGER,
      FOREIGN KEY (UserId) REFERENCES User (id),
      FOREIGN KEY (RoleId) REFERENCES Role (id)
);

CREATE TABLE IF NOT EXISTS Book (
      id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
      title CHAR(30) not null,
      description TEXT,
      year INTEGER not null,
      copies INTEGER not null,
      available INTEGER not null
);

CREATE TABLE IF NOT EXISTS Author (
    id INTEGER Not Null AUTO_INCREMENT PRIMARY KEY,
    firstName CHAR(30) not null,
    lastName CHAR(30) not null
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
     dateBorrowed DATETIME DEFAULT CURRENT_TIMESTAMP,
     dateReturned DATETIME DEFAULT null ON UPDATE CURRENT_TIMESTAMP,
     deadLine DATETIME,
     FOREIGN KEY (UserID) REFERENCES User (id),
     FOREIGN KEY (BookID) REFERENCES Book (id)
);