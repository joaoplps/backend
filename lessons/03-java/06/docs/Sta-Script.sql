-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema statereza
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema statereza
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `statereza` DEFAULT CHARACTER SET utf8 ;
USE `statereza` ;

-- -----------------------------------------------------
-- Table `statereza`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `statereza`.`produto` (
  `codprod` INT NOT NULL,
  `nomeprod` VARCHAR(45) NULL DEFAULT NULL,
  `infoprod` VARCHAR(130) NULL DEFAULT NULL,
  `precprod` FLOAT NULL DEFAULT NULL,
  `obsprod` VARCHAR(130) NULL DEFAULT NULL,
  `qtdprod` INT NULL DEFAULT NULL,
  `ntprgrl` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`codprod`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statereza`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `statereza`.`cliente` (
  `codcli` INT NOT NULL,
  `nomecli` VARCHAR(70) NULL DEFAULT NULL,
  `endcli` VARCHAR(45) NULL DEFAULT NULL,
  `passcli` VARCHAR(8) NULL DEFAULT NULL,
  `telcli` INT NULL DEFAULT NULL,
  PRIMARY KEY (`codcli`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statereza`.`confvenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `statereza`.`confvenda` (
  `codconf` INT NOT NULL,
  `descconf` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codconf`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statereza`.`orcamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `statereza`.`orcamento` (
  `codorc` INT NOT NULL,
  `codcli` INT NOT NULL,
  `codconf` INT NOT NULL,
  `dtorc` DATE NULL DEFAULT NULL,
  `hrorc` TIME NULL DEFAULT NULL,
  `ttlorc` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`codorc`, `codcli`, `codconf`),
  INDEX `fk_orcamento_cliente1_idx` (`codcli` ASC),
  INDEX `fk_orcamento_confvenda1_idx` (`codconf` ASC),
  CONSTRAINT `fk_orcamento_cliente1`
    FOREIGN KEY (`codcli`)
    REFERENCES `statereza`.`cliente` (`codcli`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orcamento_confvenda1`
    FOREIGN KEY (`codconf`)
    REFERENCES `statereza`.`confvenda` (`codconf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statereza`.`item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `statereza`.`item` (
  `coditor` INT NOT NULL,
  `codorc` INT NOT NULL,
  `codprod` INT NOT NULL,
  `quantidade` INT NULL DEFAULT NULL,
  `val_unidade` FLOAT NULL DEFAULT NULL,
  `nota` VARCHAR(45) NULL,
  PRIMARY KEY (`coditor`, `codorc`, `codprod`),
  INDEX `fk_itemorc_orcamento_idx` (`codorc` ASC),
  INDEX `fk_itemorc_produto1_idx` (`codprod` ASC),
  CONSTRAINT `fk_itemorc_orcamento`
    FOREIGN KEY (`codorc`)
    REFERENCES `statereza`.`orcamento` (`codorc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_itemorc_produto1`
    FOREIGN KEY (`codprod`)
    REFERENCES `statereza`.`produto` (`codprod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
