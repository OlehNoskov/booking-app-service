DROP TABLE IF EXISTS hotels;
DROP TABLE IF EXISTS cities;

CREATE TABLE cities
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE hotels
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    city_id     INTEGER      NOT NULL,
    address     VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL
);

/** Cities **/
INSERT INTO cities (id, name)
VALUES (1, 'Kyiv'),
       (2, 'Kharkiv'),
       (3, 'Dnipro'),
       (4, 'Lviv'),
       (5, 'Zaporizhzhia');

/** Hotels **/
INSERT INTO hotels (id, name, city_id, address, description)
VALUES (1, 'Sunset Paradise', 1, '123 Ocean Ave', 'A beachfront hotel with stunning views.'),
       (2, 'Mountain Retreat', 2, '456 Hillside Rd', 'A serene mountain resort with hiking trails.'),
       (3, 'Urban Oasis', 3, '789 City Blvd', 'A luxurious hotel in the heart of downtown.'),
       (4, 'Countryside Inn', 4, '101 River St', 'A peaceful inn surrounded by nature.'),
       (5, 'Coastal Breeze', 5, '202 Beach Dr', 'A cozy hotel with ocean views and great amenities.'),
       (6, 'Lakeview Lodge', 1, '303 Lake Rd', 'A rustic lodge with a view of the lake.'),
       (7, 'Skyline Suites', 2, '404 Highrise Ln', 'A modern hotel with panoramic city views.'),
       (8, 'Garden Grove', 3, '505 Park St', 'A charming hotel with beautiful gardens.'),
       (9, 'Desert Mirage', 4, '606 Desert Rd', 'An oasis in the desert offering luxurious accommodations.'),
       (10, 'Island Escape', 5, '707 Island Blvd', 'A tropical paradise with private beach access.'),
       (11, 'Historic Haven', 1, '808 Heritage Ln', 'A historic hotel with elegant architecture.'),
       (12, 'Riverfront Retreat', 2, '909 Riverfront Rd', 'A relaxing retreat by the river.'),
       (13, 'Alpine Chalet', 3, '111 Alpine St', 'A cozy chalet nestled in the mountains.'),
       (14, 'City Central', 4, '212 Central Ave', 'A convenient hotel located in the city center.'),
       (15, 'Seaside Serenity', 5, '313 Shoreline Dr', 'A tranquil hotel with direct beach access.'),
       (16, 'Forest Lodge', 1, '414 Pine Rd', 'A secluded lodge surrounded by lush forests.'),
       (17, 'Metropolitan Grand', 2, '515 Skyline Blvd', 'An upscale hotel with luxury amenities.'),
       (18, 'Safari Inn', 3, '616 Safari Dr', 'A unique hotel offering safari-themed experiences.'),
       (19, 'Oceanfront Escape', 4, '717 Coastal Ave', 'A luxury oceanfront hotel with a spa and fine dining.'),
       (20, 'Winter Wonderland', 5, '818 Snowy St', 'A cozy winter resort perfect for skiing enthusiasts.');
