--  one user can have many transactions(one to many)
-- User(parent)				Account(child table)
--  1,2	 	  		<-> 		1,2
--  2,3,4	  		<->       3,4,5,6
--  3	 	  		<-> 		7,8

-- How is a many-to-many relationship enforced in SQL?
-- A join table!
-- user      ->    user_account(join table) <- account table
-- user_id  		user_id						accoundt_id
-- username			account_id
-- password										balance

-- users a account_id eklersen account parent olur.

CREATE TABLE `online_bank`.`account` (
  `account_id` INT NOT NULL,
  `account_name` VARCHAR(100) NULL,
  `balance` DECIMAL(15,2) NULL,
  PRIMARY KEY (`account_id`));
  
  CREATE TABLE `user_account` (
  `user_id`INT NOT NULL,
  `account_id` INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (user_id),
  FOREIGN KEY (account_id) REFERENCES `account` (account_id) 
  );