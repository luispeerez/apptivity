-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-07-2014 a las 19:20:24
-- Versión del servidor: 5.5.38-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `apptivity`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE IF NOT EXISTS `areas` (
  `nombre_area` varchar(30) DEFAULT NULL,
  `integrantes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `configuración`
--

CREATE TABLE IF NOT EXISTS `configuración` (
  `plazo_eliminación` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `filtro_dominios`
--

CREATE TABLE IF NOT EXISTS `filtro_dominios` (
  `area` varchar(30) DEFAULT NULL,
  `dominio` varchar(100) DEFAULT NULL,
  `nivel` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE IF NOT EXISTS `registros` (
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `area_usuario` varchar(30) DEFAULT NULL,
  `dominio` varchar(100) DEFAULT NULL,
  `dia_visita` date DEFAULT NULL,
  `numero_visitas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_principal`
--

CREATE TABLE IF NOT EXISTS `usuario_principal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `cargo_usuario` varchar(30) DEFAULT NULL,
  `apodo_usuario` varchar(30) DEFAULT NULL,
  `contrasena_usuario` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuario_principal`
--

INSERT INTO `usuario_principal` (`id`, `nombre_usuario`, `cargo_usuario`, `apodo_usuario`, `contrasena_usuario`) VALUES
(1, 'admin', 'administrador', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_secundario`
--

CREATE TABLE IF NOT EXISTS `usuario_secundario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(50) DEFAULT NULL,
  `area_usuario` varchar(30) DEFAULT NULL,
  `cargo_usuario` varchar(30) DEFAULT NULL,
  `horario_salida` datetime DEFAULT NULL,
  `apodo_usuario` varchar(30) DEFAULT NULL,
  `contrasena_usuario` varchar(30) DEFAULT NULL,
  `productividad_dia` varchar(3) DEFAULT NULL,
  `productividad_semana` varchar(3) DEFAULT NULL,
  `productividad_mes` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuario_secundario`
--

INSERT INTO `usuario_secundario` (`id`, `nombre_usuario`, `area_usuario`, `cargo_usuario`, `horario_salida`, `apodo_usuario`, `contrasena_usuario`, `productividad_dia`, `productividad_semana`, `productividad_mes`) VALUES
(1, 'luis perez', 'Programacion', 'programador', NULL, 'luis', '1234', NULL, NULL, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
