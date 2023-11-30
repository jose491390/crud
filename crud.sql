-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2023 a las 21:22:35
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `crud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaproducto`
--

CREATE TABLE `tablaproducto` (
  `id` int(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precioUnidadCompra` int(50) NOT NULL,
  `iva` int(50) NOT NULL,
  `precioUnidadVenta` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tablaproducto`
--

INSERT INTO `tablaproducto` (`id`, `nombre`, `descripcion`, `precioUnidadCompra`, `iva`, `precioUnidadVenta`) VALUES
(1, 'bolsa h', 'asi', 200, 10, 220),
(2, 'BOSSA E', '2', 2000, 10, 2200),
(12, 'BOLSA X', 'COMPRA', 1200, 10, 1320),
(123, 'dasd', 'sds', 10000, 10, 11000),
(12344, 'bolsa f', 'bolsa blanc', 1000, 10, 1100),
(1313131, 'fdfdf', 'fgfg', 1111, 20, 1333);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tablaproducto`
--
ALTER TABLE `tablaproducto`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
