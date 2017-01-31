CREATE TABLE `drivers` (
  `id`          INT                     NOT NULL AUTO_INCREMENT,
  `version`     INT                     NOT NULL DEFAULT 0,
  `name`        VARCHAR(45)             NOT NULL,
  `age`         INT                     NULL,
  `gender`      ENUM('Male', 'Female')  NOT NULL,
  `license`     VARCHAR(45)             NULL,
  `violations`  VARCHAR(45)             NULL,
  `created`     TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`    TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));