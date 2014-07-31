-- MySQL dump 10.13  Distrib 5.5.38, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: apptivity
-- ------------------------------------------------------
-- Server version	5.5.38-0ubuntu0.12.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `areas`
--

DROP TABLE IF EXISTS `areas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `areas` (
  `nombre_area` varchar(30) DEFAULT NULL,
  `integrantes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areas`
--

LOCK TABLES `areas` WRITE;
/*!40000 ALTER TABLE `areas` DISABLE KEYS */;
INSERT INTO `areas` VALUES ('Programación',0),('Finanazas',0),('Recursos Humanos',0),('Relaciones Públicas',0);
/*!40000 ALTER TABLE `areas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configuración`
--

DROP TABLE IF EXISTS `configuración`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuración` (
  `plazo_eliminación` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuración`
--

LOCK TABLES `configuración` WRITE;
/*!40000 ALTER TABLE `configuración` DISABLE KEYS */;
INSERT INTO `configuración` VALUES ('10');
/*!40000 ALTER TABLE `configuración` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filtro_dominios`
--

DROP TABLE IF EXISTS `filtro_dominios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filtro_dominios` (
  `area` varchar(30) DEFAULT NULL,
  `dominio` varchar(100) DEFAULT NULL,
  `nivel` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filtro_dominios`
--

LOCK TABLES `filtro_dominios` WRITE;
/*!40000 ALTER TABLE `filtro_dominios` DISABLE KEYS */;
INSERT INTO `filtro_dominios` VALUES ('Programación','forum.xda-developers.com','No Clasificado'),('Programación','stackoverflow.com','No Clasificado'),('Programación','www.google.com.mx','No Clasificado'),('Programación','es-la.facebook.com','No Clasificado'),('Programación','www.facebook.com','No Clasificado'),('Programación','feedly.com','No Clasificado'),('Programación','alt1040.com','No Clasificado'),('Programación','traffic.outbrain.com','No Clasificado'),('Programación','www.xrite.com','No Clasificado'),('Programación','www.colormunki.com','No Clasificado'),('Programación','getpocket.com','No Clasificado'),('Programación','www.ubuntu-guia.com','No Clasificado'),('Programación','www.oracle.com','No Clasificado'),('Programación','','No Clasificado'),('Programación','mcleodgaming.com','No Clasificado'),('Programación','www.google.com','No Clasificado'),('Programación','www.adobe.com','No Clasificado'),('Programación','shippuden.tv','No Clasificado'),('Programación','twitter.com','No Clasificado'),('Programación','forums.mcleodgaming.com','No Clasificado'),('Programación','www.youtube.com','No Clasificado'),('Programación','smashboards.com','No Clasificado'),('Programación','wiidatabase.de','No Clasificado'),('Programación','askubuntu.com','No Clasificado'),('Programación','answers.yahoo.com','No Clasificado'),('Programación','superuser.com','No Clasificado'),('Programación','en.uptodown.com','No Clasificado'),('Programación','data-recovery-raid.hoops227.biz','No Clasificado'),('Programación','iloveshareware.com','No Clasificado'),('Programación','linuxg.net','No Clasificado'),('Programación','github.com','No Clasificado'),('Programación','moodle.upqroo.edu.mx','No Clasificado'),('Programación','mail.google.com','No Clasificado'),('Programación','docs.oracle.com','No Clasificado'),('Programación','192.168.100.4','No Clasificado');
/*!40000 ALTER TABLE `filtro_dominios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registros`
--

DROP TABLE IF EXISTS `registros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registros` (
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `area_usuario` varchar(30) DEFAULT NULL,
  `dominio` varchar(100) DEFAULT NULL,
  `dia_visita` date DEFAULT NULL,
  `numero_visitas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registros`
--

LOCK TABLES `registros` WRITE;
/*!40000 ALTER TABLE `registros` DISABLE KEYS */;
INSERT INTO `registros` VALUES ('Zero Vivanco','Programación','forum.xda-developers.com','2014-07-24',1),('Zero Vivanco','Programación','stackoverflow.com','2014-07-26',1),('Zero Vivanco','Programación','www.google.com.mx','2014-07-26',32),('Zero Vivanco','Programación','es-la.facebook.com','2014-07-26',1),('Zero Vivanco','Programación','www.facebook.com','2014-07-28',2),('Zero Vivanco','Programación','feedly.com','2014-07-26',4),('Zero Vivanco','Programación','alt1040.com','2014-07-26',3),('Zero Vivanco','Programación','traffic.outbrain.com','2014-07-26',1),('Zero Vivanco','Programación','www.xrite.com','2014-07-26',1),('Zero Vivanco','Programación','www.colormunki.com','2014-07-26',3),('Zero Vivanco','Programación','www.facebook.com','2014-07-26',27),('Zero Vivanco','Programación','getpocket.com','2014-07-26',5),('Zero Vivanco','Programación','www.ubuntu-guia.com','2014-07-26',2),('Zero Vivanco','Programación','www.oracle.com','2014-07-26',3),('Zero Vivanco','Programación','forum.xda-developers.com','2014-07-26',4),('Zero Vivanco','Programación','forum.xda-developers.com','2014-07-27',1),('Zero Vivanco','Programación','','2014-07-26',2),('Zero Vivanco','Programación','mcleodgaming.com','2014-07-26',2),('Zero Vivanco','Programación','www.google.com','2014-07-26',1),('Zero Vivanco','Programación','www.adobe.com','2014-07-26',2),('Zero Vivanco','Programación','shippuden.tv','2014-07-26',5),('Zero Vivanco','Programación','twitter.com','2014-07-26',4),('Zero Vivanco','Programación','twitter.com','2014-07-27',1),('Zero Vivanco','Programación','www.google.com.mx','2014-07-27',3),('Zero Vivanco','Programación','forums.mcleodgaming.com','2014-07-26',3),('Zero Vivanco','Programación','www.youtube.com','2014-07-26',4),('Zero Vivanco','Programación','smashboards.com','2014-07-26',1),('Zero Vivanco','Programación','wiidatabase.de','2014-07-26',1),('Zero Vivanco','Programación','askubuntu.com','2014-07-26',1),('Zero Vivanco','Programación','answers.yahoo.com','2014-07-26',3),('Zero Vivanco','Programación','superuser.com','2014-07-26',1),('Zero Vivanco','Programación','en.uptodown.com','2014-07-26',1),('Zero Vivanco','Programación','data-recovery-raid.hoops227.biz','2014-07-26',4),('Zero Vivanco','Programación','iloveshareware.com','2014-07-26',1),('Zero Vivanco','Programación','linuxg.net','2014-07-26',2),('Zero Vivanco','Programación','github.com','2014-07-28',5),('Zero Vivanco','Programación','moodle.upqroo.edu.mx','2014-07-27',1),('Zero Vivanco','Programación','mail.google.com','2014-07-27',8),('Zero Vivanco','Programación','www.facebook.com','2014-07-27',10),('Zero Vivanco','Programación','stackoverflow.com','2014-07-27',1),('Zero Vivanco','Programación','docs.oracle.com','2014-07-27',2),('Zero Vivanco','Programación','','2014-07-28',1),('Zero Vivanco','Programación','www.google.com.mx','2014-07-28',1),('Zero Vivanco','Programación','192.168.100.4','2014-07-28',4),('luis perez','Programación','forum.xda-developers.com','2014-07-24',1),('luis perez','Programación','stackoverflow.com','2014-07-26',1),('luis perez','Programación','www.google.com.mx','2014-07-26',32),('luis perez','Programación','es-la.facebook.com','2014-07-26',1),('luis perez','Programación','www.facebook.com','2014-07-28',2),('luis perez','Programación','feedly.com','2014-07-26',4),('luis perez','Programación','alt1040.com','2014-07-26',3),('luis perez','Programación','traffic.outbrain.com','2014-07-26',1),('luis perez','Programación','www.xrite.com','2014-07-26',1),('luis perez','Programación','www.colormunki.com','2014-07-26',3),('luis perez','Programación','www.facebook.com','2014-07-26',27),('luis perez','Programación','getpocket.com','2014-07-26',5),('luis perez','Programación','www.ubuntu-guia.com','2014-07-26',2),('luis perez','Programación','www.oracle.com','2014-07-26',3),('luis perez','Programación','forum.xda-developers.com','2014-07-26',4),('luis perez','Programación','forum.xda-developers.com','2014-07-27',1),('luis perez','Programación','','2014-07-26',2),('luis perez','Programación','mcleodgaming.com','2014-07-26',2),('luis perez','Programación','www.google.com','2014-07-26',1),('luis perez','Programación','www.adobe.com','2014-07-26',2),('luis perez','Programación','shippuden.tv','2014-07-26',5),('luis perez','Programación','twitter.com','2014-07-26',4),('luis perez','Programación','twitter.com','2014-07-27',1),('luis perez','Programación','www.google.com.mx','2014-07-27',3),('luis perez','Programación','forums.mcleodgaming.com','2014-07-26',3),('luis perez','Programación','www.youtube.com','2014-07-26',4),('luis perez','Programación','smashboards.com','2014-07-26',1),('luis perez','Programación','wiidatabase.de','2014-07-26',1),('luis perez','Programación','askubuntu.com','2014-07-26',1),('luis perez','Programación','answers.yahoo.com','2014-07-26',3),('luis perez','Programación','superuser.com','2014-07-26',1),('luis perez','Programación','en.uptodown.com','2014-07-26',1),('luis perez','Programación','data-recovery-raid.hoops227.biz','2014-07-26',4),('luis perez','Programación','iloveshareware.com','2014-07-26',1),('luis perez','Programación','linuxg.net','2014-07-26',2),('luis perez','Programación','github.com','2014-07-28',5),('luis perez','Programación','moodle.upqroo.edu.mx','2014-07-27',1),('luis perez','Programación','mail.google.com','2014-07-27',8),('luis perez','Programación','www.facebook.com','2014-07-27',10),('luis perez','Programación','stackoverflow.com','2014-07-27',1),('luis perez','Programación','docs.oracle.com','2014-07-27',2),('luis perez','Programación','','2014-07-28',1),('luis perez','Programación','www.google.com.mx','2014-07-28',1),('luis perez','Programación','192.168.100.4','2014-07-28',4);
/*!40000 ALTER TABLE `registros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_principal`
--

DROP TABLE IF EXISTS `usuario_principal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_principal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `cargo_usuario` varchar(30) DEFAULT NULL,
  `apodo_usuario` varchar(30) DEFAULT NULL,
  `contrasena_usuario` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_principal`
--

LOCK TABLES `usuario_principal` WRITE;
/*!40000 ALTER TABLE `usuario_principal` DISABLE KEYS */;
INSERT INTO `usuario_principal` VALUES (1,'Administrador del Sistema','Administrador','admin','admin');
/*!40000 ALTER TABLE `usuario_principal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_secundario`
--

DROP TABLE IF EXISTS `usuario_secundario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_secundario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `area_usuario` varchar(30) DEFAULT NULL,
  `cargo_usuario` varchar(30) DEFAULT NULL,
  `horario_salida` time DEFAULT NULL,
  `apodo_usuario` varchar(30) DEFAULT NULL,
  `contrasena_usuario` varchar(30) DEFAULT NULL,
  `productividad_dia` varchar(3) DEFAULT NULL,
  `productividad_semana` varchar(3) DEFAULT NULL,
  `productividad_mes` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_secundario`
--

LOCK TABLES `usuario_secundario` WRITE;
/*!40000 ALTER TABLE `usuario_secundario` DISABLE KEYS */;
INSERT INTO `usuario_secundario` VALUES (2,'Zero Vivanco','Programación','Programador','18:00:00','Zero','Zero','0','0','0');
/*!40000 ALTER TABLE `usuario_secundario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-31 10:21:05
