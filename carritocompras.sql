-- Creación de la base de datos "carritocompras"
CREATE DATABASE carritocompras;

-- Uso de la base de datos "carritocompras"
USE carritocompras;

-- Creación de la tabla "cliente"
CREATE TABLE cliente (
  id INTEGER NOT NULL PRIMARY KEY,
  nombres VARCHAR(255) NOT NULL,
  apellidos VARCHAR(255) NOT NULL,
  dni VARCHAR(20) NOT NULL,
  telefono VARCHAR(20),
  email VARCHAR(255)
);

-- Creación de la tabla "venta"
CREATE TABLE venta (
  id INTEGER NOT NULL PRIMARY KEY,
  id_cliente INTEGER NOT NULL,
  fecha DATE NOT NULL,
  FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

-- Creación de la tabla "producto"
CREATE TABLE producto (
  id INTEGER NOT NULL PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  precio DECIMAL(10,2) NOT NULL
);

-- Creación de la tabla "detalle_venta"
CREATE TABLE detalle_venta (
  id INTEGER NOT NULL PRIMARY KEY,
  id_venta INTEGER NOT NULL,
  id_producto INTEGER NOT NULL,
  cantidad INTEGER NOT NULL,
  FOREIGN KEY (id_venta) REFERENCES venta(id),
  FOREIGN KEY (id_producto) REFERENCES producto(id)
);
