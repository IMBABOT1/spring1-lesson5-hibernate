DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id integer NOT NULL AUTO_INCREMENT primary key, title varchar(255), price integer not null);
INSERT INTO products (title, price) VALUES ('first', 80), ('second', 80), ('third', 80);
