CREATE SCHEMA IF NOT EXISTS `library` DEFAULT CHARACTER SET utf8 ;

USE `library` ;

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE TABLE IF NOT EXISTS `library`.`genre` (
      `idgenre` INT NOT NULL,
      `title` VARCHAR(45) NOT NULL,
      PRIMARY KEY (`idgenre`),
      UNIQUE INDEX `title_UNIQUE` (`title` ASC) VISIBLE)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`book` (
                                             `idbook` INT NOT NULL,
                                             `title` VARCHAR(255) NULL,
                                             `description` VARCHAR(255) NULL,
                                             `isDeleted` TINYINT NULL,
                                             `publicationDate` DATE NULL,
                                             `CREATED_AT` TIMESTAMP NULL,
                                             `UPDATATED_AT` TIMESTAMP NULL,
                                             `genre_idgenre` INT NOT NULL,
                                             PRIMARY KEY (`idbook`),
                                             INDEX `fk_book_genre1_idx` (`genre_idgenre` ASC) VISIBLE,
                                             CONSTRAINT `fk_book_genre1`
                                                 FOREIGN KEY (`genre_idgenre`)
                                                     REFERENCES `library`.`genre` (`idgenre`)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`book_status` (
                                                    `idbook_status` INT NOT NULL,
                                                    `title` VARCHAR(45) NULL,
                                                    PRIMARY KEY (`idbook_status`))
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`book_copy` (
                                                  `idbook_copy` INT NOT NULL,
                                                  `book_idbook` INT NOT NULL,
                                                  `book_status_idbook_status` INT NOT NULL,
                                                  PRIMARY KEY (`idbook_copy`),
                                                  INDEX `fk_book_copy_book1_idx` (`book_idbook` ASC) VISIBLE,
                                                  INDEX `fk_book_copy_book_status1_idx` (`book_status_idbook_status` ASC) VISIBLE,
                                                  CONSTRAINT `fk_book_copy_book1`
                                                      FOREIGN KEY (`book_idbook`)
                                                          REFERENCES `library`.`book` (`idbook`)
                                                          ON DELETE NO ACTION
                                                          ON UPDATE NO ACTION,
                                                  CONSTRAINT `fk_book_copy_book_status1`
                                                      FOREIGN KEY (`book_status_idbook_status`)
                                                          REFERENCES `library`.`book_status` (`idbook_status`)
                                                          ON DELETE NO ACTION
                                                          ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`bookBorrow` (
                                                   `idbookBorrow` INT NOT NULL,
                                                   `CREATED_AT` TIMESTAMP NULL,
                                                   `TIME_LIMIT_AT` TIMESTAMP NULL,
                                                   `CLOSED_AT` TIMESTAMP NULL,
                                                   `expected_return_time` DATE NULL,
                                                   `book_copy_idbook_copy` INT NOT NULL,
                                                   PRIMARY KEY (`idbookBorrow`),
                                                   INDEX `fk_bookBorrow_book_copy1_idx` (`book_copy_idbook_copy` ASC) VISIBLE,
                                                   CONSTRAINT `fk_bookBorrow_book_copy1`
                                                       FOREIGN KEY (`book_copy_idbook_copy`)
                                                           REFERENCES `library`.`book_copy` (`idbook_copy`)
                                                           ON DELETE NO ACTION
                                                           ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`role` (
                                             `idrole` INT NOT NULL,
                                             `description` VARCHAR(45) NOT NULL,
                                             PRIMARY KEY (`idrole`),
                                             UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`user` (
                                             `idUser` INT NOT NULL,
                                             `firstName` VARCHAR(45) NULL,
                                             `lastName` VARCHAR(45) NOT NULL,
                                             `email` VARCHAR(255) NOT NULL,
                                             `passwod` VARCHAR(255) NOT NULL,
                                             `birthdate` DATE NULL,
                                             `CREATED_AT` TIMESTAMP NULL,
                                             `UPDATE_AT` TIMESTAMP NULL,
                                             `bookBorrow_idbookBorrow` INT NOT NULL,
                                             `role_idrole` INT NOT NULL,
                                             PRIMARY KEY (`idUser`, `lastName`),
                                             UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
                                             INDEX `fk_person_bookBorrow1_idx` (`bookBorrow_idbookBorrow` ASC) VISIBLE,
                                             INDEX `fk_person_role1_idx` (`role_idrole` ASC) VISIBLE,
                                             CONSTRAINT `fk_person_bookBorrow1`
                                                 FOREIGN KEY (`bookBorrow_idbookBorrow`)
                                                     REFERENCES `library`.`bookBorrow` (`idbookBorrow`)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION,
                                             CONSTRAINT `fk_person_role1`
                                                 FOREIGN KEY (`role_idrole`)
                                                     REFERENCES `library`.`role` (`idrole`)
                                                     ON DELETE NO ACTION
                                                     ON UPDATE NO ACTION)
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`author` (
                                              `idauthor` INT NOT NULL,
                                              `firstName` VARCHAR(45) NOT NULL,
                                              `lastName` VARCHAR(45) NOT NULL,
                                              PRIMARY KEY (`idauthor`))
    ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `library`.`author_has_book` (
                                                       `author_idauthor` INT NOT NULL,
                                                       `book_idbook` INT NOT NULL,
                                                       `is_main_author` BOOLEAN NOT NULL,
                                                       PRIMARY KEY (`author_idauthor`, `book_idbook`),
                                                       INDEX `fk_author_has_book_book1_idx` (`book_idbook` ASC) VISIBLE,
                                                       INDEX `fk_author_has_book_author_idx` (`author_idauthor` ASC) VISIBLE,
                                                       CONSTRAINT `fk_author_has_book_author`
                                                           FOREIGN KEY (`author_idauthor`)
                                                               REFERENCES `library`.`author` (`idauthor`)
                                                               ON DELETE NO ACTION
                                                               ON UPDATE NO ACTION,
                                                       CONSTRAINT `fk_author_has_book_book1`
                                                           FOREIGN KEY (`book_idbook`)
                                                               REFERENCES `library`.`book` (`idbook`)
                                                               ON DELETE NO ACTION
                                                               ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
