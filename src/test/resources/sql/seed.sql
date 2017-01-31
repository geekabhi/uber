use uber_test;

set FOREIGN_KEY_CHECKS = 0;
truncate table cars;
TRUNCATE TABLE cities;
set FOREIGN_KEY_CHECKS = 1;

INSERT INTO `cars`
(`make`,
`model`,
`year`,
`type`,
`vin`)
VALUES
('BMW', 'X56', 2015 , 'ORD', 'ASDF');
INSERT INTO `cars`
(`make`,
 `model`,
 `year`,
 `type`,
 `vin`)
VALUES
  ('AUDI', 'A4', 2016 , 'LUX', 'QWERTY');

INSERT INTO `cities`
(`name`,
 `state`,
 `day_rate`,
 `night_rate`)
VALUES
  ('delhi', 'delhi', 20.00, 10.00);

INSERT INTO `cities`
(`name`,
 `state`,
 `day_rate`,
 `night_rate`)
VALUES
  ('lucknow', 'UP', 15.00, 7.00);


