ALTER TABLE   `cars`
ADD COLUMN    `city_id`   INT NULL AFTER `vin`,
ADD INDEX     `fk_city_id_idx` (`city_id` ASC);

ALTER TABLE     `cars`
ADD CONSTRAINT  `fk_city_id`  FOREIGN KEY (`city_id`) REFERENCES  `cities` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;