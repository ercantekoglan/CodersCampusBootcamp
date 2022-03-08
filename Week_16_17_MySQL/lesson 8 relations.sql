-- RDBMS -> Relational Database Management System
--   	 -> MYSQL, PostgreSQL, MS SQL Server, Oracle

-- Relationships exist between table - 3 type
-- 	One-to-Many Reletionship (most popular)
--  Many-to-Many Reletionship
--  One-to-One Reletionship

--  one user can have many transactions(one to many)
-- User			Transaction
--  1	  <-> 		1,2
--  2	  <->     3,4,5,6
--  3	  <-> 		7,8

-- foreign key tablolar arasindaki baglatiyi saglar. 

alter table transactions
add column user_id int;

-- users tablosundaki user id yi alarak transactions tablosuna ekliyoruz.
alter table transactions
add foreign key (user_id) references users (user_id);

select * from transactions;