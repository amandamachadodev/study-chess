CREATE TABLE IF NOT EXISTS `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(200) NOT NULL,
  `password` VARCHAR(200) NOT NULL,
  `role` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;
