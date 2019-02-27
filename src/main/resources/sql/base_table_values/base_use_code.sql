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

 Date: 17/04/2018 19:25:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_use_code
-- ----------------------------
DROP TABLE IF EXISTS `base_use_code`;
CREATE TABLE `base_use_code`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用途代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_use_code
-- ----------------------------
INSERT INTO `base_use_code` VALUES (1, '01', '外贸自营内销', NULL);
INSERT INTO `base_use_code` VALUES (2, '02', '特区内销', NULL);
INSERT INTO `base_use_code` VALUES (3, '03', '其它内销', NULL);
INSERT INTO `base_use_code` VALUES (4, '04', '企业自用', NULL);
INSERT INTO `base_use_code` VALUES (5, '05', '加工返销', NULL);
INSERT INTO `base_use_code` VALUES (6, '06', '借用', NULL);
INSERT INTO `base_use_code` VALUES (7, '07', '收保证金', NULL);
INSERT INTO `base_use_code` VALUES (8, '08', '免费提供', NULL);
INSERT INTO `base_use_code` VALUES (9, '09', '作价提供', NULL);
INSERT INTO `base_use_code` VALUES (10, '10', '货样,广告品', NULL);
INSERT INTO `base_use_code` VALUES (11, '11', '其它', NULL);
INSERT INTO `base_use_code` VALUES (12, '13', '以产顶进', NULL);

SET FOREIGN_KEY_CHECKS = 1;
