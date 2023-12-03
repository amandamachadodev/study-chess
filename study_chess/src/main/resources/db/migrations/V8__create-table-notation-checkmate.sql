CREATE TABLE IF NOT EXISTS `notation_checkmate` (
  `notation_checkmate_id` NOT NULL PRIMARY KEY,
  `checkmate_id` INT NOT NULL,
  `sequence` INT(2) NOT NULL,
  `movement` VARCHAR(10) NOT NULL,
  FOREIGN KEY (checkmate_id) REFERENCES study_chess.checkmate_id (checkmate_id)
) ENGINE=InnoDB;