-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 25, 2020 at 02:42 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lbtest`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `sec_q` varchar(25) DEFAULT NULL,
  `sec_ans` varchar(25) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `sec_ans`) VALUES
('new', 'new', '1234', 'Your NickName?', 'new'),
('htn', 'trvc', '1234', 'Your NickName?', 'new'),
('admin', 'admin', '1234', 'Your NickName?', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `book_id` varchar(10) NOT NULL,
  `name` varchar(40) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `publisher` varchar(30) NOT NULL,
  `edition` varchar(10) NOT NULL,
  `price` varchar(10) NOT NULL,
  `pages` varchar(10) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `name`, `isbn`, `publisher`, `edition`, `price`, `pages`) VALUES
('1', 'Software', '320-300-250-100', 'OUSL', '1', '500', '200'),
('100', 'Software2', '320-300-250-100', 'OUSL', '1', '500', '200'),
('1521', 'Java', '1331-255-600-400', 'OUSL', '1.5', '1500', '450');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

DROP TABLE IF EXISTS `issuebook`;
CREATE TABLE IF NOT EXISTS `issuebook` (
  `student_id` varchar(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `book_name` varchar(40) NOT NULL,
  `book_id` varchar(10) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `date_Of_Issue` date NOT NULL,
  `date_of_Return` date NOT NULL,
  PRIMARY KEY (`date_Of_Issue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`student_id`, `name`, `book_name`, `book_id`, `isbn`, `date_Of_Issue`, `date_of_Return`) VALUES
('456953232', 'Sumudu Lakmal', 'Software2', '100', '320-300-250-100', '2020-05-12', '2020-05-30'),
('456953232', 'Sumudu Lakmal', 'Software2', '100', '320-300-250-100', '2020-05-24', '2020-05-30'),
('1', 'Sumu', 'Java', '1521', '1331-255-600-400', '2020-05-25', '2020-05-30');

-- --------------------------------------------------------

--
-- Table structure for table `logindatabase`
--

DROP TABLE IF EXISTS `logindatabase`;
CREATE TABLE IF NOT EXISTS `logindatabase` (
  `sno` int(16) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logindatabase`
--

INSERT INTO `logindatabase` (`sno`, `username`, `password`) VALUES
(1, 'usertest', '12345'),
(3, 'testuser', 'test'),
(4, 'newlbr', 'qazxcv'),
(10, 'admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

DROP TABLE IF EXISTS `returnbook`;
CREATE TABLE IF NOT EXISTS `returnbook` (
  `book_id` varchar(10) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT NULL,
  `bname` varchar(40) DEFAULT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `dateOfIssue` varchar(30) DEFAULT NULL,
  `dateOfReturn` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `student_id` varchar(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `course` varchar(10) NOT NULL,
  `branch` varchar(10) NOT NULL,
  `semester` varchar(10) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `name`, `course`, `branch`, `semester`) VALUES
('1', 'Sumu', 'er', 'e', 'e'),
('456953232', 'Sumudu Lakmal', 'Computer', 'Colombo', '4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
