CREATE TABLE IF NOT EXISTS `notation_endgame` (
  `notation_endgame_id` NOT NULL PRIMARY KEY,
  `endgame_id` INT NOT NULL,
  `sequence` INT(2) NOT NULL,
  `movement` VARCHAR(10) NOT NULL,
  FOREIGN KEY (endgame_id) REFERENCES study_chess.endgame_id (endgame_id)
) ENGINE=InnoDB;