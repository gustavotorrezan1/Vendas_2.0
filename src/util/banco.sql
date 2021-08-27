-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ControleEstoque
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ControleEstoque
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ControleEstoque` ;
USE `ControleEstoque` ;

-- -----------------------------------------------------
-- Table `ControleEstoque`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Pessoa` (
  `pk_pes_id` INT NOT NULL AUTO_INCREMENT,
  `pes_nome` VARCHAR(45) NOT NULL,
  `pes_cpf` CHAR(11) NULL,
  `pes_cnpj` CHAR(14) NULL,
  `pes_telefone` INT NOT NULL,
  `pes_email` VARCHAR(45) NULL,
  `pes_cep` VARCHAR(45) NOT NULL,
  `pes_estado` VARCHAR(45) NOT NULL,
  `pes_cidade` VARCHAR(45) NOT NULL,
  `pes_bairro` VARCHAR(45) NOT NULL,
  `pes_rua` VARCHAR(45) NOT NULL,
  `pes_num_rua` INT NOT NULL,
  PRIMARY KEY (`pk_pes_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Fornecedor` (
  `pk_for_id` INT NOT NULL,
  `for_empresa` VARCHAR(45) NOT NULL,
  `for_representante` VARCHAR(45) NOT NULL,
  `fk_pes_id` INT NOT NULL,
  PRIMARY KEY (`pk_for_id`, `fk_pes_id`),
  INDEX `fk_Fornecedor_Pessoa1_idx` (`fk_pes_id` ASC) VISIBLE,
  CONSTRAINT `fk_Fornecedor_Pessoa1`
    FOREIGN KEY (`fk_pes_id`)
    REFERENCES `ControleEstoque`.`Pessoa` (`pk_pes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Produto` (
  `pk_pro_id` INT NOT NULL AUTO_INCREMENT,
  `pro_descricao` VARCHAR(45) NOT NULL,
  `pro_nomeLongo` VARCHAR(100) NULL,
  `pro_cod_bar` CHAR(12) NOT NULL,
  `pro_preco_ven` DECIMAL(20) NOT NULL,
  `pro_preco_cus` DECIMAL(20) NOT NULL,
  `pro_categoria` VARCHAR(45) NULL,
  `pro_tipo_un` VARCHAR(45) NULL,
  `pro_qnt_estoque` INT NULL,
  `fk_for_id` INT NOT NULL,
  PRIMARY KEY (`pk_pro_id`, `fk_for_id`),
  INDEX `fk_Produto_Fornecedor_idx` (`fk_for_id` ASC) VISIBLE,
  CONSTRAINT `fk_Produto_Fornecedor`
    FOREIGN KEY (`fk_for_id`)
    REFERENCES `ControleEstoque`.`Fornecedor` (`pk_for_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Cliente` (
  `pk_cli_id` INT NOT NULL AUTO_INCREMENT,
  `fk_pes_id` INT NOT NULL,
  PRIMARY KEY (`pk_cli_id`, `fk_pes_id`),
  INDEX `fk_Cliente_Pessoa1_idx` (`fk_pes_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_Pessoa1`
    FOREIGN KEY (`fk_pes_id`)
    REFERENCES `ControleEstoque`.`Pessoa` (`pk_pes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Pagamento` (
  `pk_pag_id` INT NOT NULL,
  `pag_tipo_pagamento` VARCHAR(45) NOT NULL,
  `pag_valor_pagemento` DECIMAL NOT NULL,
  `pag_data_pagamanto` DATE NOT NULL,
  `pag_hora_pagamento` TIME NOT NULL,
  PRIMARY KEY (`pk_pag_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Usuario` (
  `pk_usu_id` INT NOT NULL AUTO_INCREMENT,
  `usu_nivel_permissao` INT NOT NULL,
  `fk_pes_id` INT NOT NULL,
  `usu_login` VARCHAR(45) NOT NULL,
  `usu_senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`pk_usu_id`, `fk_pes_id`),
  INDEX `fk_Usuario_Pessoa1_idx` (`fk_pes_id` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Pessoa1`
    FOREIGN KEY (`fk_pes_id`)
    REFERENCES `ControleEstoque`.`Pessoa` (`pk_pes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Compra` (
  `pk_com_id` INT NOT NULL AUTO_INCREMENT,
  `com_data_compra` DATE NOT NULL,
  `com_hora_compra` TIME NOT NULL,
  `com_hora_recebimento` TIME NOT NULL,
  `com_data_recebimento` DATE NOT NULL,
  `pk_pro_id` INT NOT NULL,
  `fk_for_id` INT NOT NULL,
  `fk_pag_id` INT NOT NULL,
  `fk_usu_id` INT NOT NULL,
  PRIMARY KEY (`pk_com_id`, `pk_pro_id`, `fk_for_id`, `fk_pag_id`, `fk_usu_id`),
  INDEX `fk_Compra_Produto1_idx` (`pk_pro_id` ASC, `fk_for_id` ASC) VISIBLE,
  INDEX `fk_Compra_Pagamento1_idx` (`fk_pag_id` ASC) VISIBLE,
  INDEX `fk_Compra_Usuario1_idx` (`fk_usu_id` ASC) VISIBLE,
  CONSTRAINT `fk_Compra_Produto1`
    FOREIGN KEY (`pk_pro_id` , `fk_for_id`)
    REFERENCES `ControleEstoque`.`Produto` (`pk_pro_id` , `fk_for_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Pagamento1`
    FOREIGN KEY (`fk_pag_id`)
    REFERENCES `ControleEstoque`.`Pagamento` (`pk_pag_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Usuario1`
    FOREIGN KEY (`fk_usu_id`)
    REFERENCES `ControleEstoque`.`Usuario` (`pk_usu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ControleEstoque`.`Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ControleEstoque`.`Venda` (
  `pk_ven_id` INT NOT NULL AUTO_INCREMENT,
  `fk_pag_id` INT NOT NULL,
  `fk_pro_id` INT NOT NULL,
  `fk_cli_id` INT NOT NULL,
  `fk_usu_id` INT NOT NULL,
  PRIMARY KEY (`pk_ven_id`, `fk_pag_id`, `fk_pro_id`, `fk_cli_id`, `fk_usu_id`),
  INDEX `fk_Venda_Pagamento1_idx` (`fk_pag_id` ASC) VISIBLE,
  INDEX `fk_Venda_Produto1_idx` (`fk_pro_id` ASC) VISIBLE,
  INDEX `fk_Venda_Cliente1_idx` (`fk_cli_id` ASC) VISIBLE,
  INDEX `fk_Venda_Usuario1_idx` (`fk_usu_id` ASC) VISIBLE,
  CONSTRAINT `fk_Venda_Pagamento1`
    FOREIGN KEY (`fk_pag_id`)
    REFERENCES `ControleEstoque`.`Pagamento` (`pk_pag_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_Produto1`
    FOREIGN KEY (`fk_pro_id`)
    REFERENCES `ControleEstoque`.`Produto` (`pk_pro_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_Cliente1`
    FOREIGN KEY (`fk_cli_id`)
    REFERENCES `ControleEstoque`.`Cliente` (`pk_cli_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_Usuario1`
    FOREIGN KEY (`fk_usu_id`)
    REFERENCES `ControleEstoque`.`Usuario` (`pk_usu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
