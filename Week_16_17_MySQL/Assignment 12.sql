create database assignment_12;

create table assignment_12.`pizza` (
pizza_id int not null auto_increment,
pizza_name varchar(50),
pizza_price decimal(6,2),
primary key (`pizza_id`)
);

insert into assignment_12.`pizza`(pizza_id,pizza_name,pizza_price) 
								values (1,`Pepperoni & Cheese` , 7,99);
insert into assignment_12.`pizza`(pizza_name,pizza_price) values (`Vegetarian` , 9,99);
insert into assignment_12.`pizza`(pizza_name,pizza_price) values (`Meat Lovers` , 14,99);
insert into assignment_12.`pizza`(pizza_name,pizza_price) values (`Hawaiian` , 12,99);

select * from assignment_12.`pizza`;

create table assignment_12.`order` (
order_id int not null,
order_date datetime not null,
primary key (`order_id`)
);

create table assignment_12.`customer` (
customer_id int not null,
customer_name varchar(50) not null,
customer_phone_number varchar(15) not null,
primary key (`customer_id`)
);

create table assignment_12.`order_line`(
quantity int not null,
foreign key (`order_id`) references assignment_12.order,
foreign key (`pizza_id`) references assignment_12.order
);

create table assignment_12.`customer_pizza_choice`(
foreign key (`customer_id`) references assignment_12.order,
foreign key (`pizza_id`) references assignment_12.pizza
);
