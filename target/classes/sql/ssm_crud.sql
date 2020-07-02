/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : ssm_crud

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2020-07-02 10:31:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '18', '男', '广州');
INSERT INTO `employee` VALUES ('2', '李四', '20', '男', '深圳');
INSERT INTO `employee` VALUES ('4', '李云龙', '18', '男', '北京');

-- ----------------------------
-- Table structure for phoneuser
-- ----------------------------
DROP TABLE IF EXISTS `phoneuser`;
CREATE TABLE `phoneuser` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `phone` varchar(100) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of phoneuser
-- ----------------------------
INSERT INTO `phoneuser` VALUES ('1', '1352273672', 'wang1234567890');
