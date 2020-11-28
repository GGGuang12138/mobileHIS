# mobileHIS
## 1.创建数据库
- 默认库名mhis
##2.创建数据表
- 默认表名doctor、user、patient_record
```sql
create table table_name
(
	doctor_id BIGINT auto_increment,
	doctor_name VARCHAR(45) not null,
	doctor_number BIGINT not null,
	doctor_sex INT(1) null,
	doctor_level VARCHAR(45) null,
	education VARCHAR(45) null,
	department VARCHAR(45) null,
	constraint table_name_pk
		primary key (doctor_id)
);
create table table_name
(
	id INT auto_increment,
	username VARCHAR(255) not null,
	password VARCHAR(255) not null,
	doctor_id VARCHAR(255) not null,
	enable TINYINT(1) not null,
	phone VARCHAR(45) null,
	constraint table_name_pk
		primary key (id)
);


```