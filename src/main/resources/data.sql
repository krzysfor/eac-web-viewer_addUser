DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires (
  id INT IDENTITY(1,1) PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate'),
  ('AAAAA', 'BBB', 'CCCC CC C'),
  ('Kris', 'Sparrow', 'Bla Bla Bla');