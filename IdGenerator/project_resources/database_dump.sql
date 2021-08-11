-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2019 at 12:46 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
(1, 20184563, 'Test Student', 'SE', 'CS', 'A', '1234567890', NULL, NULL, NULL),
(2, 20184565, 'Another Student', 'SE', 'CS', 'A', '1234567890', NULL, NULL, NULL),
(3, 20184569, 'OneMore Student', 'SE', 'CS', 'B', '0987654321', NULL, NULL, NULL),
(4, 20184572, 'Yogesh Choudhary', 'SE', 'CS', 'B', '2345678901', NULL, NULL, NULL),
(5, 20184574, 'Varun MK', 'SE', 'CS', 'A', '3456789012', NULL, NULL, NULL);

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
