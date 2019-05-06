-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: college_predictor
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `collegedetails`
--

DROP TABLE IF EXISTS `collegedetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collegedetails` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(200) DEFAULT NULL,
  `Branch` varchar(200) DEFAULT NULL,
  `Rank` varchar(200) DEFAULT NULL,
  `Year` varchar(200) DEFAULT NULL,
  `Cutoff` varchar(200) DEFAULT NULL,
  `Code` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collegedetails`
--

LOCK TABLES `collegedetails` WRITE;
/*!40000 ALTER TABLE `collegedetails` DISABLE KEYS */;
INSERT INTO `collegedetails` VALUES (1,'Santaji','BA','101','2018','120','BKD000013'),(2,'KDK','ME','105','2018','155','11111'),(3,'TGP','EC','155','2018','175','22665');
/*!40000 ALTER TABLE `collegedetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collegeinfo`
--

DROP TABLE IF EXISTS `collegeinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collegeinfo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(200) DEFAULT NULL,
  `Code` varchar(200) DEFAULT NULL,
  `Year` varchar(200) DEFAULT NULL,
  `Branch` varchar(200) DEFAULT NULL,
  `Rank` varchar(200) DEFAULT NULL,
  `Open` varchar(200) DEFAULT NULL,
  `Obc` varchar(200) DEFAULT NULL,
  `ScSt` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collegeinfo`
--

LOCK TABLES `collegeinfo` WRITE;
/*!40000 ALTER TABLE `collegeinfo` DISABLE KEYS */;
INSERT INTO `collegeinfo` VALUES (1,'kzs','BKD000012','2018','BE-civil','101','140','120','110'),(4,'TGP','144564','2017','BE-Information Technology','5548','140','120','115'),(5,'Palloti','2256488','2017','BE-Computer Science','99','180','170','160'),(6,'KDK','5546899','2018','BE-Information Technology','158','160','155','140'),(7,'Kamla Nehru','5566246','2018','BE- Electrical','1556','150','140','130'),(8,'Ramdeo Baba','665984','2018','BE-civil','140','180','167','165'),(9,'Anjuman College of Engineering','4666495','2018','BE-Electronics','156','180','175','165');
/*!40000 ALTER TABLE `collegeinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdetails` (
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetails`
--

LOCK TABLES `userdetails` WRITE;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` VALUES ('Sampat','sam@gmail.com','123');
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-15 14:49:29
