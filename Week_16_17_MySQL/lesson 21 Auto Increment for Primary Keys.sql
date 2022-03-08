-- auto increment = it will aoutomatically increment the pk of the table 

ALTER TABLE `transactions` 
CHANGE COLUMN `transaction_id` `transaction_id` INT NOT NULL AUTO_INCREMENT;

-- For illustration purposes, here's how to add auto increment to a
--   create table script
-- create table `some_table` (
--  some_table_id int not null auto_increment,
--  primary key (some_table_id)
-- )


-- omit id
insert into transactions (transaction_date, amount, `type`, account_id)
values ('2020-03-02 10:30:00', 25.05, 'D', 2);

insert into transactions (transaction_date, amount, `type`, account_id)
values ('2020-03-02 10:30:00', 25.05, 'D', 2);

delete from transactions where transaction_id = 8;

insert into transactions (transaction_date, amount, `type`, account_id)
values ('2020-03-03 19:30:00', 10.25, 'C', 1);

select * From transactions;

-- hep arttirma oldugu icin son insertte transaction_id 8 yerine 9 olarak atandi. 