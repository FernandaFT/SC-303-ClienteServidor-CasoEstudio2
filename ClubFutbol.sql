-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 11, 2025 at 05:32 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `instituciondeportiva`
--

-- --------------------------------------------------------

--
-- Table structure for table `ClubFutbol`
--

CREATE TABLE `ClubFutbol` (
  `id` int(11) NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `ubicacion` varchar(70) NOT NULL,
  `numerocamisa` int(11) NOT NULL,
  `ligaprofesional` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ClubFutbol`
--

INSERT INTO `ClubFutbol` (`id`, `nombre`, `ubicacion`, `numerocamisa`, `ligaprofesional`) VALUES
(1, 'Lupita', 'Central', 45, 'Femenina'),
(2, 'Quesito', 'Medio Campo', 14, 'Femenina'),
(3, 'Lupillo', 'Portero', 6, 'Masculina'),
(4, 'Quesite', 'Delantero', 20, 'Masculina'),
(5, 'Juana', 'Delantera', 30, 'Femenina'),
(6, 'Maki', 'Portera', 37, 'Femenina'),
(7, 'Fernanda', 'Delantera', 53, 'Femenina'),
(8, 'Pablo', 'Medio Campo', 78, 'Masculina'),
(9, 'Ana', 'Portera', 3, 'Femenina'),
(10, 'Manuel', 'Media Punta', 22, 'Masculina');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ClubFutbol`
--
ALTER TABLE `ClubFutbol`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ClubFutbol`
--
ALTER TABLE `ClubFutbol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
