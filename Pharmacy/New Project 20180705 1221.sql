-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.62-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema pharmacy
--

CREATE DATABASE IF NOT EXISTS pharmacy;
USE pharmacy;

--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `CatID` int(11) NOT NULL AUTO_INCREMENT,
  `CatName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CatID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`CatID`,`CatName`) VALUES 
 (1,'Fruits'),
 (2,'Vege'),
 (3,'Drinks'),
 (4,'Rice');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `ItemID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `BrandName` varchar(45) NOT NULL,
  `PackNo` int(10) unsigned NOT NULL,
  `RegNo` int(10) unsigned NOT NULL,
  `Catagory` mediumint(9) unsigned NOT NULL,
  `ItemName` varchar(45) NOT NULL,
  `strength` varchar(45) NOT NULL,
  PRIMARY KEY (`ItemID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` (`ItemID`,`BrandName`,`PackNo`,`RegNo`,`Catagory`,`ItemName`,`strength`) VALUES 
 (1,'Panadole',10,10,0,'Parasitamale','100'),
 (3,'TTNS TOXAN',3,15568,1,'TTNS','500');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;


--
-- Definition of table `myitem`
--

DROP TABLE IF EXISTS `myitem`;
CREATE TABLE `myitem` (
  `ItemID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CatID` int(11) NOT NULL DEFAULT '1',
  `ItemCode` varchar(50) NOT NULL,
  `ItemName` varchar(45) NOT NULL,
  `Price` double(10,2) NOT NULL,
  `QTY` int(11) NOT NULL DEFAULT '0',
  `Total` double(10,2) NOT NULL DEFAULT '0.00',
  `ExpDate` date NOT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `myitem`
--

/*!40000 ALTER TABLE `myitem` DISABLE KEYS */;
INSERT INTO `myitem` (`ItemID`,`CatID`,`ItemCode`,`ItemName`,`Price`,`QTY`,`Total`,`ExpDate`) VALUES 
 (1,1,'FR001','Apple USA',60.00,3,180.00,'2018-08-20'),
 (2,2,'VG001','Veg1',70.00,1,70.00,'2018-10-10'),
 (3,1,'FR002','Banana',30.00,6,180.00,'2018-06-30'),
 (4,1,'FR003','Grapes',80.00,2,160.00,'2018-06-30'),
 (5,2,'VG002','Veg2',25.00,4,100.00,'2018-07-10'),
 (7,4,'RC008','Rice',100.00,10,1000.00,'2019-01-01');
/*!40000 ALTER TABLE `myitem` ENABLE KEYS */;


--
-- Definition of table `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `StockID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ItemID` varchar(10) NOT NULL,
  `Quantity` int(10) unsigned NOT NULL,
  `Sector` int(10) unsigned NOT NULL,
  `SellPrice` double NOT NULL,
  `stockdate` datetime NOT NULL,
  PRIMARY KEY (`StockID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`StockID`,`ItemID`,`Quantity`,`Sector`,`SellPrice`,`stockdate`) VALUES 
 (2,'AM020',1200,12,2,'2018-08-02 00:00:00'),
 (3,'PM001',1000,10,10,'2018-08-04 00:00:00'),
 (4,'AR330',100,9,12,'2018-08-07 00:00:00');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `StudentID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Firstname` varchar(40) NOT NULL,
  `LastName` varchar(60) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` smallint(5) unsigned NOT NULL,
  `City` varchar(45) NOT NULL,
  `FinalMarks` int(10) unsigned NOT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`StudentID`,`Firstname`,`LastName`,`DOB`,`Gender`,`City`,`FinalMarks`) VALUES 
 (1,'Ann','winslet','1998-06-20',0,'Colombo',86),
 (3,'Nalaka','Withanage','1998-08-21',0,'Colombo',90),
 (4,'Ishara','Rathnayaka','2000-12-18',1,'Gall',98),
 (5,'Chandima','Walipitiya','2001-01-15',0,'Nuwara',90),
 (6,'Chaamara','Delpachithra','1995-06-02',1,'Mathara',78),
 (7,'Shenaya','David','1996-08-20',0,'Melborn',56),
 (8,'Lisa','Cambidge','1994-03-10',0,'New Yourk',89),
 (9,'Samantha','Kotugoda','1994-03-11',1,'Kurunagala',88),
 (10,'Sumanaa','Kaluaarchi','1990-06-22',0,'Puthtalama',96);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `terminal 1`
--

DROP TABLE IF EXISTS `terminal 1`;
CREATE TABLE `terminal 1` (
  `BillNumber` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Disscount` varchar(10) NOT NULL,
  `Date` varchar(9) NOT NULL,
  `Items` varchar(60) NOT NULL,
  `Last amount` varchar(45) NOT NULL,
  PRIMARY KEY (`BillNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `terminal 1`
--

/*!40000 ALTER TABLE `terminal 1` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminal 1` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(16) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `FirstName` varchar(60) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `RecordDate` date NOT NULL,
  `Gender` tinyint(1) unsigned NOT NULL,
  `Status` varchar(45) NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`UserID`,`UserName`,`Password`,`FirstName`,`Email`,`RecordDate`,`Gender`,`Status`) VALUES 
 (1,'admin','','Anne vile','Active','2018-06-25',1,'Active'),
 (2,'admin','123','Anne vile','Active','2018-06-25',0,''),
 (5,'ishara','123456789','ishara','iurplayer4@gmail.com','2018-07-05',0,''),
 (6,'asdasd','123456789','Saman','ggdtdt','2018-07-26',1,''),
 (7,'Randila','123456789','Randila','randila@gmail.com','2018-07-26',1,'Active'),
 (8,'udaya','','udaya','udaya@gmail.com','2018-07-27',1,'Deleted');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
