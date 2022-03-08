-- create database online_bank;
-- db de table kkurmanin ilk yolu. 2.si table a sag tikla create de. use online_bank;
-- 3.su ise databasename.tablename olarak yazip tek tirnak icinde yaz.
create table users (
user_id int, 
username varchar(32), 
password varchar(32),
first_name varchar(50),
last_name varchar(50) 
-- table icinde ki degerlerin toplu haline schema denir.table icin blueprinttir
);
-- karisiklik olmamasi icin degerler ` icinde yazilir ama kullanimi onerilmez pek/
-- database ismi ile kurarasan da,qa ya da dev de calisirken sikinti olabilir. normal ustteki hali daha dinamik
-- ama normal seklini kullanirken reserved keywords lara dikkat et
CREATE TABLE `online_bank`.`transactions` (
  `transaction_id` INT NOT NULL,
  `transaction_date` DATETIME NULL,
  `amount` DECIMAL(2) NULL,
  `type` VARCHAR(1) NULL,
  PRIMARY KEY (`transaction_id`));