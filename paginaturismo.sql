CREATE DATABASE PaginaTurismo;
use PaginaTurismo;

CREATE TABLE `restaurantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_rest` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `restaurantes` VALUES (1,'Ragu'),(2,'El Novillo Alegre'),(3,'Taller De Billy Sazón');

CREATE TABLE `agenciaslocales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom_agencia_local` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `agenciaslocales` VALUES (1,'3 Monkies Tours'),(2,'Adrenalina Rafting'),(3,'Alova Tours');

CREATE TABLE `actividades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `local_actividades` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `actividades` VALUES (1,'Lecciones de Surf'),(2,'Parque Nacional Manuel Antonio'),(3,'Tour');

  CREATE TABLE `agenciasreserva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agenciar` varchar(45) NOT NULL,
  `fecha_agencia` date not null,
  `hora_agencia` varchar(15) NOT NULL,
  `cantidad_personas_agencia` int(9) NOT NULL,
  PRIMARY KEY (`id`)) ;
  
   CREATE TABLE `actividadesreserva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actividadesr` varchar(45) NOT NULL,
  `fecha_actividades` date not null,
  `hora_actividades` varchar(15) NOT NULL,
  `cantidad_personas_actividades` int(9) NOT NULL,
  PRIMARY KEY (`id`)) ;
  
  CREATE TABLE `restaurantesreserva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `restaurantesr` varchar(45) NOT NULL,
  `fecha_restaurantes` date not null,
  `hora_restaurantes` varchar(15) NOT NULL,
  `cantidad_personas_restaurantes` int(9) NOT NULL,
  PRIMARY KEY (`id`)) ;
  
  CREATE TABLE `personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido1` varchar(45) NOT NULL,
  `apellido2` varchar(45) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `email` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`id`)) ;
  
INSERT INTO `personas` VALUES (1,'Pedro','Alvarado','Navarro','8458-4568','pedro@yahoo.es');
INSERT INTO `personas` VALUES (2,'Manuel','Peña','Jimenez','8345-2367','manuela@gmail.com');
INSERT INTO `personas` VALUES (3,'Nicole','Amador','Gutierrez','7041-2345','nic@hotmail.com');