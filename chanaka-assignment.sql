-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    macos10.14
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for Assignment2
CREATE DATABASE IF NOT EXISTS `Assignment2` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `Assignment2`;

-- Dumping structure for table Assignment2.categories
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table Assignment2.categories: ~8 rows (approximately)
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` (`id`, `name`, `description`) VALUES
	(14, 'Category 1', 'Description'),
	(15, 'Category 2', 'Description'),
	(16, 'Category 1', 'Description'),
	(17, 'Category 2', 'Description'),
	(18, 'Category 1', 'Description'),
	(19, 'Category 2', 'Description'),
	(20, 'Category 1', 'Description'),
	(21, 'Category 2', 'Description');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;

-- Dumping structure for table Assignment2.products
CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table Assignment2.products: ~4 rows (approximately)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` (`id`, `name`, `description`, `price`) VALUES
	(9, 'Product 1', 'Description', 100.00),
	(10, 'Product 1', 'Description', 100.00),
	(11, 'Product 1', 'Description', 100.00),
	(12, 'Product 3', 'Description', 100.00);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Dumping structure for table Assignment2.product_category
CREATE TABLE IF NOT EXISTS `product_category` (
  `index_no` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  PRIMARY KEY (`index_no`),
  KEY `FK__products` (`product_id`),
  KEY `FK_categories` (`category_id`),
  CONSTRAINT `FK__products` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_categories` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table Assignment2.product_category: ~8 rows (approximately)
/*!40000 ALTER TABLE `product_category` DISABLE KEYS */;
INSERT INTO `product_category` (`index_no`, `product_id`, `category_id`) VALUES
	(6, 9, 14),
	(7, 9, 15),
	(8, 10, 16),
	(9, 10, 17),
	(10, 11, 18),
	(11, 11, 19),
	(14, 12, 20),
	(15, 12, 21);
/*!40000 ALTER TABLE `product_category` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
