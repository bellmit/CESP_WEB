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

 Date: 17/04/2018 18:14:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_regulatory_place
-- ----------------------------
DROP TABLE IF EXISTS `base_regulatory_place`;
CREATE TABLE `base_regulatory_place`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监管场所代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '监管场所名称',
  `owner_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属海关关区',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 111 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_regulatory_place
-- ----------------------------
INSERT INTO `base_regulatory_place` VALUES (1, '5106', '小虎码头', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (2, '5141', '广州机场', NULL, NULL);
INSERT INTO `base_regulatory_place` VALUES (3, '5145', '广州邮办', NULL, NULL);
INSERT INTO `base_regulatory_place` VALUES (4, '5130', '广州萝岗', NULL, NULL);
INSERT INTO `base_regulatory_place` VALUES (5, '5161', '沙湾车场', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (6, '5162', '番禺旅检', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (7, '5163', '番禺货柜', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (8, '5164', '番禺船舶', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (9, '5165', '南沙旅检', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (10, '5166', '南沙货柜', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (11, '5167', '南沙货港', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (12, '5168', '沙湾联运', 'NULL', NULL);
INSERT INTO `base_regulatory_place` VALUES (13, '5169', '东发码头', '番禺口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (14, '5201', '老港作业区', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (15, '5202', '永业码头', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (16, '5203', '鱼珠码头', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (17, '5204', '广州石化', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (18, '5205', '老港锚地', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (19, '5206', '惠州海关', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (20, '5207', '广裕码头', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (21, '5208', '集通码头', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (22, '5209', '庙头码头', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (23, '5210', '新港作业区', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (24, '5211', '集司码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (25, '5212', '东江仓码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (26, '5213', '东江口码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (27, '5214', '全通秀丽码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (28, '5215', '穗港码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (29, '5216', '开发区车检场', '开发区', NULL);
INSERT INTO `base_regulatory_place` VALUES (30, '5217', '西基码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (31, '5218', '广保通码头', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (32, '5219', '保税区车检场', '开发区', NULL);
INSERT INTO `base_regulatory_place` VALUES (33, '5220', '口岸码头', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (34, '5221', '东洲湾码头', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (35, '5222', '西洲码头', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (36, '5223', '新塘车检场', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (37, '5224', '智能化新车检场', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (38, '5225', '东莞海昌煤炭专用码头', '新沙港', NULL);
INSERT INTO `base_regulatory_place` VALUES (39, '5226', '龙通码头', '东莞口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (40, '5227', '蟹山堆场', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (41, '5229', '黄埔状元谷', NULL, NULL);
INSERT INTO `base_regulatory_place` VALUES (42, '5238', '凤岗车检场', '东莞口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (43, '5239', '虎门车检场', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (44, '5240', '虎门货柜码头', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (45, '5241', '荣轩码头', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (46, '5242', '联通码头', '沙田口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (47, '5243', '东洲石化', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (48, '5244', '启盈快件', '沙田口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (49, '5245', '蓝星大汇', '沙田口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (50, '5246', '飞虎石油', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (51, '5247', '国际货柜', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (52, '5248', '华润水泥', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (53, '5249', '太平客运', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (54, '5250', '虎门7、8号泊位', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (55, '5251', '海腾码头', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (56, '5252', '同舟石化', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (57, '5253', '三江石化', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (58, '5254', '沙角A电厂', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (59, '5255', '沙角B电厂', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (60, '5256', '沙角C电厂', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (61, '5257', '新塘测试码头', 'NULL', NULL);
INSERT INTO `base_regulatory_place` VALUES (62, '5258', '南粤物流', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (63, '5259', '东莞油储', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (64, '5260', '鼎胜堆场', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (65, '5261', '外运仓内装', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (66, '5262', '大码头内装', '老港', NULL);
INSERT INTO `base_regulatory_place` VALUES (67, '5263', '跨境电商', '开发区', NULL);
INSERT INTO `base_regulatory_place` VALUES (68, '5264', '中远修船码头', '新沙', NULL);
INSERT INTO `base_regulatory_place` VALUES (69, '5265', '石龙港中外运铁路货运堆场', '东莞', NULL);
INSERT INTO `base_regulatory_place` VALUES (70, '5266', '东莞中海龙仓储', '东莞中海龙仓储有限公司', NULL);
INSERT INTO `base_regulatory_place` VALUES (71, '5268', '寮步车检场', '东莞', NULL);
INSERT INTO `base_regulatory_place` VALUES (72, '5269', '东莞保税物流中心（B型）', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (73, '5270', '东莞永得利仓储', '新沙港', NULL);
INSERT INTO `base_regulatory_place` VALUES (74, '5271', '深赤湾', '新沙', NULL);
INSERT INTO `base_regulatory_place` VALUES (75, '5272', '新塘智能化车检场测试', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (76, '5277', '阳鸿石化测试', '沙田口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (77, '5281', '常平客运', '常平办', NULL);
INSERT INTO `base_regulatory_place` VALUES (78, '5282', '新沙作业区', '新沙港', NULL);
INSERT INTO `base_regulatory_place` VALUES (79, '5284', '长安车检场', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (80, '5285', '常平快件', '常平办', NULL);
INSERT INTO `base_regulatory_place` VALUES (81, '5286', '马士基码头', '麻涌口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (82, '5287', '东莞货站', '东莞', NULL);
INSERT INTO `base_regulatory_place` VALUES (83, '5288', '东方集装箱堆场', '太平口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (84, '5289', '金明石化', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (85, '5290', '出口加工区', '开发区', NULL);
INSERT INTO `base_regulatory_place` VALUES (86, '5292', '益海粮油', '新港', NULL);
INSERT INTO `base_regulatory_place` VALUES (87, '5293', '江龙车检场', '新塘口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (88, '5294', '虎门5、6号泊位', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (89, '5295', '东莞快件', '东莞口岸', NULL);
INSERT INTO `base_regulatory_place` VALUES (90, '5296', '九丰LPG', '虎门港', NULL);
INSERT INTO `base_regulatory_place` VALUES (91, '5297', '加贸结转', 'NULL', NULL);
INSERT INTO `base_regulatory_place` VALUES (92, '5298', '外关区', 'NULL', NULL);
INSERT INTO `base_regulatory_place` VALUES (93, '5299', '其它业务', 'NULL', NULL);
INSERT INTO `base_regulatory_place` VALUES (94, '6', '大通', '天竺大通', NULL);
INSERT INTO `base_regulatory_place` VALUES (95, '7', '客货代理', '集中库区', NULL);
INSERT INTO `base_regulatory_place` VALUES (96, '8', 'DHL', '快件中心', NULL);
INSERT INTO `base_regulatory_place` VALUES (97, '9', '华北空运', '集中库区/快件中心', NULL);
INSERT INTO `base_regulatory_place` VALUES (98, 'A', 'TNT', '快件中心', NULL);
INSERT INTO `base_regulatory_place` VALUES (99, 'B', 'OCS', '快件中心', NULL);
INSERT INTO `base_regulatory_place` VALUES (100, 'C', 'UPS', '快件中心', NULL);
INSERT INTO `base_regulatory_place` VALUES (101, 'D', '中辉', '集中库区', NULL);
INSERT INTO `base_regulatory_place` VALUES (102, 'E', '华力', '集中库区', NULL);
INSERT INTO `base_regulatory_place` VALUES (103, 'F', '6909', '国航集团', NULL);
INSERT INTO `base_regulatory_place` VALUES (104, 'G', '金玛', '集中库区', NULL);
INSERT INTO `base_regulatory_place` VALUES (105, 'H', 'BGS', '机场', NULL);
INSERT INTO `base_regulatory_place` VALUES (106, 'J', '京信国航', '京信', NULL);
INSERT INTO `base_regulatory_place` VALUES (107, 'K', '中经得美', '天竺', NULL);
INSERT INTO `base_regulatory_place` VALUES (108, 'L', '近铁', '天竺空港', NULL);
INSERT INTO `base_regulatory_place` VALUES (109, 'M', '北京大田', '天竺', NULL);
INSERT INTO `base_regulatory_place` VALUES (110, 'N', '华惠航运贸', '快件集中库区', NULL);

SET FOREIGN_KEY_CHECKS = 1;
