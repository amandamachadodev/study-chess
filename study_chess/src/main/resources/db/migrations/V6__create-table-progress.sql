CREATE TABLE IF NOT EXISTS `progress` (
  `progress_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `opening` DECIMAL,
  `tactic` DECIMAL,
  `checkmate` DECIMAL,
  `endgame` DECIMAL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) REFERENCES study_chess.user (user_id)
) ENGINE=InnoDB;
