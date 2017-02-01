use uber_test;

set FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE cars;
TRUNCATE TABLE cities;
TRUNCATE TABLE drivers;
TRUNCATE TABLE passengers;
TRUNCATE TABLE trips;
set FOREIGN_KEY_CHECKS = 1;

INSERT INTO `cities`
  (`id`, `version`, `name`,     `state`,    `day_rate`,   `night_rate`,   `created`,            `modified`)
VALUES
  (1,     0,        'Delhi',    'Delhi',    20.00,        10.00,          '2017-02-01 06:31:45','2017-02-01 06:31:45'),
  (2,     0,        'Lucknow',  'UP',       15.00,        7.00,           '2017-02-01 06:31:45','2017-02-01 06:31:45');

INSERT INTO `drivers`
  (`id`,  `version`,  `name`,   `age`,  `gender`,       `license`,  `violations`, `created`,            `modified`)
VALUES
  (1,     0,          'Bunti',   30,     'MALE',        'DL001',         1,            '2017-02-01 00:27:39','2017-02-01 00:27:39'),
  (2,     0,          'Babali',  30,     'FEMALE',      'DL002',         0,            '2017-02-01 00:27:39','2017-02-01 00:27:39');

INSERT INTO `cars`
  (`id`, `version`, `make`, `model`, `year`, `type`,  `vin`,     `city_id`, `driver_id`, `created`,            `modified`)
VALUES
  (1,     0,        'BMW',   'X56',   2015,   'ORD',  'ASDF',     1,        2,       '2017-02-01 06:31:45','2017-02-01 06:31:45'),
  (2,     0,        'AUDI',  'A4',    2016,   'LUX',  'QWERTY',   2,        1,       '2017-02-01 06:31:45','2017-02-01 06:31:45');


INSERT INTO `passengers`
  (`id`,  `version`,  `name`,     `age`,  `gender`,     `credit_balance`, `created`,            `modified`)
VALUES
  (1,     0,          'Pappu',     25,     'MALE',      100.00,           '2017-02-01 00:59:14','2017-02-01 00:59:14'),
  (2,     0,          'Pappi',     25,     'FEMALE',    100.00,           '2017-02-01 00:59:14','2017-02-01 00:59:14');


INSERT INTO `trips`
  (`id`,  `version`,   `start`,               `stop`,                 `distance`,   `cost`,   `tip`,   `car_id`,   `passenger_id`,   `created`,             `modified`)
VALUES
  (1,     0,          '2017-02-01 00:59:14',  '2017-02-01 02:59:14',  10.00,        10.00,    0.10,     1,          1,             '2017-02-01 00:59:14','2017-02-01 00:59:14'),
  (2,     0,          '2017-02-01 00:59:14',  '2017-02-01 02:59:14',  20.00,        20.00,    0.20,     2,          2,             '2017-02-01 00:59:14','2017-02-01 00:59:14'),
  (3,     0,          '2017-02-01 00:59:14',  '2017-02-01 02:59:14',  15.00,        15.00,    0.15,     2,          2,             '2017-02-01 00:59:14','2017-02-01 00:59:14'),
  (4,     0,          '2017-02-01 00:59:14',  '2017-02-01 02:59:14',  12.00,        12.00,    0.12,     1,          1,             '2017-02-01 00:59:14','2017-02-01 00:59:14');
