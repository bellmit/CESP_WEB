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

 Date: 17/04/2018 17:51:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_package_info
-- ----------------------------
DROP TABLE IF EXISTS `base_package_info`;
CREATE TABLE `base_package_info`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包装形式代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包装形式',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 102 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_package_info
-- ----------------------------
INSERT INTO `base_package_info` VALUES (8, '190', '其他桶', NULL);
INSERT INTO `base_package_info` VALUES (9, '1A1', '钢制不可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (10, '1A2', '钢制可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (11, '1A3', '镀锌闭口钢桶', NULL);
INSERT INTO `base_package_info` VALUES (12, '1A4', '镀锌开口钢桶', NULL);
INSERT INTO `base_package_info` VALUES (13, '1B1', '铝制不可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (14, '1B2', '铝制可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (15, '1C', '木圆桶', NULL);
INSERT INTO `base_package_info` VALUES (16, '1D', '胶合板圆桶', NULL);
INSERT INTO `base_package_info` VALUES (17, '1G', '纤维圆桶', NULL);
INSERT INTO `base_package_info` VALUES (18, '1H', '塑料圆桶', NULL);
INSERT INTO `base_package_info` VALUES (19, '1H1', '塑料不可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (20, '1H2', '塑料可拆装桶顶圆桶', NULL);
INSERT INTO `base_package_info` VALUES (21, '2C1', '塞式木琵琶桶', NULL);
INSERT INTO `base_package_info` VALUES (22, '2C2', '非水密型木琵琶桶', NULL);
INSERT INTO `base_package_info` VALUES (23, '390', '其他罐', NULL);
INSERT INTO `base_package_info` VALUES (24, '3A1', '钢制不可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (25, '3A2', '钢制可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (26, '3B1', '铝制不可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (27, '3B2', '铝制可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (28, '3H1', '塑料制不可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (29, '3H2', '塑料制可拆装罐顶罐', NULL);
INSERT INTO `base_package_info` VALUES (30, '490', '其他箱', NULL);
INSERT INTO `base_package_info` VALUES (31, '4A', '钢箱', NULL);
INSERT INTO `base_package_info` VALUES (32, '4B', '铝箱', NULL);
INSERT INTO `base_package_info` VALUES (33, '4C11', '大木箱', NULL);
INSERT INTO `base_package_info` VALUES (34, '4C12', '中木箱', NULL);
INSERT INTO `base_package_info` VALUES (35, '4C13', '小木箱', NULL);
INSERT INTO `base_package_info` VALUES (36, '4C2', '箱壁防撤漏木箱', NULL);
INSERT INTO `base_package_info` VALUES (37, '4D', '胶合板箱', NULL);
INSERT INTO `base_package_info` VALUES (38, '4F', '再生木木箱', NULL);
INSERT INTO `base_package_info` VALUES (39, '4G', '纤维板箱', NULL);
INSERT INTO `base_package_info` VALUES (40, '4H', '塑料箱', NULL);
INSERT INTO `base_package_info` VALUES (41, '4H1', '膨胀的塑料箱', NULL);
INSERT INTO `base_package_info` VALUES (42, '4H2', '硬质的塑料箱', NULL);
INSERT INTO `base_package_info` VALUES (43, '4M', '纸箱', NULL);
INSERT INTO `base_package_info` VALUES (44, '4M1', '单瓦楞纸箱', NULL);
INSERT INTO `base_package_info` VALUES (45, '4M2', '双瓦楞纸箱', NULL);
INSERT INTO `base_package_info` VALUES (46, '590', '其他袋', NULL);
INSERT INTO `base_package_info` VALUES (47, '5991', '麻袋', NULL);
INSERT INTO `base_package_info` VALUES (48, '5992', '布袋/包', NULL);
INSERT INTO `base_package_info` VALUES (49, '5993', '草席包', NULL);
INSERT INTO `base_package_info` VALUES (50, '5H', '塑料编织袋', NULL);
INSERT INTO `base_package_info` VALUES (51, '5H1', '塑料编织无内衬或涂层的袋', NULL);
INSERT INTO `base_package_info` VALUES (52, '5H2', '塑料编织防撤漏的袋', NULL);
INSERT INTO `base_package_info` VALUES (53, '5H3', '塑料编织防水的袋', NULL);
INSERT INTO `base_package_info` VALUES (54, '5H4', '塑料薄膜袋', NULL);
INSERT INTO `base_package_info` VALUES (55, '5H5', '无涂层或内衬的编织集装袋', NULL);
INSERT INTO `base_package_info` VALUES (56, '5H6', '带涂层的编织塑料集装袋', NULL);
INSERT INTO `base_package_info` VALUES (57, '5H7', '带内衬的编织塑料集装袋', NULL);
INSERT INTO `base_package_info` VALUES (58, '5H8', '带涂层和内衬的编织集装袋', NULL);
INSERT INTO `base_package_info` VALUES (59, '5H9', '集装袋', NULL);
INSERT INTO `base_package_info` VALUES (60, '5L1', '纺织品无内衬或涂层的袋', NULL);
INSERT INTO `base_package_info` VALUES (61, '5L2', '纺织品防撤漏的袋', NULL);
INSERT INTO `base_package_info` VALUES (62, '5L3', '纺织品防水的袋', NULL);
INSERT INTO `base_package_info` VALUES (63, '5M1', '多层的纸袋', NULL);
INSERT INTO `base_package_info` VALUES (64, '5M2', '多层防水纸袋', NULL);
INSERT INTO `base_package_info` VALUES (65, '5M91', '纸袋', NULL);
INSERT INTO `base_package_info` VALUES (66, '6HA1', '塑料容器在钢桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (67, '6HA2', '塑料容器在钢条或钢皮箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (68, '6HB1', '塑料容器在铝桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (69, '6HB2', '塑料容器在铝条或铝皮箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (70, '6HC', '塑料容器在木箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (71, '6HD1', '塑料容器在胶合板桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (72, '6HD2', '塑料容器在胶合板箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (73, '6HG1', '塑料容器在纤维桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (74, '6HG2', '塑料容器在纤维板箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (75, '6HH1', '塑料容器在塑料桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (76, '6HH2', '塑料容器在硬塑料箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (77, '6PA1', '玻璃、陶瓷、粗陶器在钢桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (78, '6PA2', '玻璃、陶瓷、粗陶器在钢条或钢皮箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (79, '6PB1', '玻璃、陶瓷、粗陶器在铝桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (80, '6PB2', '玻璃、陶瓷、粗陶器在铝条或铝皮箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (81, '6PC', '玻璃、陶瓷、粗陶器在木箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (82, '6PD1', '玻璃、陶瓷、粗陶器在胶合板内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (83, '6PD2', '玻璃、陶瓷、粗陶器在柳条筐内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (84, '6PG1', '玻璃、陶瓷、粗陶器在纤维桶内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (85, '6PG2', '玻璃、陶瓷、粗陶器在纤维板箱内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (86, '6PH1', '玻璃、陶瓷、粗陶器在膨胀塑料包装内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (87, '6PH2', '玻璃、陶瓷、粗陶器在硬塑料包装内复合包装', NULL);
INSERT INTO `base_package_info` VALUES (88, '9990', '竹箩', NULL);
INSERT INTO `base_package_info` VALUES (89, '9991', '竹笼', NULL);
INSERT INTO `base_package_info` VALUES (90, '9992', '植物性铺垫材料', NULL);
INSERT INTO `base_package_info` VALUES (91, '9993', '散装', NULL);
INSERT INTO `base_package_info` VALUES (92, '9994', '裸装', NULL);
INSERT INTO `base_package_info` VALUES (93, '9995', '挂装', NULL);
INSERT INTO `base_package_info` VALUES (94, '9996', '铺席', NULL);
INSERT INTO `base_package_info` VALUES (95, '9997', '捆装', NULL);
INSERT INTO `base_package_info` VALUES (96, '9999', '其他', NULL);
INSERT INTO `base_package_info` VALUES (97, '9A91', '铁托', NULL);
INSERT INTO `base_package_info` VALUES (98, '9A92', '铁笼', NULL);
INSERT INTO `base_package_info` VALUES (99, '9A93', '铁皮', NULL);
INSERT INTO `base_package_info` VALUES (100, '9C91', '天然木托', NULL);
INSERT INTO `base_package_info` VALUES (101, '9F91', '再生木托', NULL);

SET FOREIGN_KEY_CHECKS = 1;
