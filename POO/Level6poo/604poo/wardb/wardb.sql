-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema War
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema War
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `War` DEFAULT CHARACTER SET utf8 ;
USE `War` ;

-- -----------------------------------------------------
-- Table `War`.`Continente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `War`.`Continente` (
`idContinente` INT NOT NULL,
`Nome` VARCHAR(45) NULL,
PRIMARY KEY (`idContinente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `War`.`Tropa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `War`.`Tropa` (
`idTropa` INT NOT NULL,
`Unidades` INT NULL,
`Cor` INT NULL,
PRIMARY KEY (`idTropa`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `War`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `War`.`Pais` (
`idPais` INT NOT NULL,
`Nome` VARCHAR(45) NULL,
`Tropa` INT NOT NULL,
PRIMARY KEY (`idPais`),
INDEX `fk_Pais_Tropa1_idx` (`Tropa` ASC),
CONSTRAINT `fk_Pais_Tropa1`
FOREIGN KEY (`Tropa`)
REFERENCES `War`.`Tropa` (`idTropa`)
ON DELETE NO ACTION
ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `War`.`Territorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `War`.`Territorio` (
`idTerritorio` INT NOT NULL,
`Continente` INT NOT NULL,
`Pais` INT NOT NULL,
PRIMARY KEY (`idTerritorio`),
INDEX `fk_Territorio_Continente1_idx` (`Continente` ASC),
INDEX `fk_Territorio_Pais1_idx` (`Pais` ASC),
CONSTRAINT `fk_Territorio_Continente1`
FOREIGN KEY (`Continente`)
REFERENCES `War`.`Continente` (`idContinente`)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
CONSTRAINT `fk_Territorio_Pais1`
FOREIGN KEY (`Pais`)
REFERENCES `War`.`Pais` (`idPais`)
ON DELETE NO ACTION
ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
