DROP TABLE IF EXISTS post;

CREATE TABLE post (
  id int AUTO_INCREMENT PRIMARY KEY,
  username varchar(45) NOT NULL,
  post_message varchar(2000) NOT NULL
);

insert into post (username, post_message)
values ('rezacomplete@gmail.com', 'Hello world!');