-- adress tablosunda sadece 1 satir oldugu icin join table da sadece tek kullanicinin bilgilerini goruyoruz
select * from users
join address on users.user_id = address.user_id;

-- ikinci user i ekledigimiz de join table da eklenen veriyi de goruyoruz.
insert into address (user_id, adress_line_1, adress_line_2, city, region,
country, zip_code)
values (5, '1 Musk Drive', 'Suite 205', 'Some City', 'California', 'USA', '90210');

-- users   |   address
--   1     |      1
--   2     |      -
--   3     |      -
--   4     |      -
--   5     |      2

-- bu yaptigimiz inner join. inner join bos olan kisimlari gostermez.

-- left join = if you have information on left side  (users) -  (adress)
-- right side da bilgi yoksa da gosterir. 
select * from users
left join address on users.user_id = address.user_id;