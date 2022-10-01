-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-09-2022 a las 21:48:11
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mintic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ramas`
--

CREATE TABLE `ramas` (
  `idRamas` int(11) NOT NULL,
  `especialidad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedula` int(255) NOT NULL,
  `nombres` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `correoElectronico` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `edad` int(255) NOT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `cv` blob DEFAULT NULL,
  `id_Ramas` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ramas`
--
ALTER TABLE `ramas`
  ADD PRIMARY KEY (`idRamas`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Cedula`),
  ADD KEY `fk_idramauser` (`ID_Ramas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ramas`
--
ALTER TABLE `ramas`
  MODIFY `idRamas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Cedula` int(255) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_idramauser` FOREIGN KEY (`ID_Ramas`) REFERENCES `ramas` (`idRamas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

ALTER TABLE `usuario` CHANGE `Cedula` `cedula` int;
ALTER TABLE `usuario` CHANGE `correoElectronico` `correoelectronico` varchar(225);