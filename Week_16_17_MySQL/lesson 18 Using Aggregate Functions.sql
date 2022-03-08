insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (5, '2020-01-31', 45.50, 'D', 2);
-- sum ve count method
select sum(amount), count(*) From transactions
group by account_id;

-- select sum(amount), count(amount) From transactions
-- group by account_id;

select * from transactions;


-- 
--        Group by `account_id`
--
--    |txn_id 1 |      |txn_id 3 |
--    |txn_id 2 |      |txn_id 4 |
--    |         |      |txn_id 5 |
--    -----------      -----------
--    account_id 1     account_id 2