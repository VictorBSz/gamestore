create database if not exists gamestore;

use gamestore;

create table if not exists clients (
	customerID int auto_increment primary key not null,
	customerName varchar(100) not null unique,
	cpf varchar(14),
	contact varchar(20),
    addressST varchar(30),
    addressNO varchar(10),
    city varchar(50),
    regdate timestamp default current_timestamp
    );
 
 create table if not exists products (
	prodID int auto_increment primary key not null,
	prodName varchar(50) unique not null,
    prodPrice decimal not null,
    prodDetail varchar(50) not null,
    regdate timestamp default current_timestamp
    );
    
create table if not exists ordertype (
	typeID int auto_increment primary key not null,
    orderType varchar(20) not null unique
    );

create table if not exists maintenance (
	maintID int auto_increment primary key not null,
    customerID int, foreign key (customerID) references clients(customerID),
    customerName varchar(100), foreign key (customerName) references clients(customerName),
    fixBy varchar(100) not null,
    maintDate timestamp default current_timestamp not null,
    maintType varchar(50) not null,
    parts varchar(200) not null,
    jobdescript varchar(200),
    jobPrice decimal not null
    );
    
create table if not exists sales (
	orderID int auto_increment primary key not null,
    customerID int,
    foreign key (customerID) references clients(customerID),
    customerName varchar(100) not null,
    foreign key (customerName) references clients(customerName),	
    product varchar(50) not null,
    foreign key (product) references products(prodName),
    price decimal not null,
    buydate timestamp default current_timestamp
    );