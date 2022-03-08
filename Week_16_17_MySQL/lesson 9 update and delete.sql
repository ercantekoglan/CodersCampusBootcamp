select * from transactions;
-- alter table means chancing fisizsel properties of table,schema,structure
update transactions
set user_id = 1;

-- filter
select * from transactions
where transaction_id = 2;

select * from users
where first_name = 'ercan'
and last_name = 'tekoglan';

update transactions
set user_id = 2
where transaction_id  = 2;

select * from transactions;

delete from users 
where user_id =7;

select * from users
where first_name = 'ercan'
or first_name = 'eren';