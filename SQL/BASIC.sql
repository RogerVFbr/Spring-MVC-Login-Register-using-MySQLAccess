create database springdb;

use springdb;

create table users (
	userid INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    credits double DEFAULT 20,
    address varchar(100) NOT NULL,
    phonenumber varchar(10) NOT NULL,
    email varchar(50) NOT NULL
);

insert into users(name, email, address, phonenumber, password) values('Roger Freret', 'rogervf@gmail.com', 'Sen Verg. 219, no. 305 - Flamengo', '99999-9999','123456');
insert into users(name, email, address, phonenumber, password) values('Lucas Barrozo', 'lucaslbarrozo@gmail.com','Rua das Laranjas, no. 2, apto. 201 - Laranjeiras', '88888-8888', '123456');
insert into users(name, email, address, phonenumber, password) values('Igor Imperiali', 'igor.imperiali@gmail.com', 'Rua dos Alfeneiros, no. 4 - Jacarepaguá', '77777-7777', '123456');

create table products(
	productid INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(50) NOT NULL,
    ownerid int NOT NULL,
    price double NOT NULL
);

insert into products(name, description, ownerid, price) values('Bife com fritas', 'Arroz, feijão, batata frita, bife', 1, 9.0);
insert into products(name, description, ownerid, price) values('Macarrão a bolonhesa', 'Macarrão com molho vermelho e carne', 1, 12.0);
insert into products(name, description, ownerid, price) values('Frango frito', 'Arroz, feijão, farofa, coxa de frango', 1, 11.50);

insert into products(name, description, ownerid, price) values('Salada ceasar', 'Alface, agrião, molho, torrada cebola e arroz', 2, 10.0);
insert into products(name, description, ownerid, price) values('Macarrão a 4 queijos', 'Macarrão com molho 4 queijos', 2, 14.0);
insert into products(name, description, ownerid, price) values('Frango empanado', 'Frango a milanesa com purê de batata', 2, 13.5);

insert into products(name, description, ownerid, price) values('Lasanha de 4 queijos', 'Lasanha italiana com molho 4 queijos', 3, 7.0);
insert into products(name, description, ownerid, price) values('Macarrão ao alho e óleo', 'Macarrão sem molho ao alho e óleo', 3, 11.0);
insert into products(name, description, ownerid, price) values('Bacalhau à portuguesa', 'Bacalhau, batata, pimentão, cebola', 3, 12.5);

create table orders(
	orderid INT AUTO_INCREMENT PRIMARY KEY,
    customerid int NOT NULL,
    orderproductid int NOT NULL
);

insert into orders(customerid, orderproductid) values(1, 4);
insert into orders(customerid, orderproductid) values(1, 6);

insert into orders(customerid, orderproductid) values(2, 3);
insert into orders(customerid, orderproductid) values(2, 9);

insert into orders(customerid, orderproductid) values(3, 2);
insert into orders(customerid, orderproductid) values(3, 5);