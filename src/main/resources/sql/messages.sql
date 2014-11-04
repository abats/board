#create and use database
CREATE DATABASE IF NOT EXISTS retrobats;
USE retrobats;

#create table
CREATE TABLE IF NOT EXISTS `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(50) NOT NULL,
  `message` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

truncate messages;

#insert test message
INSERT INTO `retrobats`.`messages` (`id`, `author`, `message`) VALUES (NULL, 'Arno', 'Oh hi there!');
INSERT INTO `retrobats`.`messages` (`id`, `author`, `message`) VALUES (NULL, 'Piet', 'Players gonna playyyyy');
INSERT INTO `retrobats`.`messages` (`id`, `author`, `message`) VALUES (NULL, 'Henk', 'Henkie in da hood');