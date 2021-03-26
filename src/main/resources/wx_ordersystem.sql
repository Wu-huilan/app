/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : wx_ordersystem

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2021-03-26 23:23:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `food`
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `food_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(20) NOT NULL,
  `food_classification_id` int(11) NOT NULL,
  `food_price` double NOT NULL,
  `food_img` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `food_desc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `food_status` int(11) NOT NULL,
  `food_store` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='ʳƷ��ϸ��';

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '日照红茶', '1', '5', 'a.png', '3葡萄原汁和绿茶的调和，加上冰块搅打出冰沙，酸奶', '1', '2', '2021-03-23 00:04:25', '2021-03-21 00:54:55');
INSERT INTO `food` VALUES ('2', '翠峰茉莉', '1', '5', 'a.png', '2葡萄原汁和绿茶的调和，加上冰块搅打出冰沙，酸奶', '1', '3', '2021-03-23 00:04:31', '2021-03-21 13:52:38');
INSERT INTO `food` VALUES ('3', '益禾烤奶', '2', '7', 'a.png', '1葡萄原汁和绿茶的调和，加上冰块搅打出冰沙，酸奶', '2', '3', '2021-03-23 00:04:37', '2021-03-21 13:53:54');

-- ----------------------------
-- Table structure for `food_classification`
-- ----------------------------
DROP TABLE IF EXISTS `food_classification`;
CREATE TABLE `food_classification` (
  `food_classification_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_classification_name` varchar(20) NOT NULL,
  `food_classification_img` varchar(50) NOT NULL,
  `priority` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`food_classification_id`,`food_classification_name`,`food_classification_img`,`priority`,`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='ʳƷ�����';

-- ----------------------------
-- Records of food_classification
-- ----------------------------
INSERT INTO `food_classification` VALUES ('1', '新品上市', 'a.png', '1', '2021-03-23 00:02:54');
INSERT INTO `food_classification` VALUES ('2', '原砌茗作', 'a.png', '2', '2021-03-23 00:02:58');

-- ----------------------------
-- Table structure for `food_specification`
-- ----------------------------
DROP TABLE IF EXISTS `food_specification`;
CREATE TABLE `food_specification` (
  `food_specification_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_specification_name` varchar(20) NOT NULL,
  `food_id` int(11) NOT NULL,
  `priority` int(11) NOT NULL,
  PRIMARY KEY (`food_specification_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of food_specification
-- ----------------------------
INSERT INTO `food_specification` VALUES ('1', '温度', '2', '1');
INSERT INTO `food_specification` VALUES ('2', '甜度', '2', '2');
INSERT INTO `food_specification` VALUES ('3', '加料区', '2', '3');

-- ----------------------------
-- Table structure for `food_specification_detail`
-- ----------------------------
DROP TABLE IF EXISTS `food_specification_detail`;
CREATE TABLE `food_specification_detail` (
  `food_specification_detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `food_specification_id` int(11) NOT NULL,
  `extra_price` double NOT NULL DEFAULT '0',
  `food_specification_detail_name` varchar(20) NOT NULL,
  `priority` int(11) NOT NULL,
  PRIMARY KEY (`food_specification_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of food_specification_detail
-- ----------------------------
INSERT INTO `food_specification_detail` VALUES ('1', '1', '0', '热', '1');
INSERT INTO `food_specification_detail` VALUES ('2', '1', '0', '冰', '2');
INSERT INTO `food_specification_detail` VALUES ('3', '1', '0', '少冰', '3');
INSERT INTO `food_specification_detail` VALUES ('4', '2', '0', '多糖', '1');
INSERT INTO `food_specification_detail` VALUES ('5', '2', '0', '少糖', '3');
INSERT INTO `food_specification_detail` VALUES ('6', '3', '1', '珍珠', '1');
INSERT INTO `food_specification_detail` VALUES ('7', '3', '1', '仙草', '2');
INSERT INTO `food_specification_detail` VALUES ('8', '3', '2', '椰果', '3');

-- ----------------------------
-- Table structure for `shoppingcart`
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE `shoppingcart` (
  `shppingCart_id` int(11) NOT NULL,
  `food_id` int(11) NOT NULL,
  `open_id` varchar(45) NOT NULL,
  `count` int(11) NOT NULL,
  `foodSpecificationIds` varchar(70) NOT NULL,
  PRIMARY KEY (`shppingCart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of shoppingcart
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `open_id` varchar(45) NOT NULL,
  `integral` int(11) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `nickName` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
