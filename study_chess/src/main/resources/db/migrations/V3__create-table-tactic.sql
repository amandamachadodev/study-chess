CREATE TABLE IF NOT EXISTS `tactic` (
  `tactic_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(100) NOT NULL,
  `description` VARCHAR(1400) NOT NULL,
  PRIMARY KEY (`tactic_id`)
) ENGINE=InnoDB;
