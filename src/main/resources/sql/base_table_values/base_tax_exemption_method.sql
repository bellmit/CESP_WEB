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

 Date: 17/04/2018 18:15:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_tax_exemption_method
-- ----------------------------
DROP TABLE IF EXISTS `base_tax_exemption_method`;
CREATE TABLE `base_tax_exemption_method`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '减征免税方式代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '减征免税方式说明',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_tax_exemption_method
-- ----------------------------
INSERT INTO `base_tax_exemption_method` VALUES (1, '1', '照章征税', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (2, '2', '折半征税', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (3, '3', '全免', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (4, '4', '特案', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (5, '5', '征免性质', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (6, '6', '保证金', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (7, '7', '保函', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (8, '8', '折半补税', NULL);
INSERT INTO `base_tax_exemption_method` VALUES (9, '9', '全额退税', NULL);

SET FOREIGN_KEY_CHECKS = 1;
