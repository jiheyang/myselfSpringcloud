/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : myself

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-04-29 11:12:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Jone', '18', 'test1@baomidou.com');
INSERT INTO `user` VALUES ('2', 'Jack', '20', 'test2@baomidou.com');
INSERT INTO `user` VALUES ('3', 'Tom', '28', 'test3@baomidou.com');
INSERT INTO `user` VALUES ('4', 'Sandy', '21', 'test4@baomidou.com');
INSERT INTO `user` VALUES ('5', 'Billie', '24', 'test5@baomidou.com');
INSERT INTO `user` VALUES ('6', '欧冶吴彦祖', '25', 'jiushizaixia');
