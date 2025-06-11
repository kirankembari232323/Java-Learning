SQL Commands

DDL -  structure or database schema
   create,alter, drop, truncate

DML - database instance
    insert, update,delete 

DCL - authorization

    grant , revoke

TCL -

    commit, rollback




    1) CREATE DATABASE mydb;


   2) CREATE TABLE employee (
   		emp_id INT PRIMARY KEY AUTO_INCREMENT,
   		name VARCHAR(100) NOT NULL,
   		department VARCHAR(50),
   		salary DECIMAL(10, 2),
   		join_date DATE
    );

   3) desc employee

   4) insert into employee values(124,'Ram','Pune', 45660),(125,'Lam','Mumbai',65000);

   5) alter table employee add dob year;

   6) delete from employee where empId=124;




