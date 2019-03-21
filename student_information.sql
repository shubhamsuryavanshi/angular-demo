/*
SQLyog Ultimate - MySQL GUI v8.22 
MySQL - 5.1.71-community : Database - student_information
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`student_information` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `student_information`;

/*Table structure for table `student_profile` */

DROP TABLE IF EXISTS `student_profile`;

CREATE TABLE `student_profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(5) NOT NULL,
  `email` varchar(50) NOT NULL,
  `create_date` date NOT NULL,
  `file` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `mobile_no` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `student_profile` */

insert  into `student_profile`(`id`,`name`,`age`,`gender`,`email`,`create_date`,`file`,`address`,`city`,`mobile_no`) values (1,'NIrmal',20,'male','Nirmalsoni105@gmail.com','2018-05-15',NULL,'Yagnik Road','Rajkot',NULL),(2,'NIrmal',20,'male','Nirmalsoni105@gmail.com','2018-05-15',NULL,'Yagnik Road','Rajkot',NULL),(3,'Virendra',20,'male','Virunkadecha@gmail.com','2018-05-15',NULL,'Yagnik Road','Rajkot',NULL),(4,'Nirmal',20,'male','Nirmalosni@gmail.com','2018-05-17',NULL,'Yagnik Road','Rajkot',NULL),(5,'nirmal',20,'male','Nirmalsoni105@Gmail.com','2018-05-21',NULL,NULL,NULL,NULL),(6,'nirmal',20,'male','Nirmalsoni105@Gmail.com','2018-05-21',NULL,NULL,NULL,NULL),(7,'nirmal',20,'male','Nirmalsoni105@Gmail.com','2018-05-21',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
