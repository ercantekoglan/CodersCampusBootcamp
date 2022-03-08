insert into transactions (transaction_id, transaction_date, amount, type, account_id)
values (3, '2020-03-31', 105.50, 'D', 2);

select account_id, sum(amount) as account_balance from transactions
group by account_id;

select account_id, 
       sum(CASE 
             WHEN `type` = 'D' THEN amount
             WHEN `type` = 'C' THEN amount * -1
             -- ELSE amount * -1
		   END) as account_balance 
from transactions
group by account_id;

select * from transactions;

-- CASE
--   WHEN [boolean expression] THEN [return value]
--   WHEN [boolean expression] THEN [return value]
--   ELSE [return value]
-- END