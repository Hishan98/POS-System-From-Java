-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2019 at 08:16 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `juicebar`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `item` varchar(50) NOT NULL,
  `itemcode` varchar(50) NOT NULL,
  `price` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`item`, `itemcode`, `price`) VALUES
('Pineapple juice', 'j001', 150),
('Watermelon juice', 'j002', 120),
('Cucumber juice', 'j003', 180),
('Grape juice', 'j004', 100),
('Cranberry juice', 'j005', 110),
('Apple juice', 'j006', 200),
('Pomegranate juice', 'j007', 220),
('Cabbage juice', 'j008', 180),
('Carrot juice', 'j009', 150),
('Karela juice', 'j010', 130),
('Gotukola kenda', 'j011', 120),
('Karapincha kenda', 'j012', 120),
('Papaya juice', 'j013', 180),
('Lemon juice', 'j016', 130),
('Avacado juice', 'j017', 190),
('Orange juice', 'j018', 150),
('Walpenela kenda', 'j019', 160),
('salad chocolate', 's001', 180),
('salad vanila', 's002', 180),
('salad mixfruit', 's003', 230);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`itemcode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
