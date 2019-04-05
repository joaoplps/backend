SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema war
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `war` DEFAULT CHARACTER SET utf8 ;
USE `war` ;

-- -----------------------------------------------------
-- Table `war`.`continent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `war`.`continent` (
`idcontinent` INT AUTO_INCREMENT,
`name` VARCHAR(45) NULL,
PRIMARY KEY (`idcontinent`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `war`.`army`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `war`.`army` (
`idarmy` INT AUTO_INCREMENT,
`units` INT NULL,
`color` INT NULL,
PRIMARY KEY (`idarmy`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `war`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `war`.`country` (
`idcountry` INT AUTO_INCREMENT,
`name` VARCHAR(45) NULL,
`army` INT,
PRIMARY KEY (`idcountry`),
INDEX `fk_country_army1_idx` (`army` ASC),
CONSTRAINT `fk_country_army1`
FOREIGN KEY (`army`)
REFERENCES `war`.`army` (`idarmy`)
ON DELETE NO ACTION
ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `war`.`territory`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `war`.`territory` (
`idterritory` INT AUTO_INCREMENT,
`continent` INT NOT NULL,
`country` INT NOT NULL,
PRIMARY KEY (`idterritory`),
INDEX `fk_territory_continent1_idx` (`continent` ASC),
INDEX `fk_territory_country1_idx` (`country` ASC),
CONSTRAINT `fk_territory_continent1`
FOREIGN KEY (`continent`)
REFERENCES `war`.`continent` (`idcontinent`)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
CONSTRAINT `fk_territory_country1`
FOREIGN KEY (`country`)
REFERENCES `war`.`country` (`idcountry`)
ON DELETE NO ACTION
ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
