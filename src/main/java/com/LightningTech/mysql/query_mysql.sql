DROP SCHEMA IF EXISTS LightningTechnologies; 
DROP USER IF EXISTS 'clienteLT'@'%'; 
CREATE SCHEMA LightningTechnologies;

CREATE USER 'clienteLT'@'%' IDENTIFIED BY 'usuario_LT'; 
GRANT ALL PRIVILEGES ON LightningTechnologies.* TO 'clienteLT'@'%'; 
FLUSH PRIVILEGES;

CREATE TABLE LightningTechnologies.marca (
  id_marca INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30),
  PRIMARY KEY (id_marca)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.tipoCI (
  id_tipoCI INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30),
  PRIMARY KEY (id_tipoCI)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.componentesLaptop (
  id_componentesLaptop INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30),
  PRIMARY KEY (id_componentesLaptop)
  ) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.equipos (
  id_equipos INT NOT NULL AUTO_INCREMENT,
  modelo VARCHAR(30) NOT NULL,
  id_marca INT NOT NULL, 
  id_tipoCI INT NOT NULL, 
  id_procesador INT NOT NULL,
  precio INT NOT NULL,
  ruta_imagen VARCHAR(1024),
  PRIMARY KEY (id_equipos),
  CONSTRAINT fk_equipos_marca FOREIGN KEY (id_marca) REFERENCES LightningTechnologies.marca(id_marca),
  CONSTRAINT fk_equipos_tipoCI FOREIGN KEY (id_tipoCI) REFERENCES LightningTechnologies.tipoCI(id_tipoCI),
  CONSTRAINT fk_equipos_procesador FOREIGN KEY (id_procesador) REFERENCES LightningTechnologies.componentesLaptop(id_componentesLaptop)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO LightningTechnologies.tipoCI (nombre) VALUES ('Laptop');
INSERT INTO LightningTechnologies.tipoCI (nombre) VALUES ('Periferico');
INSERT INTO LightningTechnologies.tipoCI (nombre) VALUES ('Componentes');

INSERT INTO LightningTechnologies.marca (nombre) VALUES ('HP');
INSERT INTO LightningTechnologies.marca (nombre) VALUES ('Dell');
INSERT INTO LightningTechnologies.marca (nombre) VALUES ('Lenovo');

INSERT INTO LightningTechnologies.componentesLaptop (nombre) VALUES ('AMD');
INSERT INTO LightningTechnologies.componentesLaptop (nombre) VALUES ('Intel');

INSERT INTO LightningTechnologies.equipos (modelo, id_marca, id_tipoCI, id_procesador, ruta_imagen,precio) VALUES ('Pavilion 15-EH3047NR', 1, 1, 1, 'null',439900);
INSERT INTO LightningTechnologies.equipos (modelo, id_marca, id_tipoCI, id_procesador, ruta_imagen,precio) VALUES ('Inspiron 3520', 2, 1, 2, 'null', '540900');
INSERT INTO LightningTechnologies.equipos (modelo, id_marca, id_tipoCI, id_procesador, ruta_imagen,precio) VALUES ('Thinkbook 16 Gen4', 3, 1, 1, 'null',570900);