CREATE TABLE IF NOT EXISTS `opening` (
  `opening_id` NOT NULL PRIMARY KEY,
  `name` VARCHAR(50) NOT NULL,
  `type` VARCHAR(50) NOT NULL,
  `description` VARCHAR(200) NOT NULL
) ENGINE=InnoDB;
