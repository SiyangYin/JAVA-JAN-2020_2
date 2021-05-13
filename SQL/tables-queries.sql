create table employees (
id int primary key auto_increment,
firstName varchar(30),
lastName varchar(30),
age int,
salary double,
);

create table departments (

id int primary key auto_increment,
name varchar(30)

);

create table empdept (
eid int,
deptid int,
constraint fk_eid foreign key (eid) references employees (id),
constraint fk_deptid foreign key (deptid) references departments (id)
);


1. Select all the departments having at least 1 employee
2. Select all the employees who does not belong to any dept
3. Get the number of employees in each dept
4. Select the employee details who draws max salary
5. Select the 2nd max salary and the employee details
6. Select a dept which has at least 2 employees







