create database if not exists IEFI;
use IEFI;
create table if not exists Alumnos(
id_alumno int(15) NOT NULL AUTO_INCREMENT,
nombre varchar(50),
apellido varchar(50),
DNI int(12) unique,
PRIMARY KEY (id_alumno)
);