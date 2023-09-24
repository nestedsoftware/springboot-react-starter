CREATE TABLE IF NOT EXISTS ITEMS   (
id INT AUTO_INCREMENT  PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

INSERT INTO items (name) VALUES ('coffee');
INSERT INTO items (name) VALUES ('tea');
INSERT INTO items (name) VALUES ('cookies');
INSERT INTO items (name) VALUES ('cupcakes');
INSERT INTO items (name) VALUES ('muffins');