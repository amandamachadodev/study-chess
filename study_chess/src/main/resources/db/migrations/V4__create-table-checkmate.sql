CREATE TABLE IF NOT EXISTS `checkmate` (
  `checkmate_id` NOT NULL PRIMARY KEY,
  `type` VARCHAR(50) NOT NULL,
  `description` VARCHAR(200) NOT NULL
) ENGINE=InnoDB;
