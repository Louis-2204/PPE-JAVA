-- MySQL dump 10.13  Distrib 5.7.31, for Win64 (x86_64)

--

-- Host: localhost    Database: autoecole

-- ------------------------------------------------------

-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */

;

/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */

;

/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */

;

/*!40101 SET NAMES utf8 */

;

/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */

;

/*!40103 SET TIME_ZONE='+00:00' */

;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */

;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */

;

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */

;

/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */

;

--

-- Table structure for table `cours_conduite`

--

DROP TABLE IF EXISTS `cours_conduite`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `cours_conduite` (
        `id_cc` int(11) NOT NULL AUTO_INCREMENT,
        `prixseance_cc` decimal(8, 2) NOT NULL,
        `id_v` int(11) NOT NULL,
        `id_f` int(11) NOT NULL,
        PRIMARY KEY (`id_cc`),
        KEY `id_v` (`id_v`),
        KEY `id_f` (`id_f`),
        CONSTRAINT `cours_conduite_ibfk_1` FOREIGN KEY (`id_v`) REFERENCES `vehicule` (`id_v`),
        CONSTRAINT `cours_conduite_ibfk_2` FOREIGN KEY (`id_f`) REFERENCES `formule` (`id_f`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 75 DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `eleve`

--

DROP TABLE IF EXISTS `eleve`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `eleve` (
        `id_e` int(11) NOT NULL AUTO_INCREMENT,
        `nom_e` varchar(50) NOT NULL,
        `prenom_e` varchar(50) NOT NULL,
        `datenai_e` date NOT NULL,
        `ville_e` varchar(50) NOT NULL,
        `adresse_e` varchar(50) NOT NULL,
        `email_e` varchar(255) NOT NULL,
        `mdp_e` varchar(255) NOT NULL,
        `tel_e` char(10) NOT NULL,
        `codepos_e` char(5) NOT NULL,
        `dateinscrip_e` date NOT NULL,
        `sexe` char(1) DEFAULT NULL,
        `id_formation` int(11) DEFAULT NULL,
        PRIMARY KEY (`id_e`),
        KEY `FK_FORMATION` (`id_formation`),
        CONSTRAINT `FK_FORMATION` FOREIGN KEY (`id_formation`) REFERENCES `formule` (`id_f`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 13 DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `etablissement`

--

DROP TABLE IF EXISTS `etablissement`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `etablissement` (
        `degre` int(11) NOT NULL AUTO_INCREMENT,
        `nom` varchar(50) NOT NULL,
        `adresse` varchar(50) NOT NULL,
        `codepostal` char(5) NOT NULL,
        PRIMARY KEY (`degre`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Dumping data for table `etablissement`

--

LOCK TABLES `etablissement` WRITE;

/*!40000 ALTER TABLE `etablissement` DISABLE KEYS */

;

/*!40000 ALTER TABLE `etablissement` ENABLE KEYS */

;

UNLOCK TABLES;

--

-- Table structure for table `etudiant`

--

DROP TABLE IF EXISTS `etudiant`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `etudiant` (
        `id_et` int(11) NOT NULL AUTO_INCREMENT,
        `niveau_etude` varchar(50) NOT NULL,
        `reduction` float NOT NULL,
        `nom_et` varchar(50) NOT NULL,
        `prenom_et` varchar(50) NOT NULL,
        `datenai_et` date NOT NULL,
        `ville_et` varchar(50) NOT NULL,
        `adresse_et` varchar(50) NOT NULL,
        `tel_et` char(10) NOT NULL,
        `codepos_et` char(5) NOT NULL,
        `dateinscrip_et` datetime NOT NULL,
        `sexe_et` char(1) DEFAULT NULL,
        `degre` int(11) NOT NULL,
        PRIMARY KEY (`id_et`),
        KEY `degre` (`degre`),
        CONSTRAINT `etudiant_ibfk_1` FOREIGN KEY (`degre`) REFERENCES `etablissement` (`degre`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Dumping data for table `etudiant`

--

LOCK TABLES `etudiant` WRITE;

/*!40000 ALTER TABLE `etudiant` DISABLE KEYS */

;

/*!40000 ALTER TABLE `etudiant` ENABLE KEYS */

;

UNLOCK TABLES;

--

-- Table structure for table `formule`

--

DROP TABLE IF EXISTS `formule`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `formule` (
        `id_f` int(11) NOT NULL AUTO_INCREMENT,
        `nom_f` varchar(50) NOT NULL,
        `prix_f` decimal(15, 2) NOT NULL,
        `nb_heures` float(4, 2) DEFAULT NULL,
        `type_boite` enum('auto', 'manuel') DEFAULT NULL,
        PRIMARY KEY (`id_f`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 30 DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `moniteur`

--

DROP TABLE IF EXISTS `moniteur`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `moniteur` (
        `id_m` int(11) NOT NULL AUTO_INCREMENT,
        `nom_m` varchar(50) NOT NULL,
        `prenom_m` varchar(50) NOT NULL,
        `dateembauche_m` date NOT NULL,
        `adresse_m` varchar(50) NOT NULL,
        `dateobtentionBAFM` date NOT NULL,
        `codpos_m` char(5) NOT NULL,
        `tel_m` char(10) NOT NULL,
        `mdp_m` varchar(500) NOT NULL,
        `email_m` varchar(255) NOT NULL,
        `ville_m` varchar(50) NOT NULL,
        PRIMARY KEY (`id_m`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 16 DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `paiement`

--

DROP TABLE IF EXISTS `paiement`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `paiement` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `id_f` int(11) NOT NULL,
        `payment_id` varchar(255) NOT NULL,
        `payment_status` text NOT NULL,
        `payment_amount` text NOT NULL,
        `payment_currency` text NOT NULL,
        `payment_date` datetime NOT NULL,
        `payer_email` text NOT NULL,
        PRIMARY KEY (`id`),
        KEY `id_f` (`id_f`),
        CONSTRAINT `paiement_ibfk_1` FOREIGN KEY (`id_f`) REFERENCES `formule` (`id_f`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Dumping data for table `paiement`

--

LOCK TABLES `paiement` WRITE;

/*!40000 ALTER TABLE `paiement` DISABLE KEYS */

;

/*!40000 ALTER TABLE `paiement` ENABLE KEYS */

;

UNLOCK TABLES;

--

-- Table structure for table `photoeleve`

--

DROP TABLE IF EXISTS `photoeleve`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `photoeleve` (
        `id_photo` int(11) NOT NULL AUTO_INCREMENT,
        `type_photo` varchar(25) NOT NULL,
        `desc_photo` varchar(100) DEFAULT NULL,
        `taille_photo` varchar(25) NOT NULL,
        `nom_photo` varchar(50) NOT NULL,
        `id_eleve` int(11) NOT NULL,
        PRIMARY KEY (`id_photo`),
        KEY `id_eleve` (`id_eleve`),
        CONSTRAINT `photoeleve_ibfk_1` FOREIGN KEY (`id_eleve`) REFERENCES `eleve` (`id_e`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 6 DEFAULT CHARSET = latin1;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `planning`

--

DROP TABLE IF EXISTS `planning`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `planning` (
        `id_cc` int(11) NOT NULL,
        `id_e` int(11) NOT NULL,
        `id_m` int(11) NOT NULL,
        `datehd` datetime NOT NULL,
        `datehf` datetime DEFAULT NULL,
        `etat` varchar(50) NOT NULL,
        PRIMARY KEY (
            `id_cc`,
            `id_e`,
            `id_m`,
            `datehd`
        ),
        KEY `id_e` (`id_e`),
        KEY `id_m` (`id_m`),
        CONSTRAINT `planning_ibfk_1` FOREIGN KEY (`id_e`) REFERENCES `eleve` (`id_e`),
        CONSTRAINT `planning_ibfk_2` FOREIGN KEY (`id_m`) REFERENCES `moniteur` (`id_m`),
        CONSTRAINT `planning_ibfk_3` FOREIGN KEY (`id_cc`) REFERENCES `cours_conduite` (`id_cc`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Table structure for table `roule`

--

DROP TABLE IF EXISTS `roule`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `roule` (
        `id_v` int(11) NOT NULL,
        `annee_mois` year(4) NOT NULL,
        `nb_km_mois` float(8, 2) DEFAULT NULL,
        PRIMARY KEY (`id_v`),
        CONSTRAINT `roule_ibfk_1` FOREIGN KEY (`id_v`) REFERENCES `vehicule` (`id_v`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Dumping data for table `roule`

--

LOCK TABLES `roule` WRITE;

/*!40000 ALTER TABLE `roule` DISABLE KEYS */

;

/*!40000 ALTER TABLE `roule` ENABLE KEYS */

;

UNLOCK TABLES;

--

-- Table structure for table `salarie`

--

DROP TABLE IF EXISTS `salarie`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `salarie` (
        `id_s` int(11) NOT NULL AUTO_INCREMENT,
        `nom_entreprise` varchar(50) NOT NULL,
        `nom_s` varchar(50) NOT NULL,
        `prenom_s` varchar(50) NOT NULL,
        `datenai_s` date NOT NULL,
        `ville_s` varchar(50) NOT NULL,
        `adresse_s` varchar(255) NOT NULL,
        `tel_s` char(10) NOT NULL,
        `codepos_s` char(5) NOT NULL,
        `sexe_s` char(1) DEFAULT NULL,
        `dateinscrip_s` datetime NOT NULL,
        PRIMARY KEY (`id_s`)
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

--

-- Dumping data for table `salarie`

--

LOCK TABLES `salarie` WRITE;

/*!40000 ALTER TABLE `salarie` DISABLE KEYS */

;

/*!40000 ALTER TABLE `salarie` ENABLE KEYS */

;

UNLOCK TABLES;

--

-- Table structure for table `vehicule`

--

DROP TABLE IF EXISTS `vehicule`;

/*!40101 SET @saved_cs_client     = @@character_set_client */

;

/*!40101 SET character_set_client = utf8 */

;

CREATE TABLE
    `vehicule` (
        `id_v` int(11) NOT NULL AUTO_INCREMENT,
        `type_v` varchar(20) NOT NULL,
        `model_v` varchar(20) NOT NULL,
        `marque_v` varchar(15) NOT NULL,
        `annneimmatri_v` year(4) NOT NULL,
        `anneachat_v` year(4) NOT NULL,
        PRIMARY KEY (`id_v`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 5 DEFAULT CHARSET = utf8mb4;

/*!40101 SET character_set_client = @saved_cs_client */

;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */

;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */

;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */

;

/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */

;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */

;

/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */

;

/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */

;

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */

;

-- Dump completed on 2023-01-20 14:31:08