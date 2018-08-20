/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : southdream

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-08-20 11:41:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cars
-- ----------------------------
DROP TABLE IF EXISTS `cars`;
CREATE TABLE `cars` (
  `carid` int(11) DEFAULT NULL,
  `cartype` varchar(20) DEFAULT NULL,
  `enginetype` varchar(20) DEFAULT NULL,
  `enginecylinders` int(11) DEFAULT NULL,
  `brakestype` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cars
-- ----------------------------
INSERT INTO `cars` VALUES ('1', 'VW', 'Diesel', '4', '小刹车');
INSERT INTO `cars` VALUES ('2', 'Opel', null, null, '大厦车');
INSERT INTO `cars` VALUES ('3', 'Audi', 'Diesel', '4', '中刹车');
INSERT INTO `cars` VALUES ('4', 'Ford', 'Gas', '8', '大刹车');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(50) DEFAULT NULL COMMENT '密码',
  `user_email` varchar(50) DEFAULT 'test@mybatis.tk' COMMENT '邮箱',
  `user_info` text COMMENT '简介',
  `head_img` blob COMMENT '头像',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1012 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '123456', 'admin@mybatis.tk', '管理员用户', 0x1231231230, '2016-06-07 01:11:12');
INSERT INTO `sys_user` VALUES ('1001', 'admin1', '123456', 'test@mybatis.tk', '测试用户', 0x1231231230, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1002', 'admin2', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1003', 'admin3', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1004', 'admin4', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1005', 'admin5', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1006', 'admin6', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1007', 'admin7', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1008', 'admin8', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1009', 'admin9', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1010', 'admin10', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');
INSERT INTO `sys_user` VALUES ('1011', 'admin11', '123456', 'test@mybatis.tk', '测试用户', null, '2016-06-07 00:00:00');

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(30) NOT NULL,
  `course_delete_flg` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES ('1', '市场营销', '1');
INSERT INTO `t_course` VALUES ('2', '国际贸易', '0');
INSERT INTO `t_course` VALUES ('3', '网页设计', '0');
INSERT INTO `t_course` VALUES ('4', '计算机应用', '0');
INSERT INTO `t_course` VALUES ('5', '网络操作系统', '0');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `stu_id` int(3) NOT NULL,
  `stu_id_card` varchar(8) DEFAULT NULL,
  `stu_name` varchar(12) DEFAULT NULL,
  `stu_course_id` int(3) DEFAULT NULL,
  `stu_delete_flg` smallint(1) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '20140101', '张三', '1', '0');
INSERT INTO `t_student` VALUES ('2', '20140101', '张三', '2', '0');
INSERT INTO `t_student` VALUES ('3', '20140101', '张三', '3', '0');
INSERT INTO `t_student` VALUES ('4', '20140101', '李四', '1', '0');
INSERT INTO `t_student` VALUES ('5', '20140103', '王五', '2', '0');
INSERT INTO `t_student` VALUES ('6', '20140103', '王五', '5', '0');
INSERT INTO `t_student` VALUES ('7', '20140104', '小一', '2', '0');
INSERT INTO `t_student` VALUES ('8', '20140105', '小一', '4', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `name` varchar(15) NOT NULL,
  `password` varchar(30) NOT NULL,
  `age` int(3) DEFAULT NULL,
  `deleteFlag` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'I', '123', '15', '0');
INSERT INTO `user` VALUES ('2', 'YOU', '123', '13', '0');
INSERT INTO `user` VALUES ('3', 'Li', '123', '18', '0');
INSERT INTO `user` VALUES ('4', 'Wang', '123', '19', '0');
INSERT INTO `user` VALUES ('5', 'Hu', '123', '19', '0');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'User1');
INSERT INTO `users` VALUES ('2', 'User2');
INSERT INTO `users` VALUES ('3', 'User3');
INSERT INTO `users` VALUES ('4', 'User4');
INSERT INTO `users` VALUES ('5', 'User5');
INSERT INTO `users` VALUES ('6', 'User6');
INSERT INTO `users` VALUES ('8', 'user18');
INSERT INTO `users` VALUES ('9', 'user19');

-- ----------------------------
-- Procedure structure for delete_user_by_id
-- ----------------------------
DROP PROCEDURE IF EXISTS `delete_user_by_id`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_user_by_id`(IN userId BIGINT)
BEGIN
DELETE FROM sys_user_role where user_id = userId;
DELETE FROM sys_user where id = userId;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for insert_user_and_roles
-- ----------------------------
DROP PROCEDURE IF EXISTS `insert_user_and_roles`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_user_and_roles`(
OUT userId BIGINT,
IN userName VARCHAR(50),
IN userPassword VARCHAR(50),
IN userEmail VARCHAR(50),
IN userInfo TEXT,
IN headImg BLOB,
OUT createTime DATETIME,
IN roleIds VARCHAR(200)
)
BEGIN
# 设置当前时间
SET createTime = NOW();
# 插入数据
INSERT INTO sys_user(user_name, user_password, user_email, user_info, head_img, create_time)
VALUES (userName, userPassword, userEmail, userInfo, headImg, createTime);
# 获取自增主键
SELECT LAST_INSERT_ID() INTO userId;
# 保存用户和角色关系数据
SET roleIds = CONCAT(',',roleIds,',');
INSERT INTO sys_user_role(user_id, role_id)
select userId, id from sys_role
where INSTR(roleIds, CONCAT(',',id,',')) > 0;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for select_user_by_id
-- ----------------------------
DROP PROCEDURE IF EXISTS `select_user_by_id`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `select_user_by_id`(
IN userId BIGINT,
OUT userName VARCHAR(50),
OUT userPassword VARCHAR(50),
OUT userEmail VARCHAR(50),
OUT userInfo TEXT,
OUT headImg BLOB,
OUT createTime DATETIME)
BEGIN
# 根据用户 id 查询其他数据
select user_name,user_password,user_email,user_info,head_img,create_time
INTO userName,userPassword,userEmail,userInfo,headImg,createTime 
from sys_user
WHERE id = userId;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for select_user_page
-- ----------------------------
DROP PROCEDURE IF EXISTS `select_user_page`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `select_user_page`(
IN userName VARCHAR(50), 
IN _offset BIGINT, 
IN _limit BIGINT, 
OUT total BIGINT)
BEGIN
# 查询数据总数
select count(*) INTO total 
from sys_user 
where user_name like concat('%', userName, '%');
# 分页查询数据
select * 
from sys_user 
where user_name like concat('%', userName, '%')
limit _offset, _limit;
END
;;
DELIMITER ;
