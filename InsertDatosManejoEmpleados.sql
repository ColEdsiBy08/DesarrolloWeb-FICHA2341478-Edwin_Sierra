use ManejoEmpleados;

/*insert datos tabla departamentos*/

insert into departamentos values (default, 111, 'Amazonas', '2022-05-16 19:50:00', current_timestamp());
insert into departamentos values (default, 112, 'Antioquia', '2022-05-16 19:55:20', current_timestamp());
insert into departamentos values (default, 113, 'Bogota', '2022-05-16 19:57:40', current_timestamp());
insert into departamentos values (default, 114, 'Caldas', '2022-05-16 20:00:00', current_timestamp());
insert into departamentos values (default, 115, 'Cesar', '2022-05-16 20:05:50', current_timestamp());
insert into departamentos values (default, 116, 'Huila', '2022-05-16 20:15:15', current_timestamp());
insert into departamentos values (default, 117,  'La Guajira', '2022-05-16 20:20:20', current_timestamp());
insert into departamentos values (default, 118, 'Magdalena', '2022-05-16 20:30:47', current_timestamp());
insert into departamentos values (default, 119, 'Meta', '2022-05-16 20:35:30', current_timestamp());
insert into departamentos values (default, 120, 'Santander', '2022-05-16 20:45:00', current_timestamp());
insert into departamentos values (default, 121, 'Valle del cauca', '2022-05-16 21:00:00', current_timestamp());

select * from departamentos; 

/*insert datos tabla ciudades*/

insert into ciudades values (default, 1000, 'Leticia', 800);
insert into ciudades values (default, 1001, 'Medellin', 801);
insert into ciudades values (default, 1002, 'Bogota', 802);
insert into ciudades values (default, 1003, 'Manizales', 803);
insert into ciudades values (default, 1004, 'Valledupar', 804);
insert into ciudades values (default, 1005, 'Neiva', 805);
insert into ciudades values (default, 1006, 'Riohacha', 806);
insert into ciudades values (default, 1007, 'Santa Marta', 807);
insert into ciudades values (default, 1008, 'Villavicencio', 808);
insert into ciudades values (default, 1009, 'Bucaramanga', 809);
insert into ciudades values (default, 1010, 'Cali', 810);

/*insert datos tabla empleados*/

insert into TipoDoc values (1, 'Cedula');
insert into TipoDoc values (2, 'Tarjeta Identidad');
insert into TipoDoc values (3, 'Cedula Extranjeria');
insert into TipoDoc values (4, 'Pasaporte');

select * from TipoDoc;

/*insert datos tabla empleados*/

insert into Empleados values (default, 1, 120301231,'Tatiana','Gomez',10002,'Bogota','cll80 #45-13', 'notiene@gmail.com', 231241414, '2022-05-16 19:50:00', current_timestamp());
insert into Empleados values (default, 1, 120301232,'Daira','Sierra',10001,'Medellin','cll80 #45-13', 'notiene@gmail.com', 231241415, '2022-05-16 19:55:20', current_timestamp());
insert into Empleados values (default, 2, 120301235,'Juan Esteban','Albarracin',10002,'Bogota','cll80 #45-13', 'notiene@gmail.com', 231241416, '2022-05-16 19:57:40', current_timestamp());
insert into Empleados values (default, 2, 120301245,'Oskar','Mosquera',10010,'Cali','cll80 #45-13', 'notiene@gmail.com', 231241417, '2022-05-16 20:00:00', current_timestamp());
insert into Empleados values (default, 1, 120301264,'David','Gomez',10010,'Cali','cll80 #45-13', 'notiene@gmail.com', 231241418, '2022-05-16 20:05:50', current_timestamp());
insert into Empleados values (default, 3, 120301278,'Jennifer','Torres',10005,'Neiva','cll80 #45-13', 'notiene@gmail.com', 231241419, '2022-05-16 20:15:15', current_timestamp());
insert into Empleados values (default, 2, 120301298,'Karen','Espitia',10006,'Riohacha','cll80 #45-13', 'notiene@gmail.com', 231241420, '2022-05-16 20:20:20', current_timestamp());
insert into Empleados values (default, 1, 120301241,'Edwin','Sierra',10002,'Bogota','cll80 #45-13', 'notiene@gmail.com', 231241421, '2022-05-16 20:30:47', current_timestamp());
insert into Empleados values (default, 3, 120301288,'Climaco','Carrasca',10007,'Santa Marta','cll80 #45-13', 'notiene@gmail.com', 231241422, '2022-05-16 20:35:30', current_timestamp());
insert into Empleados values (default, 1, 120301299,'Valentina','Perez',10001,'Medellin','cll80 #45-13', 'notiene@gmail.com', 231241423, '2022-05-16 20:45:00', current_timestamp());

select * from Empleados;
