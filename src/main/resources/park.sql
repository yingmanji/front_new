/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.68-community : Database - sharepl
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sharepl` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sharepl`;

/*Table structure for table `generate` */

DROP TABLE IF EXISTS `generate`;

CREATE TABLE `generate` (
  `generate_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `parkinglot_id` bigint(11) NOT NULL COMMENT '停车位ID',
  `share_begin` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '共享开始时间',
  `share_end` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '共享结束时间',
  `price` decimal(4,2) NOT NULL COMMENT '价格',
  `status` char(1) DEFAULT NULL COMMENT '状态(0:正在共享 1：已预约 2：已完成 3：已结束 4：已取消)',
  PRIMARY KEY (`generate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `generate` */

insert  into `generate`(`generate_id`,`parkinglot_id`,`share_begin`,`share_end`,`price`,`status`) values (7,2,'2017-09-18 15:19:49','2017-09-20 20:36:36','20.00','1'),(8,5,'2017-09-18 16:34:56','2017-09-14 20:36:36','1.00','1'),(9,3,'2017-09-18 20:49:59','2017-09-04 23:36:36','30.00','1'),(10,5,'2017-09-18 18:10:55','2017-09-05 20:36:36','30.00','0'),(11,5,'2017-09-16 18:40:10','2017-09-05 20:36:36','20.00','0'),(12,6,'2017-09-16 17:32:04','2017-09-18 20:16:06','3.00','0'),(13,6,'2017-09-16 17:32:10','2017-09-18 21:16:06','4.00','0'),(14,6,'2017-09-15 18:16:06','2017-09-15 20:16:06','10.00','0'),(15,8,'2017-09-18 20:16:06','2017-09-18 22:16:06','29.00','0');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `parkinglot_id` bigint(11) DEFAULT NULL COMMENT '停车位ID',
  `parking_begin` varchar(30) DEFAULT '0000-00-00 00:00:00' COMMENT '停车开始时间',
  `parking_end` varchar(30) DEFAULT '0000-00-00 00:00:00' COMMENT '停车结束时间',
  `parking_totaltime` varchar(30) DEFAULT '0000-00-00 00:00:00' COMMENT '停车总时间',
  `price` decimal(4,2) NOT NULL COMMENT '收费=价格*总时间',
  `status` char(1) NOT NULL COMMENT '状态(0:正在使用 1：已完成 2：已取消  3：已过期)',
  `order_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '订单创建时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='结束订单表';

/*Data for the table `orders` */

insert  into `orders`(`order_id`,`user_id`,`parkinglot_id`,`parking_begin`,`parking_end`,`parking_totaltime`,`price`,`status`,`order_createtime`) values (4,12,2,'2017-09-17 23:10:09','2017-09-18 21:45:50','1970-01-01 08:00:00','24.00','1','2017-09-17 22:46:08'),(5,7,5,'0000-00-00 00:00:00','0000-00-00 00:00:00','0000-00-00 00:00:00','30.00','0','2017-09-17 23:09:36'),(6,12,3,'0000-00-00 00:00:00','0000-00-00 00:00:00','0000-00-00 00:00:00','30.00','0','2017-09-18 20:49:59');

/*Table structure for table `parking` */

DROP TABLE IF EXISTS `parking`;

CREATE TABLE `parking` (
  `parking_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '停车场ID',
  `parking_name` varchar(20) NOT NULL COMMENT '停车位名字',
  `parking_location` varchar(50) NOT NULL COMMENT '停车场地址',
  `longitude` decimal(16,10) NOT NULL COMMENT '经度',
  `latitude` decimal(16,10) NOT NULL COMMENT '纬度',
  `remaker` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`parking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='停车场';

/*Data for the table `parking` */

insert  into `parking`(`parking_id`,`parking_name`,`parking_location`,`longitude`,`latitude`,`remaker`) values (1,'停车场1','某','113.4629382610','23.1262415045',NULL),(2,'停车场2','某某','113.2644939423','23.2261477710',NULL),(3,'停车场3','某某某','113.2649230957','23.1258517699',NULL),(4,'停车场4','某某某某','113.2835229826','23.1267545712',NULL),(5,'停车场5','某某某某某','113.2655882835','23.1269815039',NULL),(6,'停车场6','某某某某某某','113.2655194740','23.1325665362',NULL),(7,'珠江国际大厦','某某某某某某木木','113.2675194740','23.1295665362',NULL),(8,'某某某','某某某','114.2675194740','24.1295665362',NULL);

/*Table structure for table `parkinglot` */

DROP TABLE IF EXISTS `parkinglot`;

CREATE TABLE `parkinglot` (
  `parkinglot_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '停车位ID',
  `parking_id` bigint(11) NOT NULL COMMENT '停车场ID',
  `plate_num` varchar(30) NOT NULL COMMENT '停车场内的停车位置',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`parkinglot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='车位表';

/*Data for the table `parkinglot` */

insert  into `parkinglot`(`parkinglot_id`,`parking_id`,`plate_num`,`user_id`) values (2,1,'粤5',5),(3,2,'粤7',7),(5,1,'粤5',5),(6,1,'粤3',3),(8,2,'粤SSS',12);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `wxopen_id` varchar(50) NOT NULL COMMENT '微信openid',
  `wx_name` varchar(30) NOT NULL COMMENT '微信名',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `sex` char(1) NOT NULL COMMENT '性别',
  `phone_num` varchar(30) NOT NULL COMMENT '手机号',
  `plate_num` varchar(30) NOT NULL COMMENT '车牌号',
  `regist_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `lastlogin_time` timestamp NULL DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`user_id`),
  KEY `idx_phone_num` (`phone_num`),
  KEY `idx_user_name` (`user_name`),
  KEY `idx_plate_num` (`plate_num`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`user_id`,`wxopen_id`,`wx_name`,`user_name`,`sex`,`phone_num`,`plate_num`,`regist_time`,`lastlogin_time`) values (3,'32111','大','诶我去二群','男','111','粤3','2017-09-14 18:39:52','2017-09-17 20:38:46'),(5,'999999','qqqq去','daw打算请问王企鹅','男','13454312','粤5','2017-09-03 20:28:28','2017-09-17 20:41:24'),(6,'8888','qqqq','格','男','1345555','粤6','2017-09-03 20:29:05','2017-09-17 22:00:09'),(7,'3213','王企鹅无群大','大打算','男','321312','粤7','2017-09-14 18:39:21','2017-09-17 20:47:07'),(12,'666','恒','恒哥','男','6666666','粤SSS','2017-09-17 22:31:49','2017-09-17 22:31:49');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
