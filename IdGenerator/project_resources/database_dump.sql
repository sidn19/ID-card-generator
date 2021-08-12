-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2021 at 08:47 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `dbid` int(11) NOT NULL,
  `admission_no` int(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `year` varchar(15) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `class` varchar(5) DEFAULT NULL,
  `mob_no` varchar(10) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`dbid`, `admission_no`, `name`, `year`, `branch`, `class`, `mob_no`, `email`, `dob`, `address`) VALUES
(1, 20184563, 'Abin Varghese', 'SE', 'Computer Engineering', 'B', '1234567890', 'abc@mes.ac.in', '2000-08-08', 'Sion, Mumbai'),
(2, 20184565, 'Dhanesh Nair', 'SE', 'Computer Engineering', 'A', '1234567899', 'dms@student.mes.ac.in', '2000-07-16', 'Boisar'),
(3, 20184569, 'Yogesh Choudhary', 'TE', 'Information Technolo', 'B', '9987654321', 'xyz@mes.ac.in', '1999-12-22', 'Nerul, Navi Mumbai'),
(4, 20184572, 'Sidharth Nair', 'SE', 'Computer Engineering', 'A', '2345678901', 'ssn@mes.ac.in', '2000-10-19', 'Ulwe, Navi Mumbai'),
(5, 20184574, 'Varun MK', 'SE', 'Computer Engineering', 'A', '3456789012', 'mkv@mes.ac.in', '2000-09-13', 'Powai, Mumbai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`dbid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `dbid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
