CREATE TABLE `drivers` (
  `id`          INT                     NOT NULL AUTO_INCREMENT,
  `version`     INT                     NOT NULL DEFAULT 0,
  `name`        VARCHAR(45)             NOT NULL,
  `age`         INT                     NULL,
  `gender`      ENUM('MALE', 'FEMALE')  NOT NULL,
  `license`     VARCHAR(45)             NULL,
  `violations`  INT                     NOT NULL DEFAULT 0,
  `created`     TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`    TIMESTAMP               NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));