-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.33-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema stock
--

CREATE DATABASE IF NOT EXISTS stock;
USE stock;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(40) NOT NULL,
  `date_of_birth` varchar(45) NOT NULL,
  `phone_no` double NOT NULL,
  `admin_id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`name`,`date_of_birth`,`phone_no`,`admin_id`,`password`) VALUES 
 ('k','5 Jul, 2019',0,'2','p'),
 ('2','11 Jul, 2019',0,'2e','pe'),
 ('manpreet','25 Jul, 2019',8837750131,'manpreet','123456789'),
 ('m','5 Jul, 2019',0,'o','1');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `bill`
--

DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `product` varchar(100) NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `c_name` varchar(45) NOT NULL,
  `c_address` varchar(45) NOT NULL,
  `c_number` varchar(45) NOT NULL,
  `c_date` varchar(45) NOT NULL,
  `rate` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` (`product`,`quantity`,`c_name`,`c_address`,`c_number`,`c_date`,`rate`) VALUES 
 ('abc',50,'manp','23 hhh','97458','2 Jul, 2019',''),
 ('abc',12,'jTextField2','jTextField3','jTextField4','12 Jul, 2019',''),
 ('abc',1,'jTextField2','jTextField3','jTextField4','6 Jul, 2019',''),
 ('da',1,'jTextField2','jTextField3','jTextField4','6 Jul, 2019',''),
 ('abc',55,'g','g','44','5 Jul, 2019',''),
 ('da',55,'g','g','44','5 Jul, 2019',''),
 ('abc',5,'mA','GGG','55','4 Jul, 2019',''),
 ('abc',3,'','','','9 Jul, 2019',''),
 ('abc',29,'S','S','S','6 Aug, 2019',''),
 ('da',29,'S','S','S','6 Aug, 2019',''),
 ('da',29,'S','S','S','6 Aug, 2019',''),
 ('abc',22,'a','a','3','8 Aug, 2019',''),
 ('abc',2,'r','r','3','12 Aug, 2019','');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;


--
-- Definition of table `daliy`
--

DROP TABLE IF EXISTS `daliy`;
CREATE TABLE `daliy` (
  `date` varchar(10) NOT NULL,
  `custrum` varchar(30) NOT NULL,
  `custrum_no` double NOT NULL,
  `address` varchar(50) NOT NULL,
  `pending_done` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daliy`
--

/*!40000 ALTER TABLE `daliy` DISABLE KEYS */;
INSERT INTO `daliy` (`date`,`custrum`,`custrum_no`,`address`,`pending_done`) VALUES 
 ('1','m',2,'k',888),
 ('1','m',2,'k',888),
 ('99`','hhhh',88,'bb',88),
 ('2','kk',22,'e',2),
 ('2','kk',22,'e',2),
 ('2','k',22,'e',2),
 ('2','k',22,'e',2),
 ('2','k',22,'e',2);
/*!40000 ALTER TABLE `daliy` ENABLE KEYS */;


--
-- Definition of table `dealer`
--

DROP TABLE IF EXISTS `dealer`;
CREATE TABLE `dealer` (
  `dealer_id` int(10) unsigned NOT NULL,
  `dealer_name_first` varchar(55) NOT NULL,
  `dealer_name_last` varchar(45) NOT NULL,
  `dealer_gender` varchar(45) NOT NULL,
  `dealer_address` varchar(500) NOT NULL,
  `dealer_phone_code` int(4) unsigned NOT NULL,
  `dealer_phone_no` int(10) unsigned NOT NULL,
  `dealer_pin_code` int(10) unsigned NOT NULL,
  `dealer_poducts` varchar(100) NOT NULL,
  `dealer_other_contact_no` int(10) unsigned NOT NULL,
  `aadhar_no` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`dealer_id`,`aadhar_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dealer`
--

/*!40000 ALTER TABLE `dealer` DISABLE KEYS */;
INSERT INTO `dealer` (`dealer_id`,`dealer_name_first`,`dealer_name_last`,`dealer_gender`,`dealer_address`,`dealer_phone_code`,`dealer_phone_no`,`dealer_pin_code`,`dealer_poducts`,`dealer_other_contact_no`,`aadhar_no`) VALUES 
 (1,'manpr','sing','MALE','54 qww',550,55545,555,'abc',555,5555);
/*!40000 ALTER TABLE `dealer` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `permanent_address` varchar(250) NOT NULL,
  `permanent_city` varchar(45) NOT NULL,
  `permanent_state` varchar(45) NOT NULL,
  `present_address` varchar(250) NOT NULL,
  `present_city` varchar(45) NOT NULL,
  `present_state` varchar(45) NOT NULL,
  `pincode` int(20) unsigned NOT NULL,
  `aadhar_no` int(12) unsigned NOT NULL DEFAULT '12',
  `phone_code` int(10) unsigned NOT NULL,
  `first_phone_no` int(10) unsigned NOT NULL DEFAULT '10',
  `second_phone_no` int(10) unsigned NOT NULL DEFAULT '10',
  `fmaily_contact_no` int(10) unsigned NOT NULL DEFAULT '10',
  `date_of_birth` varchar(20) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`,`name`,`permanent_address`,`permanent_city`,`permanent_state`,`present_address`,`present_city`,`present_state`,`pincode`,`aadhar_no`,`phone_code`,`first_phone_no`,`second_phone_no`,`fmaily_contact_no`,`date_of_birth`,`gender`,`password`) VALUES 
 (7,'7','7','7','7','7','7','7',7,77,7,7,7,7,'','',''),
 (8,'5','8','8','8','8','8','8',8,8,80,8,8,8,'13 Jul, 2019','',''),
 (9,'u','o','o','o','o','o','o',7,7,70,7,7,7,'3 Aug, 2019','Male','hlo');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `labour`
--

DROP TABLE IF EXISTS `labour`;
CREATE TABLE `labour` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(75) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `permanent_address` varchar(200) NOT NULL,
  `permanent_city` varchar(50) NOT NULL,
  `permanent_state` varchar(80) NOT NULL,
  `present_address` varchar(200) NOT NULL,
  `present_city` varchar(50) NOT NULL,
  `present_state` varchar(80) NOT NULL,
  `pincode` int(10) unsigned NOT NULL,
  `aadhar_no` int(12) unsigned NOT NULL,
  `phone_code` int(10) unsigned NOT NULL,
  `first_phone_no` int(10) unsigned NOT NULL,
  `second_phone_no` int(10) unsigned NOT NULL,
  `fmaily_contact_no` int(10) unsigned NOT NULL,
  `gender` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `labour`
--

/*!40000 ALTER TABLE `labour` DISABLE KEYS */;
INSERT INTO `labour` (`id`,`name`,`date_of_birth`,`permanent_address`,`permanent_city`,`permanent_state`,`present_address`,`present_city`,`present_state`,`pincode`,`aadhar_no`,`phone_code`,`first_phone_no`,`second_phone_no`,`fmaily_contact_no`,`gender`,`password`) VALUES 
 (1,'m','2 Aug, 2019','o','o','o','o','o','o',9,0,0,0,0,0,'Female','hlo');
/*!40000 ALTER TABLE `labour` ENABLE KEYS */;


--
-- Definition of table `main_stock`
--

DROP TABLE IF EXISTS `main_stock`;
CREATE TABLE `main_stock` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product` varchar(45) NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `rate` int(10) unsigned NOT NULL,
  `total_amount` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `main_stock`
--

/*!40000 ALTER TABLE `main_stock` DISABLE KEYS */;
INSERT INTO `main_stock` (`id`,`product`,`quantity`,`rate`,`total_amount`) VALUES 
 (1,'abc',77,22,1694);
/*!40000 ALTER TABLE `main_stock` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `Product_name` varchar(500) NOT NULL,
  `id_no_of_product` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_no_of_product`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`Product_name`,`id_no_of_product`) VALUES 
 ('abc',1),
 ('da',24),
 ('man',25);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `product` varchar(45) NOT NULL,
  `dealer` varchar(45) NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `rate` int(10) unsigned NOT NULL,
  `addtional` int(10) unsigned NOT NULL,
  `total_amount` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` (`product`,`dealer`,`quantity`,`rate`,`addtional`,`total_amount`) VALUES 
 ('p1p','manpreet',5,5,5,30),
 ('abc','manpr',65,55,5,3580),
 ('abc','manpr',10,15,10,160),
 ('abc','manpr',2,2,2,4);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;


--
-- Definition of table `tab`
--

DROP TABLE IF EXISTS `tab`;
CREATE TABLE `tab` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `hlo` varchar(45) NOT NULL,
  `i` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tab`
--

/*!40000 ALTER TABLE `tab` DISABLE KEYS */;
INSERT INTO `tab` (`id`,`hlo`,`i`) VALUES 
 (1,'fdgf','qewfdfv'),
 (2,'fdgf','qewfdfv'),
 (3,'HLO','HHHH'),
 (4,'jl','jj'),
 (5,'h','h'),
 (6,'lo','jj'),
 (7,'jj','jj'),
 (8,'lo','jj'),
 (9,'jj','jj');
/*!40000 ALTER TABLE `tab` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
