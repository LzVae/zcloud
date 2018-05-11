
--  需要新建数据库 zcloud  --
--  用户表      --  
create table user(
	id int(11) not null primary key auto_increment,
	username varchar(50) not null,
	password varchar(50) not null,
	createtime timestamp not null default current_timestamp on update current_timestamp
)default charset='utf8';


--  文件夹表      --
create table folder(
	id int(11) not null primary key auto_increment,
	folder_name varchar(128) not null,
	folder_creator int(11) not null,
	folder_parent int(11) not null,
	folder_createtime timestamp not null default current_timestamp on update current_timestamp,
	foreign key(folder_creator) references user(id),
	foreign key(folder_parent) references folder(id)
)default charset='utf8';

--  文件表      --
create table file(
	id int(11) not null primary key auto_increment,
	file_name varchar(128) not null,
	file_size varchar(128) not null,
	file_path varchar(128) not null,
	file_creator int(11) not null,
	file_parent_folder int(11) not null,
	file_createtime timestamp not null default current_timestamp on update current_timestamp,
	foreign key(file_creator) references user(id),
	foreign key(file_parent_folder) references folder(id)
)default charset='utf8';

