create database springdb;

use springdb;

create table users (
	userid INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    email varchar(50) NOT NULL
);

insert into users(name, email, password) values('Roger Freret', 'rogervf@gmail.com', '123456');
insert into users(name, email, password) values('Lucas Barrozo', 'lucaslbarrozo@gmail.com', '123456');
insert into users(name, email, password) values('Igor Imperiali', 'igor.imperiali@gmail.com', '123456');
