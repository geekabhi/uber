CREATE TABLE `cities` (
  `id`          INT           NOT NULL AUTO_INCREMENT,
  `version`     INT           NOT NULL DEFAULT 0,
  `name`        VARCHAR(45)   NOT NULL,
  `state`       VARCHAR(45)   NOT NULL,
  `day_rate`    DECIMAL(5,2)  NULL,
  `night_rate`  DECIMAL(5,2)  NULL,
  `created`     TIMESTAMP     NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`    TIMESTAMP     NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));