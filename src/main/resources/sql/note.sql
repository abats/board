#create and use database
CREATE DATABASE IF NOT EXISTS retrobats;
USE retrobats;

CREATE TABLE IF NOT EXISTS `note` (
`id` int(11) NOT NULL,
  `author` varchar(30) NOT NULL,
  `type` varchar(256) NOT NULL,
  `message` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

truncate note;

INSERT INTO `retrobats`.`note` (`id`, `author`, `type`, `message`) VALUES (NULL, 'Arno', 'positive', 'Completed the sprint and had a nice party!');
INSERT INTO `retrobats`.`note` (`id`, `author`, `type`, `message`) VALUES (NULL, 'Henk', 'positive', 'Good teamwork, learned a lot this sprint.');
INSERT INTO `retrobats`.`note` (`id`, `author`, `type`, `message`) VALUES (NULL, 'Piet', 'improvement', 'We should put more focus on a single user-story');
INSERT INTO `retrobats`.`note` (`id`, `author`, `type`, `message`) VALUES (NULL, 'Dieter', 'improvement', 'Did not finish the complete sprint');