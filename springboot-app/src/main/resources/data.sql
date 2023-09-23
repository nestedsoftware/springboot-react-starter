CREATE TABLE IF NOT EXISTS ITEMS   (
id INT AUTO_INCREMENT  PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

INSERT INTO items (id, name) VALUES (1, 'coffee');
INSERT INTO items (id, name) VALUES (2, 'tea');
INSERT INTO items (id, name) VALUES (3, 'cookies');
INSERT INTO items (id, name) VALUES (4, 'cupcakes');
INSERT INTO items (id, name) VALUES (5, 'muffins');