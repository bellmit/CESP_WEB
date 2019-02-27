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

 Date: 17/04/2018 17:49:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_ciq_org_info
-- ----------------------------
DROP TABLE IF EXISTS `base_ciq_org_info`;
CREATE TABLE `base_ciq_org_info`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国检机构代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国检机构名称',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 170 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_ciq_org_info
-- ----------------------------
INSERT INTO `base_ciq_org_info` VALUES (1, '440000', '广东局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (2, '440009', '广东局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (3, '440010', '广东局三水办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (4, '440020', '广东局凤岗办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (5, '440030', '广东局黄埔老港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (6, '440040', '广东局长安办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (7, '440050', '广东局南沙通用码头办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (8, '440060', '广东局从化马场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (9, '440070', '广东局广州空港综合保税区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (10, '440100', '广州局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (11, '440109', '广州局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (12, '440110', '广州局萝岗办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (13, '440120', '广州局机场快件转运中心办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (14, '440130', '广州局新风港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (15, '440140', '广州局河南港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (16, '440150', '广州局新沙办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (17, '440160', '广州局口岸鉴定业务办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (18, '440170', '广州局驻邮局办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (19, '440200', '韶关局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (20, '440300', '南海局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (21, '440310', '南海局南海港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (22, '440320', '南海局平洲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (23, '440330', '南海局九江办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (24, '440340', '南海局北村办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (25, '440350', '南海局官窑办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (26, '440400', '顺德局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (27, '440409', '顺德局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (28, '440410', '顺德局北滘办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (29, '440420', '顺德局容奇办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (30, '440430', '顺德局陈村办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (31, '440440', '顺德局客运港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (32, '440450', '顺德局勒流办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (33, '440500', '汕头局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (34, '440509', '汕头局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (35, '440510', '汕头局潮阳办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (36, '440520', '汕头局潮汕机场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (37, '440530', '汕头局南澳办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (38, '440540', '汕头局澄海办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (39, '440550', '汕头局保税区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (40, '440560', '汕头局达濠办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (41, '440570', '汕头局龙湖办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (42, '440580', '汕头局国际集装箱码头办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (43, '440590', '汕头局广澳办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (44, '440600', '佛山局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (45, '440620', '佛山局澜石办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (46, '440630', '佛山局火车站办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (47, '440640', '佛山局新港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (48, '440650', '佛山局快件监管办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (49, '440700', '江门局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (50, '440709', '江门局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (51, '440710', '江门局台山办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (52, '440720', '江门局鹤山办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (53, '440730', '江门局恩平办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (54, '440740', '江门局高沙办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (55, '440750', '江门局外海办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (56, '440760', '江门局高新区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (57, '440800', '湛江局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (58, '440810', '湛江局南油办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (59, '440820', '湛江局霞海办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (60, '440830', '湛江局徐闻办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (61, '440840', '湛江局东海岛办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (62, '440850', '湛江局湛江机场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (63, '440860', '湛江局霞山办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (64, '440870', '湛江局调顺办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (65, '440900', '茂名局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (66, '440910', '茂名局水东港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (67, '440920', '茂名局信宜办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (68, '441000', '潮州局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (69, '441010', '潮州局潮安办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (70, '441020', '潮州局车检场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (71, '441100', '饶平局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (72, '441101', '饶平局三饶工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (73, '441110', '饶平局潮洲港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (74, '441200', '肇庆局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (75, '441204', '肇庆局新港码头工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (76, '441205', '肇庆局大旺进出境货物车辆检查场工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (77, '441206', '肇庆局亚洲金属资源再生工业园工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (78, '441210', '肇庆局高要办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (79, '441220', '肇庆局四会办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (80, '441230', '肇庆局云浮办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (81, '441240', '肇庆局罗定办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (82, '441260', '肇庆局火车站办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (83, '441270', '肇庆局三榕办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (84, '441280', '肇庆局亚洲工业园办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (85, '441300', '惠州局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (86, '441306', '惠州局惠东黄埠工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (87, '441310', '惠州局惠东办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (88, '441320', '惠州局惠阳办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (89, '441330', '惠州局博罗办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (90, '441340', '惠州局惠东港口办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (91, '441350', '惠州局车检场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (92, '441360', '惠州局新墟办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (93, '441370', '惠州局园洲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (94, '441380', '惠州局碧甲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (95, '441400', '梅州局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (96, '441409', '梅州局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (97, '441420', '梅州局大埔办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (98, '441500', '汕尾局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (99, '441510', '汕尾局海城办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (100, '441520', '汕尾局陆丰办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (101, '441600', '河源局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (102, '441610', '河源局高新区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (103, '441700', '阳江局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (104, '441710', '阳江局阳江港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (105, '441720', '阳江局阳春办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (106, '441800', '清远局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (107, '441802', '清远局港口工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (108, '441810', '清远局英德办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (109, '441820', '清远局车检场办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (110, '441900', '东莞局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (111, '441910', '东莞局太平办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (112, '441930', '东莞局常平办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (113, '441950', '东莞局沙田办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (114, '441960', '东莞局寮步办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (115, '441970', '东莞局龙通码头办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (116, '442000', '中山局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (117, '442009', '中山局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (118, '442010', '中山局中山港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (119, '442020', '中山局小榄办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (120, '442030', '中山局坦洲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (121, '442040', '中山局石岐办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (122, '442050', '中山局神湾办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (123, '442060', '中山局古镇办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (124, '442070', '中山局沙溪办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (125, '442080', '中山局三乡办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (126, '442100', '黄埔局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (127, '442110', '黄埔局黄埔新港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (128, '442120', '黄埔局开发区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (129, '442140', '黄埔局穗港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (130, '442150', '黄埔局庙头办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (131, '442200', '天河局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (132, '442209', '天河局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (133, '442300', '广州机场局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (134, '442309', '广州机场局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (135, '442400', '番禺局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (136, '442409', '番禺局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (137, '442410', '番禺局南沙办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (138, '442420', '番禺局莲花山办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (139, '442430', '番禺局沙湾办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (140, '442440', '番禺局龙穴岛办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (141, '442500', '花都局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (142, '442510', '花都局花都港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (143, '442600', '增城局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (144, '442620', '增城局江龙办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (145, '442630', '增城局东洲湾办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (146, '442700', '从化局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (147, '442709', '从化局金伯利办公室', NULL);
INSERT INTO `base_ciq_org_info` VALUES (148, '442800', '新会局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (149, '442810', '新会局新会港办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (150, '442820', '新会局今古洲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (151, '442900', '开平局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (152, '442910', '开平局三埠办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (153, '443000', '高明局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (154, '443001', '高明局食出码头检验检疫工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (155, '443010', '高明局码头办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (156, '443100', '大亚湾局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (157, '443110', '大亚湾局石化区办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (158, '443200', '揭阳局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (159, '443210', '揭阳局普宁办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (160, '443220', '揭阳局惠来办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (161, '443300', '云浮局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (162, '443301', '云浮局新港码头工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (163, '443302', '云浮局车检场工作点', NULL);
INSERT INTO `base_ciq_org_info` VALUES (164, '443400', '南沙局本部', NULL);
INSERT INTO `base_ciq_org_info` VALUES (165, '443410', '南沙局金洲办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (166, '443420', '南沙局龙穴岛办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (167, '443430', '南沙局小虎岛办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (168, '442302', '广州机场快件运转中心办事处', NULL);
INSERT INTO `base_ciq_org_info` VALUES (169, '442301', '广州机场综保办', NULL);

SET FOREIGN_KEY_CHECKS = 1;
