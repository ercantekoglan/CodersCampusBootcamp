insert into `account` (account_id, account_name, balance)
values (3, 'Savings', 123.45);

insert into transactions (transaction_id, transaction_date, amount, `type`, account_id)
values (6, '2020-03-01 15:30:00', 123.45, 'D', 3);

select account_id, count(*) from transactions
group by account_id;

select account_id, count(*) from transactions
group by account_id
having count(*) > 2;

-- count(*) dediginde o account id de kac tane oldugunu gosterir.
 -- having count(*) dedigimizde 