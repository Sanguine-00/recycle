/*
Navicat MySQL Data Transfer

Source Server         : 实训周
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : recycle

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2016-06-26 16:37:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for brand_info
-- ----------------------------
DROP TABLE IF EXISTS `brand_info`;
CREATE TABLE `brand_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `type_id` int(11) NOT NULL,
  `logo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_brand_type_id` (`type_id`),
  CONSTRAINT `fk_brand_type_id` FOREIGN KEY (`type_id`) REFERENCES `type_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brand_info
-- ----------------------------
INSERT INTO `brand_info` VALUES ('5', '联想', '26', 'lenovo.jpg');
INSERT INTO `brand_info` VALUES ('6', '华为', '27', 'huawei.jpg');
INSERT INTO `brand_info` VALUES ('7', '三星', '27', 'sanxing.jpg');
INSERT INTO `brand_info` VALUES ('8', '联想', '27', 'lianxiang.jpg');
INSERT INTO `brand_info` VALUES ('9', '魅族', '27', 'meizu.jpg');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL,
  `content` text NOT NULL,
  `type_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `time` char(19) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_news_user_id` (`user_id`),
  KEY `fk_news_type_id` (`type_id`),
  CONSTRAINT `fk_news_type_id` FOREIGN KEY (`type_id`) REFERENCES `news_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_news_user_id` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('3', '音乐类的新闻测试', '从前有一只青蛙,它一直在井底.', '2', '1', '2016-06-23 10:14:07');
INSERT INTO `news` VALUES ('5', '体育新闻测试1', '体育类新闻测试测试111', '4', '1', '2016-06-23 10:20:16');
INSERT INTO `news` VALUES ('6', '体育新闻测123', '体育类新闻测试测试', '4', '1', '2016-06-23 10:19:32');

-- ----------------------------
-- Table structure for news_type
-- ----------------------------
DROP TABLE IF EXISTS `news_type`;
CREATE TABLE `news_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `e_name` varchar(20) DEFAULT NULL,
  `descpt` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_type
-- ----------------------------
INSERT INTO `news_type` VALUES ('2', '音乐', 'music', '音乐中的段子手是谁，段子中的歌手是谁？');
INSERT INTO `news_type` VALUES ('3', '国际', 'national', '国际大新闻,小李子都奥斯卡了');
INSERT INTO `news_type` VALUES ('4', '体育', 'sport', '体育大大大大新闻');

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_num` char(14) NOT NULL,
  `user_id` int(11) NOT NULL,
  `price` float(11,2) NOT NULL,
  `time` char(19) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_order_user_id` (`user_id`),
  CONSTRAINT `fk_order_user_id` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for order_item
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `number` int(3) DEFAULT NULL,
  `price` float(11,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_item_order_id` (`order_id`),
  KEY `fk_item_product_id` (`product_id`) USING BTREE,
  CONSTRAINT `fk_item_order_id` FOREIGN KEY (`order_id`) REFERENCES `order_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_item_product_id` FOREIGN KEY (`product_id`) REFERENCES `product_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_item
-- ----------------------------

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `logo_url` varchar(20) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `descpt` text,
  `price` float(11,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_model_brand_id` (`brand_id`),
  KEY `fl_model_user_id` (`user_id`),
  CONSTRAINT `fk_model_brand_id` FOREIGN KEY (`brand_id`) REFERENCES `brand_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fl_model_user_id` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('1', '1', '9', 'meizupro6.jpg', '魅族pro6', '尺寸 	147.7×70.8×7.25mm\r\n电池容量 	2560mAh\r\n屏幕尺寸 	5.2英寸\r\n分辨率 	1920×1080\r\n运行内存（RAM） 	4GB\r\nCPU 	Helio X25 处理器\r\nGPU 	ARM Mali-T880 图形处理器\r\n网络模式 	双卡多模\r\n重量 	160g\r\n前置摄像头 	500万像素\r\n后置摄像头 	2116万像素\r\n系统版本 	Flyme 5\r\n包装清单 	主机 x 1\r\n电源适配器 x 1\r\n保修证书 x 1\r\nSIM卡顶针 x 1\r\n数据线 x 1\r\nME-10耳机 x 1（仅限64G版本） ', '2799.00');
INSERT INTO `product_info` VALUES ('2', '1', '6', 'huaweip9.jpg', '华为p9', '主屏尺寸：5.2英寸\r\n主屏分辨率：1920x1080像素\r\n后置摄像头：1200万像素\r\n前置摄像头：800万像素\r\n电池容量：3000mAh\r\n电池类型：不可拆卸式电池\r\n核心数：真八核\r\n内存：3GB', '3600.00');

-- ----------------------------
-- Table structure for public_info
-- ----------------------------
DROP TABLE IF EXISTS `public_info`;
CREATE TABLE `public_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_public_user_id` (`user_id`),
  CONSTRAINT `fk_public_user_id` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of public_info
-- ----------------------------

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_info
-- ----------------------------
INSERT INTO `role_info` VALUES ('1', '普通用戶');
INSERT INTO `role_info` VALUES ('2', '管理员');
INSERT INTO `role_info` VALUES ('3', '高级用户');

-- ----------------------------
-- Table structure for type_info
-- ----------------------------
DROP TABLE IF EXISTS `type_info`;
CREATE TABLE `type_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type_info
-- ----------------------------
INSERT INTO `type_info` VALUES ('26', '电脑', 'computer.ico');
INSERT INTO `type_info` VALUES ('27', '手机', 'mobile_phone.ico');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) NOT NULL,
  `password` varbinary(32) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_role_id` (`role_id`) USING BTREE,
  CONSTRAINT `fk_user_role_id` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'admin', 0x3231323332463239374135374135413734333839344130453441383031464333, '13215657829', 'images/admin.jpg', '南京市江宁区龙眠大道629号南京交院', '2');
INSERT INTO `user_info` VALUES ('3', '张三', 0x3637304231343732384144393930324145434241333245323246413446364244, '00000000000', null, '江苏宿迁', null);
INSERT INTO `user_info` VALUES ('4', '测试角色', 0x3637304231343732384144393930324145434241333245323246413446364244, '123123132', null, '测试角色', '1');
