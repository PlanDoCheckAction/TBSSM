/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : sqldemo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-20 09:19:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `demo_id` int(11) NOT NULL AUTO_INCREMENT,
  `demo_one` varchar(255) DEFAULT NULL,
  `demo_two` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`demo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('8', '22', '44');
INSERT INTO `demo` VALUES ('10', '11', '22');
INSERT INTO `demo` VALUES ('11', '12', '30');
INSERT INTO `demo` VALUES ('12', '54', '66');
INSERT INTO `demo` VALUES ('13', '88', '99');
INSERT INTO `demo` VALUES ('14', '88', '99');
INSERT INTO `demo` VALUES ('15', '88', '99');
