
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`autor` (
  `idautor` INT NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idautor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`genre` (
  `idgenre` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idgenre`),
  UNIQUE INDEX `title_UNIQUE` (`title` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`book` (
  `idbook` INT NOT NULL,
  `title` VARCHAR(255) NULL DEFAULT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  `is_deleted` TINYINT NULL DEFAULT NULL,
  `publicationDate` DATE NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `genre_idgenre` INT NOT NULL,
  PRIMARY KEY (`idbook`),
  INDEX `fk_book_genre1_idx` (`genre_idgenre` ASC) VISIBLE,
  CONSTRAINT `fk_book_genre1`
    FOREIGN KEY (`genre_idgenre`)
    REFERENCES `mydb`.`genre` (`idgenre`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`autor_has_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`autor_has_book` (
  `autor_idautor` INT NOT NULL,
  `book_idbook` INT NOT NULL,
  `co_autor` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`autor_idautor`, `book_idbook`),
  INDEX `fk_autor_has_book_book1_idx` (`book_idbook` ASC) VISIBLE,
  INDEX `fk_autor_has_book_autor_idx` (`autor_idautor` ASC) VISIBLE,
  CONSTRAINT `fk_autor_has_book_autor`
    FOREIGN KEY (`autor_idautor`)
    REFERENCES `mydb`.`autor` (`idautor`),
  CONSTRAINT `fk_autor_has_book_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `mydb`.`book` (`idbook`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`book_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`book_status` (
  `idbook_status` INT NOT NULL,
  `title` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idbook_status`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`book_copy`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`book_copy` (
  `idbook_copy` INT NOT NULL,
  `book_idbook` INT NOT NULL,
  `book_status_idbook_status` INT NOT NULL,
  `is_deleted` VARCHAR(45) NULL,
  PRIMARY KEY (`idbook_copy`),
  INDEX `fk_book_copy_book1_idx` (`book_idbook` ASC) VISIBLE,
  INDEX `fk_book_copy_book_status1_idx` (`book_status_idbook_status` ASC) VISIBLE,
  CONSTRAINT `fk_book_copy_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `mydb`.`book` (`idbook`),
  CONSTRAINT `fk_book_copy_book_status1`
    FOREIGN KEY (`book_status_idbook_status`)
    REFERENCES `mydb`.`book_status` (`idbook_status`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`order_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`order_status` (
  `idorder_status` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  PRIMARY KEY (`idorder_status`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`book_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`book_order` (
  `idbookBorrow` INT NOT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `CLOSED_AT` TIMESTAMP NULL DEFAULT NULL,
  `expected_return_time` DATE NULL DEFAULT NULL,
  `book_copy_idbook_copy` INT NOT NULL,
  `is_deleted` VARCHAR(45) NULL,
  `order_status_idorder_status` INT NOT NULL,
  `reader_take_at` DATE NULL,
  PRIMARY KEY (`idbookBorrow`),
  INDEX `fk_bookBorrow_book_copy1_idx` (`book_copy_idbook_copy` ASC) VISIBLE,
  INDEX `fk_book_order_order_status1_idx` (`order_status_idorder_status` ASC) VISIBLE,
  CONSTRAINT `fk_bookBorrow_book_copy1`
    FOREIGN KEY (`book_copy_idbook_copy`)
    REFERENCES `mydb`.`book_copy` (`idbook_copy`),
  CONSTRAINT `fk_book_order_order_status1`
    FOREIGN KEY (`order_status_idorder_status`)
    REFERENCES `mydb`.`order_status` (`idorder_status`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`role` (
  `idrole` INT NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idrole`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `idUser` INT NOT NULL,
  `firstName` VARCHAR(45) NULL DEFAULT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `passwod` VARCHAR(255) NOT NULL,
  `birthdate` DATE NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATE_AT` TIMESTAMP NULL DEFAULT NULL,
  `bookBorrow_idbookBorrow` INT NOT NULL,
  `role_idrole` INT NOT NULL,
  `is_deleted` TINYINT NULL,
  PRIMARY KEY (`idUser`, `lastName`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_person_bookBorrow1_idx` (`bookBorrow_idbookBorrow` ASC) VISIBLE,
  INDEX `fk_person_role1_idx` (`role_idrole` ASC) VISIBLE,
  CONSTRAINT `fk_person_bookBorrow1`
    FOREIGN KEY (`bookBorrow_idbookBorrow`)
    REFERENCES `mydb`.`book_order` (`idbookBorrow`),
  CONSTRAINT `fk_person_role1`
    FOREIGN KEY (`role_idrole`)
    REFERENCES `mydb`.`role` (`idrole`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
