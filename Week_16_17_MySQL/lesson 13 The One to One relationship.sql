-- one-to-one relationship
-- ex: users 1 -> adress
-- how do you enable MySQL to enforce a one-to-one relationship?
-- i.e. how do you design / sytucture the DB tables?

-- one to one kurmak icin user id yi pk yaptik. address id yi kullanmadik
create table `address`(
`user_id` INT NOT NULL,
`adress_line_1` varchar(200) NOT NULL,
`adress_line_2` varchar(200),
`city` varchar(100),
`region` varchar(100),
`country`varchar(100),
`zip_code` varchar(10),
primary key (`user_id`),
foreign key (`user_id`) references users (`user_id`)
);

insert into `address` (user_id, adress_line_1, city, region, country, zip_code)
values (1, '123 Fake St', 'Some City', 'Some Region', 'Some Country', '12345');

-- insert into `address` (user_id, adress_line_1, city, region, country, zip_code)
-- values (100, '123 Fake St', 'Some City', 'Some Region', 'Some Country', '12345');
--  100 e ait bir user id olamdigi icin hata verir . fk
select * from address;