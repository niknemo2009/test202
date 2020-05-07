CREATE DATABASE  IF NOT EXISTS `book_shop` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `book_shop`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: book_shop
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `inStock` int NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Pride and Prejudice','Jane Austen','AmazonClassics','Written more than two centuries ago, Jane Austen’s enduring story of manners, family, and love continues to delight new generations of readers.',13,111.9),(2,'The Alchemist','Paulo Coelho','HarperTorch','This is the magical story of Santiago, a shepherd boy who dreams of travelling the world to seek the most wonderful treasures known to man. From his home in Spain, he journeys to the markets of Tangiers and, from there, into the Egyptian desert, where a fateful encounter with the alchemist awaits him',7,147.9),(3,'Fahrenheit 451','Ray Bradbury','Diogenes Verlag AG','Ray Bradbury\'s internationally acclaimed novel Fahrenheit 451 is a masterwork of 20th-century literature set in a bleak, dystopian future, narrated here by Academy Award-winning actor Tim Robbins.',19,89.7),(4,'Physics of Impossible','Mitio Kaku','Penguin','Albert Einstein said, \'If at first an idea does not sound absurd, there is no hope for it.\' Physics of the Impossible shows how our most far-fetched ideas today - from Star Trek\'s phasers and teleportation to time travel as envisioned by Back to the Future - are destined to become tomorrow\'s reality.',3,257.8),(5,'Pet Sematary','Stephen King','Hodder','\'The most frightening novel Stephen King has ever written\' - Publisher\'s Weekly',12,153),(8,'Wuthering Heights','Emily Brontë','Macmillan Ltd','Macmillan Ltd',18,97.6),(9,'Perfume: The Story of a Murderer','Patrick Süskind','Penguin','\'A fantastic tale of murder and twisted eroticism controlled by a disgusted loathing of humanity ... Clever, stylish, absorbing and well worth reading\' Literary Review',5,139.96),(10,'1984','George Orwell','Penguin','1984 is George Orwell\'s terrifying vision of a totalitarian future in which everything and everyone is slave to a tyrannical regime.',7,121.5);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES ('Anastasiia','admin','admin','admin@bshop.com'),('Anastasiia','anastasiia','humanity','nastia.gress@gmail.com'),('sdkc','kdjxc','kjd','dvkj'),('Mark','mark','qwerty','mark@ukr.net'),('Mariia','masha01','chnu','masha.2001@gmail.ua'),('Unknown','unknown','secret','unknown@ukr.ua'),('Vladislav','vlad','qwerty','vlad.p@cl.com');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `client` varchar(45) NOT NULL,
  `payment` double NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idorders_UNIQUE` (`id`) /*!80000 INVISIBLE */,
  KEY `clientOrders_idx` (`client`),
  CONSTRAINT `clientOrders` FOREIGN KEY (`client`) REFERENCES `clients` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'anastasiia',238,'confirmed'),(2,'masha01',123.7,'shipped'),(3,'unknown',793,'delivered'),(4,'anastasiia',96.5,'packed'),(5,'mark',176.7,'cancelled'),(6,'vlad',145.8,'delivered'),(7,'anastasiia',154.8,'confirmed'),(8,'masha01',237,'delivered'),(9,'anastasiia',394.8,'shipped'),(37,'masha01',223,'confirmed'),(38,'mark',74.5,'shipped');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-07 10:48:01
