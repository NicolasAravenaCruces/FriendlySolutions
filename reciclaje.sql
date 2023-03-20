CREATE SCHEMA proyecto;
USE proyecto;

create table empresa (
	empresa_id INTEGER primary key auto_increment not null,
    nombre_empresa VARCHAR (50),
    direccion VARCHAR (50),
    correo VARCHAR (20),
    contacto VARCHAR (15)
    );

create table premio (
    premio_id INTEGER primary key auto_increment not null,
    puntajePremio INTEGER,
    nombrePremio VARCHAR(50),
    tipoPremio VARCHAR(50)
    );

create table tipoMaterial (
    tipoMaterial_id INTEGER primary key auto_increment not null,
    nombreMaterial VARCHAR (15)
    );
    

create table usuario (
    usuario_id INTEGER primary key auto_increment not null,
    nombre VARCHAR (15),
    apellido VARCHAR (15),
    correo VARCHAR (20),
    genero CHAR (3),
    edad INTEGER,
    area VARCHAR (30), # lo haremos con seleccion multiple
    medalla VARCHAR(15) ,# bronce, plata, oro, deacuerdo a cuanto va reciclando 
    empresa_id INTEGER, # seleccion multiple
    premio_id INTEGER,
    FOREIGN KEY (empresa_id) REFERENCES empresa(empresa_id),
    FOREIGN KEY (premio_id) REFERENCES premio(premio_id)
    );

create table reciclaje (
    reciclaje_id INTEGER primary key auto_increment not null,
    cantidad INTEGER,
    puntaje INTEGER,
    tipoMaterial_id INTEGER,
    FOREIGN KEY(tipoMaterial_id) REFERENCES tipoMaterial(tipoMaterial_id)
    );
    
    
    
create table ReciclajeUsuario (
    reciclajeUsuario_id INTEGER primary key auto_increment not null,
    reciclaje_id INTEGER,
    usuario_id INTEGER,
    FOREIGN KEY (reciclaje_id) REFERENCES reciclaje(reciclaje_id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
    );
    
    
    
INSERT INTO empresa (nombre_empresa, direccion, correo, contacto)
VALUES ("Generation","Apoquindo 5555","generation@gmail.com","+56988888888"),
("Equifax","Metro U de Chile, local 4","equifax@gmail.com","+56955555555"),
("Deloitte","Rosario Nte 407","deloitten@gmail.com","+56977776666") ;
    
INSERT INTO premio (puntajePremio, nombrePremio,tipoPremio)
VALUES(1000,"Almuerzo","Primero que llega"),
(5000,"Sesion de spa","Mejor reciclaje area"),
(300,"colacion","mejor del dia");

INSERT INTO tipoMaterial (nombreMaterial)
VALUES ("Aluminio"),
("Plastico"),
("Vidrio"),
("Papel");
   
INSERT INTO usuario (nombre, apellido, correo, genero, edad, area, medalla, empresa_id)
VALUES ("Nicolas","Aravena","nico@gmail.com",'m',28, "Informatica","plata", 1),
("Daniela","Corral","danicorral@gmail.com",'f',29, "Informatica","bronce", 1),
("Daniela","Gomez","danigomez@gmail.com",'o',29, "Informatica","oro", 1);
   
INSERT INTO reciclaje (cantidad, puntaje, tipoMaterial_id)
VALUES (10,100,2),
(5,250,3),
(35,500,3);

INSERT INTO reciclajeUsuario (reciclaje_id, usuario_id)
VALUES (1, 1),
(2, 2),
(3, 3)
;


select * from usuario join reciclajeUsuario on usuario.usuario_id = reciclajeUsuario.usuario_id
join reciclaje on reciclajeUsuario.reciclaje_id= reciclaje.reciclaje_id;

use proyecto;
alter table usuario add contraseña varchar(15);

select * from usuario;

alter table empresa change nroContacto contacto varchar(15);

select * from empresa;
   

`empresa`
    
    
    
    




    
    
    
    
    