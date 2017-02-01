ALTER TABLE `trips`
ADD COLUMN  `car_id`        INT NULL AFTER `tip`,
ADD COLUMN  `passenger_id`  INT NULL AFTER `car_id`,
ADD INDEX   `fk_car_id_idx`       (`car_id` ASC),
ADD INDEX   `fk_passenger_id_idx` (`passenger_id` ASC);


ALTER TABLE `trips`
ADD CONSTRAINT `fk_car_id`        FOREIGN KEY (`car_id`)        REFERENCES `cars` (`id`)        ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_passenger_id`  FOREIGN KEY (`passenger_id`)  REFERENCES `passengers` (`id`)  ON DELETE NO ACTION ON UPDATE NO ACTION;
