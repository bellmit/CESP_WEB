/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : cesp_web

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 17/04/2018 19:25:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_transaction_mode
-- ----------------------------
DROP TABLE IF EXISTS `base_transaction_mode`;
CREATE TABLE `base_transaction_mode`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '成交方式代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '成交方式说明',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_transaction_mode
-- ----------------------------
INSERT INTO `base_transaction_mode` VALUES (1, '1', 'CIF', NULL);
INSERT INTO `base_transaction_mode` VALUES (2, '2', 'C&F', NULL);
INSERT INTO `base_transaction_mode` VALUES (3, '3', 'FOB', NULL);
INSERT INTO `base_transaction_mode` VALUES (4, '4', 'C&I', NULL);
INSERT INTO `base_transaction_mode` VALUES (5, '5', '市场价', NULL);
INSERT INTO `base_transaction_mode` VALUES (6, '6', '垫仓', NULL);

SET FOREIGN_KEY_CHECKS = 1;
