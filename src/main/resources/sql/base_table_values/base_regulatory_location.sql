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

 Date: 17/04/2018 18:13:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_regulatory_location
-- ----------------------------
DROP TABLE IF EXISTS `base_regulatory_location`;
CREATE TABLE `base_regulatory_location`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监管点代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监管点名称',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_regulatory_location
-- ----------------------------
INSERT INTO `base_regulatory_location` VALUES (1, '370001', '厦门关区', NULL);
INSERT INTO `base_regulatory_location` VALUES (2, '720101', '南宁海关', NULL);
INSERT INTO `base_regulatory_location` VALUES (3, '600901', '汕关邮包', NULL);
INSERT INTO `base_regulatory_location` VALUES (4, '687101', '阳江车场', NULL);
INSERT INTO `base_regulatory_location` VALUES (5, '	\r\n519801', '河源车场', NULL);
INSERT INTO `base_regulatory_location` VALUES (6, '	\r\n512501', '从化海关', NULL);
INSERT INTO `base_regulatory_location` VALUES (7, '681301', '江门旅检', NULL);
INSERT INTO `base_regulatory_location` VALUES (8, '514701', '穗邮办监', NULL);
INSERT INTO `base_regulatory_location` VALUES (9, '	\r\n684101', '开平码头', NULL);
INSERT INTO `base_regulatory_location` VALUES (10, '	\r\n425801', '青岛前湾报税港区', NULL);
INSERT INTO `base_regulatory_location` VALUES (11, '	\r\n012701', '京快件', NULL);
INSERT INTO `base_regulatory_location` VALUES (12, '510401', '清远英德', NULL);
INSERT INTO `base_regulatory_location` VALUES (13, '440851', '湛江遂溪北部湾', NULL);
INSERT INTO `base_regulatory_location` VALUES (14, '510701', '	\r\n肇庆大旺', NULL);
INSERT INTO `base_regulatory_location` VALUES (15, '	\r\n520701', '凤岗海关', NULL);
INSERT INTO `base_regulatory_location` VALUES (16, '	\r\n522901', '黄埔状元谷', NULL);
INSERT INTO `base_regulatory_location` VALUES (17, '	\r\n515701', '顺德陈村港澳货柜车检查场', NULL);
INSERT INTO `base_regulatory_location` VALUES (18, '	\r\n514102', '广州机场（联邦）', NULL);
INSERT INTO `base_regulatory_location` VALUES (19, '	\r\n514101', '广州机场', NULL);
INSERT INTO `base_regulatory_location` VALUES (20, '	\r\n519001', '韶关车检场', NULL);
INSERT INTO `base_regulatory_location` VALUES (21, '514501', '广州邮办（流花）', NULL);
INSERT INTO `base_regulatory_location` VALUES (22, '	\r\n521901', '黄埔保税车验场', NULL);
INSERT INTO `base_regulatory_location` VALUES (23, '513001', '萝岗车场', NULL);
INSERT INTO `base_regulatory_location` VALUES (24, '	\r\n513301', '萝岗新银河', NULL);
INSERT INTO `base_regulatory_location` VALUES (25, '524401', '启盈快件', NULL);
INSERT INTO `base_regulatory_location` VALUES (26, '	\r\n518501', '佛山快件', NULL);
INSERT INTO `base_regulatory_location` VALUES (27, '518701', '佛山车场', NULL);

SET FOREIGN_KEY_CHECKS = 1;
