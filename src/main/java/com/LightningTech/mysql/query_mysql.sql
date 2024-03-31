DROP SCHEMA IF EXISTS LightningTechnologies; 
DROP USER IF EXISTS 'clienteLT'@'%'; 
CREATE SCHEMA LightningTechnologies;

CREATE USER 'clienteLT'@'%' IDENTIFIED BY 'usuario_LT'; 
GRANT ALL PRIVILEGES ON LightningTechnologies.* TO 'clienteLT'@'%'; 
FLUSH PRIVILEGES;

CREATE TABLE LightningTechnologies.marca (
  id_marca INT NOT NULL AUTO_INCREMENT,
  nombre_marca VARCHAR(30),
  PRIMARY KEY (id_marca),
  INDEX (nombre_marca) 
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.tipoCI (
  id_tipoCI INT NOT NULL AUTO_INCREMENT,
  nombre_tipoCI VARCHAR(30),
  PRIMARY KEY (id_tipoCI),
  INDEX (nombre_tipoCI)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.componentesLaptop (
  id_componentesLaptop INT NOT NULL AUTO_INCREMENT,
  nombre_componentesLaptop VARCHAR(30),
  PRIMARY KEY (id_componentesLaptop),
  INDEX (nombre_componentesLaptop) 
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE LightningTechnologies.equipos (
  id_equipos INT NOT NULL AUTO_INCREMENT,
  modelo VARCHAR(30) NOT NULL,
  marca VARCHAR(30) NOT NULL, 
  tipoCI VARCHAR(30) NOT NULL, 
  procesador VARCHAR(30) NOT NULL,
  precio INT NOT NULL,
  ruta_imagen VARCHAR(1024),
  PRIMARY KEY (id_equipos),
  CONSTRAINT fk_equipos_marca FOREIGN KEY (marca) REFERENCES LightningTechnologies.marca(nombre_marca),
  CONSTRAINT fk_equipos_tipoCI FOREIGN KEY (tipoCI) REFERENCES LightningTechnologies.tipoCI(nombre_tipoCI),
  CONSTRAINT fk_equipos_procesador FOREIGN KEY (procesador) REFERENCES LightningTechnologies.componentesLaptop(nombre_componentesLaptop)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Laptop');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Teclado');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Mouse');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Headset');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Monitor');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Grafica');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Fuente de Poder');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Memoria RAM');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Procesador');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Enfriamiento');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Tarjeta Madre');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Almacenamiento');
INSERT INTO LightningTechnologies.tipoCI (nombre_tipoCI) VALUES ('Case');

INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('HP');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Dell');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Lenovo');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Razer');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Logitech');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Asus');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Gigabyte');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Zotac');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('RedDragon');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Corsair');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Be Quiet');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('TeamGroup');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('KINGSTON');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('Intel');
INSERT INTO LightningTechnologies.marca (nombre_marca) VALUES ('AMD');

INSERT INTO LightningTechnologies.componentesLaptop (nombre_componentesLaptop) VALUES ('AMD');
INSERT INTO LightningTechnologies.componentesLaptop (nombre_componentesLaptop) VALUES ('Intel');

INSERT INTO LightningTechnologies.equipos (modelo, marca, tipoCI, procesador, ruta_imagen, precio) VALUES ('Pavilion 15-EH3047NR', 'HP', 'Laptop', 'AMD', 'https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c08221934.png?impolicy=Png_Res', 439900);
INSERT INTO LightningTechnologies.equipos (modelo, marca, tipoCI, procesador, ruta_imagen, precio) VALUES ('Inspiron 3520', 'Dell', 'Laptop', 'Intel', 'https://walmartcr.vtexassets.com/arquivos/ids/550279/Laptop-DELL-Inspiron-3520-SPA-i3-8GB-256GB-W11H-9C9JY-15-6-pulgadas-3-98429.jpg?v=638445369776100000', 540900);
INSERT INTO LightningTechnologies.equipos (modelo, marca, tipoCI, procesador, ruta_imagen, precio) VALUES ('Thinkbook 16 Gen4', 'Lenovo', 'Laptop', 'AMD', 'https://p1-ofp.static.pub/fes/cms/2021/12/17/ephit8bi4waypyhk5ayf20s55uhtf3918030.png', 570900);
INSERT INTO LightningTechnologies.equipos (modelo, marca, tipoCI, procesador, ruta_imagen, precio) VALUES ('IdeaPad 3', 'Lenovo', 'Laptop', 'Intel', 'https://p3-ofp.static.pub/fes/cms/2022/12/28/lnfmv13jwu5nb0xzzmczeytk58lh6e366455.png', 434990);

CREATE TABLE LightningTechnologies.perifericos (
  id_perifericos INT NOT NULL AUTO_INCREMENT,
  modelo VARCHAR(30) NOT NULL,
  marca VARCHAR(30) NOT NULL, 
  tipoCI VARCHAR(30) NOT NULL, 
  precio INT NOT NULL,
  ruta_imagen VARCHAR(1024),
  PRIMARY KEY (id_perifericos),
  CONSTRAINT fk_perifericos_marca FOREIGN KEY (marca) REFERENCES LightningTechnologies.marca(nombre_marca),
  CONSTRAINT fk_perifericos_tipoCI FOREIGN KEY (tipoCI) REFERENCES LightningTechnologies.tipoCI(nombre_tipoCI)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO LightningTechnologies.perifericos (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('G435 LightSpeed', 'Logitech', 'Headset', 'https://resource.logitechg.com/w_692,c_lpad,ar_4:3,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/gaming/en/products/g435/swatches/g435-gaming-headset-gallery-3-black.png?v=1', 30000);
INSERT INTO LightningTechnologies.perifericos (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('TUF VG27AQ3A', 'Asus', 'Monitor', 'https://dlcdnwebimgs.asus.com/gain/4f23e193-a298-461d-ada5-76c1526d6681/w185', 62990);
INSERT INTO LightningTechnologies.perifericos (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('BASILISK V3', 'Razer', 'Mouse', 'https://i.insider.com/651eeda69f7ca8b2bbda86dd',35990);
INSERT INTO LightningTechnologies.perifericos (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('HUNTSMAN V2 ANALOG', 'Razer', 'Teclado', 'https://images-ext-1.discordapp.net/external/bkJfuyUDe8KvMgVKdwLCxUSQ6wOzjCboX55dJdnm8DU/https/extremetechcr.com/tienda/17082/razer-huntsman-v2-analog-espanol.jpg?format=webp',129990);

CREATE TABLE LightningTechnologies.componentes (
  id_componentes INT NOT NULL AUTO_INCREMENT,
  modelo VARCHAR(30) NOT NULL,
  marca VARCHAR(30) NOT NULL, 
  tipoCI VARCHAR(30) NOT NULL, 
  precio INT NOT NULL,
  ruta_imagen VARCHAR(1024),
  PRIMARY KEY (id_componentes),
  CONSTRAINT fk_componentes_marca FOREIGN KEY (marca) REFERENCES LightningTechnologies.marca(nombre_marca),
  CONSTRAINT fk_componentes_tipoCI FOREIGN KEY (tipoCI) REFERENCES LightningTechnologies.tipoCI(nombre_tipoCI)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('B450M DS3H V2', 'Gigabyte', 'Tarjeta Madre', 'https://static.gigabyte.com/StaticFile/Image/Global/dbe63d1042a65e0805a35e69bf24016e/Product/25763/png/500',67900);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('RTX 4070 12GB', 'Zotac', 'Grafica', 'https://www.zotac.com/us/system/files/styles/w1024/private/product_gallery/graphics_cards/zt-d40720j-10p-image01.jpg?itok=rOW__I2k',384995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('Cooler CCW3000', 'RedDragon', 'Enfriamiento', 'https://redragon.es/content/uploads/2021/06/CCW3000.png',29995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('CORE i7 14700', 'Intel', 'Procesador', 'https://extremetechcr.com/tienda/33208-large_default/intel-core-i7-14700.jpg',269995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('RYZEN 5 7600X', 'AMD', 'Procesador', 'https://extremetechcr.com/tienda/21831-large_default/amd-ryzen-5-7600x.jpg',115995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('PURE BASE 500DX ARGB', 'Be Quiet', 'Case', 'https://extremetechcr.com/tienda/13734-thickbox_default/be-quiet-pure-base-500dx-argb-negro.jpg',72995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('DELTA 16GB DDR5', 'TeamGroup', 'Memoria RAM', 'https://extremetechcr.com/tienda/30120-large_default/teamgroup-t-force-delta-rgb-16gb-ddr5-6000-negro.jpg',28995);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('PRIME 850W GOLD', 'Asus', 'Fuente de Poder', 'https://extremetechcr.com/tienda/34599-large_default/asus-prime-850w-gold-modular.jpg',79990);
INSERT INTO LightningTechnologies.componentes (modelo, marca, tipoCI, ruta_imagen, precio) VALUES ('A400 960 GB', 'KINGSTON', 'Almacenamiento', 'https://extremetechcr.com/tienda/10302-large_default/kingston-a400-960-gb.jpg',44995);
