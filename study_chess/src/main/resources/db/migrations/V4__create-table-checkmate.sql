CREATE TABLE IF NOT EXISTS `checkmate` (
  `checkmate_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  `text` VARCHAR NOT NULL,
  `notation` VARCHAR,
  PRIMARY KEY (`checkmate_id`)
) ENGINE=InnoDB;
