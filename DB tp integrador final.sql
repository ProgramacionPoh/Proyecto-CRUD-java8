DROP SCHEMA IF EXISTS mydb;
CREATE SCHEMA IF NOT EXISTS `mydb`;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `cuit` VARCHAR(11) NOT NULL,
  `razon_social` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`cuit`));


-- -----------------------------------------------------
-- Table `mydb`.`servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`servicio` (
  `id` VARCHAR(6),
  `area` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `mydb`.`soporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`soporte` (
  `codigo` VARCHAR(4) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`codigo`));


-- -----------------------------------------------------
-- Table `mydb`.`especialidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`especialidad` (
  `id` VARCHAR(16) NOT NULL,
  `tipo` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`));
  
-- -----------------------------------------------------
-- Table `mydb`.`tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`tecnico` (
  `codigo` VARCHAR(4) NOT NULL,
  `nombre` VARCHAR(25) NOT NULL,
  `especialidad_id` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`codigo`),
    INDEX `fk_tenico_especialidad_idx` (`especialidad_id` ASC),
	CONSTRAINT `fk_tenico_especialidad`
    FOREIGN KEY (`especialidad_id`)
    REFERENCES `mydb`.`especialidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table `mydb`.`reporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`reporte` (
  `fecha` DATETIME NOT NULL,
  PRIMARY KEY (`fecha`));


-- -----------------------------------------------------
-- Table `mydb`.`caso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`caso` (
  `orden` VARCHAR(5),
  `apertura` DATETIME NOT NULL,
  `descripcion` VARCHAR(255) NOT NULL,
  `resolucion` VARCHAR(255) NOT NULL,
  `cierre` VARCHAR(45) NOT NULL,
  `tecnico_codigo` VARCHAR(4) NOT NULL,
  `soporte_codigo` VARCHAR(4) NOT NULL,
  `reporte_fecha` DATETIME NOT NULL,
  `cliente_cuit` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`orden`, `reporte_fecha`, `cliente_cuit`),
  INDEX `fk_caso_tecnico1_idx` (`tecnico_codigo` ASC),
  INDEX `fk_caso_soporte1_idx` (`soporte_codigo` ASC),
  INDEX `fk_caso_reporte1_idx` (`reporte_fecha` ASC),
  INDEX `fk_caso_cliente1_idx` (`cliente_cuit` ASC),
  CONSTRAINT `fk_caso_tecnico1`
    FOREIGN KEY (`tecnico_codigo`)
    REFERENCES `mydb`.`tecnico` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_caso_soporte1`
    FOREIGN KEY (`soporte_codigo`)
    REFERENCES `mydb`.`soporte` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_caso_reporte1`
    FOREIGN KEY (`reporte_fecha`)
    REFERENCES `mydb`.`reporte` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_caso_cliente1`
    FOREIGN KEY (`cliente_cuit`)
    REFERENCES `mydb`.`cliente` (`cuit`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`cliente_has_servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cliente_has_servicio` (
  `cliente_cuit` VARCHAR(11) NOT NULL,
  `servicio_id` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`cliente_cuit`, `servicio_id`),
  INDEX `fk_cliente_has_servicio_servicio1_idx` (`servicio_id` ASC),
  INDEX `fk_cliente_has_servicio_cliente1_idx` (`cliente_cuit` ASC),
  CONSTRAINT `fk_cliente_has_servicio_cliente1`
    FOREIGN KEY (`cliente_cuit`)
    REFERENCES `mydb`.`cliente` (`cuit`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_servicio_servicio1`
    FOREIGN KEY (`servicio_id`)
    REFERENCES `mydb`.`servicio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
