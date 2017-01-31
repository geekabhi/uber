CREATE TABLE `cars` (
  `id`        int(11)       NOT NULL AUTO_INCREMENT,
  `version`   int(11)       NOT NULL DEFAULT '0',
  `make`      varchar(45)   DEFAULT NULL,
  `model`     varchar(45)   DEFAULT NULL,
  `year`      year(4)       DEFAULT NULL,
  `type`      varchar(45)   DEFAULT NULL,
  `vin`       varchar(45)   NOT NULL,
  `created`   timestamp     NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`  timestamp     NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)
