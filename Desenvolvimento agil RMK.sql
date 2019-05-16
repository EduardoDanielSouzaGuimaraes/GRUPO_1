-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema desenvolagil
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema desenvolagil
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `desenvolagil` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `desenvolagil` ;

-- -----------------------------------------------------
-- Table `desenvolagil`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`autor` (
  `Cod_Autor` INT(11) NOT NULL AUTO_INCREMENT,
  `NomeAutor` VARCHAR(100) NOT NULL,
  `Dt_Nasc` DATE NOT NULL,
  PRIMARY KEY (`Cod_Autor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `desenvolagil`.`compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`compra` (
  `Cod_Livro` INT(11) NOT NULL,
  `DataCompra` DATE NOT NULL,
  `ValorCompra` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ValorCompra`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `desenvolagil`.`editora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`editora` (
  `Cod_Editora` INT(11) NOT NULL AUTO_INCREMENT,
  `NomeEditora` VARCHAR(100) NOT NULL,
  `Telefone` VARCHAR(15) NOT NULL,
  `Endereco` VARCHAR(100) NOT NULL,
  `Email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`Cod_Editora`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `desenvolagil`.`livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`livro` (
  `Cod_Livro` INT(11) NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(100) NOT NULL,
  `Dt_Publicacao` DATE NOT NULL,
  `Genero` VARCHAR(100) NOT NULL,
  `ValorCompra` VARCHAR(100) NOT NULL,
  `NomeOriginal` VARCHAR(100) NOT NULL,
  `NumeroExemplar` INT(11) NOT NULL,
  `Idioma` VARCHAR(50) NOT NULL,
  `autor_Cod_Autor` INT(11) NOT NULL,
  `editora_Cod_Editora` INT(11) NOT NULL,
  PRIMARY KEY (`Cod_Livro`),
  INDEX `ValorCompra` (`ValorCompra` ASC) VISIBLE,
  INDEX `fk_livro_autor1_idx` (`autor_Cod_Autor` ASC) VISIBLE,
  INDEX `fk_livro_editora1_idx` (`editora_Cod_Editora` ASC) VISIBLE,
  CONSTRAINT `fk_livro_autor1`
    FOREIGN KEY (`autor_Cod_Autor`)
    REFERENCES `desenvolagil`.`autor` (`Cod_Autor`),
  CONSTRAINT `fk_livro_editora1`
    FOREIGN KEY (`editora_Cod_Editora`)
    REFERENCES `desenvolagil`.`editora` (`Cod_Editora`),
  CONSTRAINT `livro_ibfk_1`
    FOREIGN KEY (`ValorCompra`)
    REFERENCES `desenvolagil`.`compra` (`ValorCompra`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `desenvolagil`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`usuario` (
  `Cod_Usuario` INT(11) NOT NULL AUTO_INCREMENT,
  `NomeUsuario` VARCHAR(100) NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  `Sexo` VARCHAR(15) NOT NULL,
  `Dt_Nasc` DATE NOT NULL,
  `Endereco` VARCHAR(100) NOT NULL,
  `Cidade` VARCHAR(100) NOT NULL,
  `Estado` VARCHAR(100) NOT NULL,
  `Telefone` VARCHAR(15) NOT NULL,
  `Celular` VARCHAR(17) NOT NULL,
  `Dt_Insc` DATE NOT NULL,
  `Dt_Ult_Login` DATE NOT NULL,
  `Senha` VARCHAR(15) NOT NULL,
  `TipoUsuario` VARCHAR(15) NOT NULL,
  `Status` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Cod_Usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `desenvolagil`.`emprestimo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desenvolagil`.`emprestimo` (
  `DataEmprestimo` DATE NOT NULL,
  `DataDevoucao` DATE NOT NULL,
  `ValorEmprestimo` VARCHAR(15) NOT NULL,
  `Quant` INT(11) NOT NULL,
  `livro_Cod_Livro` INT(11) NOT NULL,
  `usuario_Cod_Usuario` INT(11) NOT NULL,
  INDEX `fk_emprestimo_livro1_idx` (`livro_Cod_Livro` ASC) VISIBLE,
  INDEX `fk_emprestimo_usuario1_idx` (`usuario_Cod_Usuario` ASC) VISIBLE,
  CONSTRAINT `fk_emprestimo_livro1`
    FOREIGN KEY (`livro_Cod_Livro`)
    REFERENCES `desenvolagil`.`livro` (`Cod_Livro`),
  CONSTRAINT `fk_emprestimo_usuario1`
    FOREIGN KEY (`usuario_Cod_Usuario`)
    REFERENCES `desenvolagil`.`usuario` (`Cod_Usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
