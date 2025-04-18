insert into users (id, email, username, password, role)
values (9991,'admin@test.com', 'Admin', '$2a$10$55Yc2B9h2NFH5LV4PNOluuvNNCF0DC6sEiEMwgj/pwIB/3yXftNK2', 'ROLE_ADMIN'),
       (9992,'user@test.com', 'User', '$2a$10$55Yc2B9h2NFH5LV4PNOluuvNNCF0DC6sEiEMwgj/pwIB/3yXftNK2', 'ROLE_USER');

INSERT INTO sensor (id, name, model, from_value, to_value, type, unit, location, description)
VALUES
    (9999, 'Temperature Sensor', 'TS-100', 10, 50, 'TEMPERATURE', 'CELSIUM', 'Warehouse A', 'A sensor for measuring temperature in the warehouse.'),
    (9998, 'Pressure Sensor', 'PS-200', 0, 200, 'PRESSURE', 'BAR', 'Warehouse B', 'A sensor for measuring pressure in the warehouse.'),
    (9997, 'Voltage Sensor', 'VS-300', 0, 240, 'VOLTAGE', 'VOLTAGE', 'Warehouse C', 'A sensor for measuring voltage in the warehouse.'),
    (9996, 'Humidity Sensor', 'HS-400', 0, 100, 'HUMIDITY', 'PERCENT', 'Warehouse D', 'A sensor for measuring humidity in the warehouse.'),
    (9995, 'High Pressure Sensor', 'HPS-500', 100, 300, 'PRESSURE', 'BAR', 'Warehouse E', 'A sensor for measuring high pressure in the warehouse.'),
    (9994, 'Low Voltage Sensor', 'LVS-600', 0, 50, 'VOLTAGE', 'VOLTAGE', 'Warehouse F', 'A sensor for measuring low voltage in the warehouse.'),
    (9993, 'Temperature Sensor', 'THS-700', 10, 100, 'HUMIDITY', 'PERCENT', 'Warehouse G', 'A sensor for measuring temperature and humidity in the warehouse.'),
    (9992, 'Pressure Sensor', 'PTS-800', 0, 150, 'PRESSURE', 'BAR', 'Warehouse H', 'A sensor for measuring both pressure and temperature in the warehouse.'),
    (9991, 'Voltage Sensor', 'VHS-900', 0, 100, 'HUMIDITY', 'PERCENT', 'Warehouse I', 'A sensor for measuring voltage and humidity in the warehouse.'),
    (9990, 'General Purpose Sensor', 'GPS-1000', 0, 100, 'TEMPERATURE', 'CELSIUM', 'Warehouse J', 'A general purpose sensor for various measurements in the warehouse.');