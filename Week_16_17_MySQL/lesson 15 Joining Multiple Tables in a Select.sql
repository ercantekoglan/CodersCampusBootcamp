-- user u = user as u demek.alias

select * from users u
left join address a on u.user_id = a.user_id
left join `user_account` ua on ua.user_id = u.user_id
left join `account` acc on acc.account_id = ua.account_id
left join `transactions` t on t.account_id = acc.account_id;

