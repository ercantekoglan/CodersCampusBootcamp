-- alter table, tabloyu degistirmek icin kullanilir
ALTER TABLE `online_bank`.`users` 
ADD PRIMARY KEY (`user_id`);

alter table users
change column `user_id` `user_id` INT NOT NULL;
-- change column `user_id` `username_id` INT NOT NULL; ikinci tirnakda isim degisikligi yapabiliriz istiyosak
