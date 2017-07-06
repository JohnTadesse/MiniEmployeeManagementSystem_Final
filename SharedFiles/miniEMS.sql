create database miniEMS

create table department(
departmentId int not null check (departmentId in (10,20,30,40,50)) primary key,
departmentName varchar (30) not null unique check (departmentName in ('IT','Marketing','HR','Sale','president office')),
departmentDuty varchar (100) not null
)

create table employee (
empId int identity (1,1) unique,
lastName varchar (30) not null,
firstName varchar (30) not null,
gender varchar(6) not null check (gender in ('male','female')) default 'female',
age int not null check (age>=18 and age<=100),
sinNum int unique,
departmentId int foreign key references department (departmentId), 
position varchar (20) not null check (position in ('clerk','assistant','supervisor','manager','director','president')) default 'clerk',
emailAddr varchar (50) not null,
phoneNum int not null,
baseSalary float not null
)