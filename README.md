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
DROP TABLE IF EXISTS `patient_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_record` (
  `patient_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(45) DEFAULT NULL,
  `patient_sex` tinyint(1) DEFAULT NULL,
  `patient_number` bigint(20) DEFAULT NULL,
  `patient_age` int(11) DEFAULT NULL,
  `patient_address` varchar(255) DEFAULT NULL,
  `patient_department` varchar(45) DEFAULT NULL,
  `patient_inbed` tinyint(1) DEFAULT NULL,
  `patient_room` varchar(45) DEFAULT NULL,
  `patient_bed` varchar(45) DEFAULT NULL,
  `in_time` bigint(20) DEFAULT NULL,
  `out_time` bigint(20) DEFAULT NULL,
  `patient_doctorname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```