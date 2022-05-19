create database ManejoEmpleados;

use ManejoEmpleados;

create table Departamentos(
idDepartamento int auto_increment not null primary key,
departamentoCodigo int not null,
departamentoNombre varchar(30) not null,
fecha_hora_creacion datetime not null,
fecha_hora_modificacion datetime not null
)auto_increment=1000;

create unique index CodigoDepartamento on Departamentos(departamentoCodigo);

create table Ciudades(
idCiudad int auto_increment not null primary key,
idDepartamento int not null,
foreign key (idDepartamento) references Departamentos(idDepartamento),
nombreCiudad varchar (30) not null,
codigoCiudad int not null
)auto_increment=10000;

create unique index NombreCiudad on Ciudades(nombreCiudad);

create table TipoDoc(
idTipoDoc int not null primary key,
nombreTipoDoc varchar(40) not null
);

create unique index nombreDocumento on TipoDoc(nombreTipoDoc);

create table Empleados(
idEmpleado int auto_increment not null primary key,
tipoDocumentoIdentidad int not null,
foreign key (tipoDocumentoIdentidad) references TipoDoc(idTipoDoc),
documentoNumero int not null,
empleadoNombre varchar (30) not null,
empleadoApellido varchar (30) not null,
idCiudad int not null,
foreign key (idCiudad) references Ciudades(idCiudad),
nombreCiudad varchar (20) not null,
direccion varchar (80) not null,
correoElectronico varchar (50) not null,
telefonoEmpleado int not null,
fecha_hora_creacion datetime not null,
fecha_hora_modificacion datetime not null
)auto_increment=100;

create unique index NumeroDocumento on Empleados(documentoNumero);
