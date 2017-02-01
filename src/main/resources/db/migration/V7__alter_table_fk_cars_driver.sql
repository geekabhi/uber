ALTER TABLE   `cars`
ADD COLUMN    `driver_id` INT NULL AFTER `city_id`,
ADD INDEX     `fk_driver_id_idx` (`driver_id` ASC);

ALTER TABLE     `cars`
ADD CONSTRAINT  `fk_driver_id`  FOREIGN KEY     (`driver_id`) REFERENCES  `drivers` (`id`)  ON DELETE NO ACTION ON UPDATE NO ACTION;