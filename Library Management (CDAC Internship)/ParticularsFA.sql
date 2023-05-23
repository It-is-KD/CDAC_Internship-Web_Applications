DROP TABLE IF EXISTS `internship`.`particularsfa`;
CREATE TABLE  `internship`.`particularsfa` (
  `Application_ID` int(10) unsigned NOT NULL auto_increment,
  `seminar` double unsigned default NULL,
  `purchaseBooks` double unsigned default NULL,
  `purchaseFurniture` double unsigned default NULL,
  `costofCM` double unsigned default NULL,
  `purchaseComputer` double unsigned default NULL,
  `renovation` double unsigned default NULL,
  `organisation` double unsigned default NULL,
  `publishing` double unsigned default NULL,
  PRIMARY KEY  (`Application_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;