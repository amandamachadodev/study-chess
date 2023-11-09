CREATE TABLE IF NOT EXISTS `notation_tactic` (
  `notation_tactic_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `tactic_id` INT NOT NULL,
  `sequence` INT(2) NOT NULL,
  `movement` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`tactic_id`),
  FOREIGN KEY (tactic_id) REFERENCES study_chess.tactic_id (tactic_id)
) ENGINE=InnoDB;