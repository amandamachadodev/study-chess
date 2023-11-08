CREATE TABLE IF NOT EXISTS `tactic` (
  `tactic_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  `description` VARCHAR NOT NULL,
  `notation` VARCHAR,
  PRIMARY KEY (`tactic_id`)
) ENGINE=InnoDB;
