CREATE DATABASE parqueadero;
USE parqueadero;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    contraseña VARCHAR(255) NOT NULL,
    rol ENUM('admin', 'usuario') NOT NULL
);
CREATE TABLE vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(6) NOT NULL,
    hora_entrada INT NOT NULL,
    hora_salida INT,
    ubicacion VARCHAR(255) NOT NULL,
    tipo_vehiculo ENUM('carro', 'motocicleta', 'cicla') NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
