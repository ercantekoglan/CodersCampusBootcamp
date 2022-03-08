-- CRUD
-- select ile read yapilir
select * from users;
select username from users;
select password, last_name from users;

select * from transactions;
insert into transactions(transaction_id, transaction_date, amount, type)
values (1 , '2020-05-31 15:35:59', 20, 'D');
select * from transactions;

alter table transactions
change column amount amount decimal(6,2);
-- amount deciman(2) idi, -> amount decimal(2,0) => 2 = max sayi (precision) , 0 = scale(virgulden sonraki kisim)
-- decimal (5,3) = 99,999 seklinde olur. 


insert into transactions(transaction_id, transaction_date, amount, type)
values (2 , '2020-04-28 15:35:59', 26.99, 'D');

select * from transactions;