-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 09, 2016 at 11:46 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbclinic`
--
CREATE DATABASE IF NOT EXISTS `dbclinic` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `dbclinic`;

-- --------------------------------------------------------

--
-- Table structure for table `docter`
--

CREATE TABLE IF NOT EXISTS `docter` (
  `Name` varchar(30) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Special` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `drug`
--

CREATE TABLE IF NOT EXISTS `drug` (
  `drugId` int(11) NOT NULL,
  `drugName` varchar(30) NOT NULL,
  PRIMARY KEY (`drugId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `incompatibledrug`
--

CREATE TABLE IF NOT EXISTS `incompatibledrug` (
  `drugId` int(11) NOT NULL,
  `incompatibleDrugId` int(11) NOT NULL,
  PRIMARY KEY (`drugId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `PatientNIC` varchar(11) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  PRIMARY KEY (`PatientNIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE IF NOT EXISTS `prescription` (
  `PrescriptionID` varchar(30) NOT NULL,
  `PatientNIC` varchar(11) NOT NULL,
  `Docter` varchar(30) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`PrescriptionID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prescriptionreport`
--

CREATE TABLE IF NOT EXISTS `prescriptionreport` (
  `PrescriptionID` varchar(30) NOT NULL,
  `DrugName` varchar(30) NOT NULL,
  `Duration` int(11) NOT NULL,
  `Dosage` int(11) NOT NULL,
  PRIMARY KEY (`PrescriptionID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
