CREATE TABLE `passengers` (
  `id`              INT                     NOT NULL AUTO_INCREMENT,
  `version`         INT                     NOT NULL,
  `name`            VARCHAR(45)             NOT NULL,
  `age`             INT                     NULL,
  `gender`          ENUM('Male', 'Female')  NULL,
  `credit_balance`  DECIMAL(10,2)           NULL DEFAULT 0.00,
  `created`         TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`        TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));