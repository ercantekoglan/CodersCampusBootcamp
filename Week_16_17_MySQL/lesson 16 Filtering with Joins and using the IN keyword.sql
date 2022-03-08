select * from users u
left join `address` a on u.user_id = a.user_id
join `user_account` ua on ua.user_id = u.user_id
join `account` acc on acc.account_id = ua.account_id
left join `transactions` t on t.account_id = acc.account_id
where u.user_id = 1;

-- where user_id = 1; bu sekilde calismaz. user_id birden fazla  tabloda yer alidigi icin belirmen gerek

select * from `users` u
left join `address` a on u.user_id = a.user_id
join `user_account` ua on ua.user_id = u.user_id
join `account` acc on acc.account_id = ua.account_id
join `transactions` t on t.account_id = acc.account_id
where username in ('ercan@ercan.com', 'eren@ercan.com');

-- where ... or seklinde devam eden kodu kisa hale getirmek icin in  ile tek satirda kurabiliriz