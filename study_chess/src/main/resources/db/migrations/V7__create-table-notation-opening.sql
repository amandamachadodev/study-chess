CREATE TABLE IF NOT EXISTS `notation_opening` (
  `notation_opening_id` NOT NULL PRIMARY KEY,
  `opening_id` INT NOT NULL,
  `sequence` INT(2) NOT NULL,
  `movement` VARCHAR(10) NOT NULL,
  FOREIGN KEY (opening_id) REFERENCES study_chess.opening_id (opening_id)
) ENGINE=InnoDB;