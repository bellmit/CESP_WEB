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

 Date: 17/04/2018 17:35:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_trade_mode
-- ----------------------------
DROP TABLE IF EXISTS `base_trade_mode`;
CREATE TABLE `base_trade_mode`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贸易类型代码',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 96 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of base_trade_mode
-- ----------------------------
INSERT INTO `base_trade_mode` VALUES (1, '0110', '一般贸易', '一般贸易');
INSERT INTO `base_trade_mode` VALUES (2, '0130', '易货贸易', '易货贸易');
INSERT INTO `base_trade_mode` VALUES (3, '0139', '旅游购物商品', '用于旅游者五万美元以下的出口小批量订货');
INSERT INTO `base_trade_mode` VALUES (4, '0200', '料件放弃', '主动放弃交由海关处理的来料或进料加工料件');
INSERT INTO `base_trade_mode` VALUES (5, '0214', '来料加工', '来料加工装配贸易进口料件及加工出口货物');
INSERT INTO `base_trade_mode` VALUES (6, '0245', '来料料件内销', '来料加工料件转内销');
INSERT INTO `base_trade_mode` VALUES (7, '0255', '来料深加工', '来料深加工结转货物');
INSERT INTO `base_trade_mode` VALUES (8, '0258', '来料余料结转', '来料加工余料结转');
INSERT INTO `base_trade_mode` VALUES (9, '0265', '来料料件复出', '来料加工复运出境的原进口料件');
INSERT INTO `base_trade_mode` VALUES (10, '0300', '来料料件退换', '来料加工料件退换');
INSERT INTO `base_trade_mode` VALUES (11, '0314', '加工专用油', '国营贸易企业代理来料加工企业进口柴油');
INSERT INTO `base_trade_mode` VALUES (12, '0320', '不作价设备', '加工贸易外商提供的不作价进口设备');
INSERT INTO `base_trade_mode` VALUES (13, '0345', '来料成品减免', '来料加工成品凭征免税证明转减免税');
INSERT INTO `base_trade_mode` VALUES (14, '0400', '成品放弃', '主动放弃交由海关处理的来料及进料加工成品');
INSERT INTO `base_trade_mode` VALUES (15, '0420', '加工贸易设备', '加工贸易项下外商提供的进口设备');
INSERT INTO `base_trade_mode` VALUES (16, '0444', '保区进料成品', '按成品征税的保税区进料加工成品转内销货物');
INSERT INTO `base_trade_mode` VALUES (17, '0445', '保区来料成品', '按成品征税的保税区来料加工成品转内销货物');
INSERT INTO `base_trade_mode` VALUES (18, '0446', '加工设备内销', '加工贸易免税进口设备转内销');
INSERT INTO `base_trade_mode` VALUES (19, '0456', '加工设备结转', '加工贸易免税进口设备结转');
INSERT INTO `base_trade_mode` VALUES (20, '0466', '加工设备退运', '加工贸易免税进口设备退运出境');
INSERT INTO `base_trade_mode` VALUES (21, '0500', '减免设备结转', '用于监管年限内减免税设备的结转');
INSERT INTO `base_trade_mode` VALUES (22, '0513', '补偿贸易', '补偿贸易');
INSERT INTO `base_trade_mode` VALUES (23, '0544', '保区进料料件', '按料件征税的保税区进料加工成品转内销货物');
INSERT INTO `base_trade_mode` VALUES (24, '0545', '保区来料料件', '按料件征税的保税区来料加工成品转内销货物');
INSERT INTO `base_trade_mode` VALUES (25, '0615', '进料对口', '进料加工(对口合同)');
INSERT INTO `base_trade_mode` VALUES (26, '0642', '进料以产顶进', '进料加工成品以产顶进');
INSERT INTO `base_trade_mode` VALUES (27, '0644', '进料料件内销', '进料加工料件转内销');
INSERT INTO `base_trade_mode` VALUES (28, '0654', '进料深加工', '进料深加工结转货物');
INSERT INTO `base_trade_mode` VALUES (29, '0657', '进料余料结转', '进料加工余料结转');
INSERT INTO `base_trade_mode` VALUES (30, '0664', '进料料件复出', '进料加工复运出境的原进口料件');
INSERT INTO `base_trade_mode` VALUES (31, '0700', '进料料件退换', '进料加工料件退换');
INSERT INTO `base_trade_mode` VALUES (32, '0715', '进料非对口', '进料加工(非对口合同)');
INSERT INTO `base_trade_mode` VALUES (33, '0744', '进料成品减免', '进料加工成品凭征免税证明转减免税');
INSERT INTO `base_trade_mode` VALUES (34, '0815', '低值辅料', '低值辅料');
INSERT INTO `base_trade_mode` VALUES (35, '0844', '进料边角料内销', '进料加工项下边角料转内销');
INSERT INTO `base_trade_mode` VALUES (36, '0845', '来料边角料内销', '来料加工项下边角料内销');
INSERT INTO `base_trade_mode` VALUES (37, '0864', '进料边角料复出', '进料加工项下边角料复出口');
INSERT INTO `base_trade_mode` VALUES (38, '0865', '来料边角料复出', '来料加工项下边角料复出口');
INSERT INTO `base_trade_mode` VALUES (39, '1139', '国轮油物料', '中国籍运输工具境内添加的保税油料、物料');
INSERT INTO `base_trade_mode` VALUES (40, '1200', '保税间货物', '海关保税场所及保税区域之间往来的货物');
INSERT INTO `base_trade_mode` VALUES (41, '1215', '保税工厂', '保税工厂');
INSERT INTO `base_trade_mode` VALUES (42, '1233', '保税仓库货物', '保税仓库进出境货物');
INSERT INTO `base_trade_mode` VALUES (43, '1234', '保税区仓储转口', '保税区进出境仓储转口货物');
INSERT INTO `base_trade_mode` VALUES (44, '1300', '修理物品', '进出境修理物品');
INSERT INTO `base_trade_mode` VALUES (45, '1427', '出料加工', '出料加工');
INSERT INTO `base_trade_mode` VALUES (46, '1500', '租赁不满一年', '租期不满一年的租赁贸易货物');
INSERT INTO `base_trade_mode` VALUES (47, '1523', '租赁贸易', '租期在一年及以上的租赁贸易货物');
INSERT INTO `base_trade_mode` VALUES (48, '1616', '寄售代销', '寄售、代销贸易');
INSERT INTO `base_trade_mode` VALUES (49, '1741', '免税品', '免税品');
INSERT INTO `base_trade_mode` VALUES (50, '1831', '外汇商品', '免税外汇商品');
INSERT INTO `base_trade_mode` VALUES (51, '2025', '合资合作设备', '合资合作企业作为投资进口设备物品');
INSERT INTO `base_trade_mode` VALUES (52, '2225', '外资设备物品', '外资企业作为投资进口的设备物品');
INSERT INTO `base_trade_mode` VALUES (53, '2439', '常驻机构公用', '外国常驻机构进口办公用品');
INSERT INTO `base_trade_mode` VALUES (54, '2600', '暂时进出货物', '暂时进出口货物');
INSERT INTO `base_trade_mode` VALUES (55, '2700', '展览品', '进出境展览品');
INSERT INTO `base_trade_mode` VALUES (56, '2939', '陈列样品', '驻华商业机构不复运出口的进口陈列样品');
INSERT INTO `base_trade_mode` VALUES (57, '3010', '货样广告品Ａ', '有经营权单位进出口的货样广告品');
INSERT INTO `base_trade_mode` VALUES (58, '3039', '货样广告品Ｂ', '无经营权单位进出口的货样广告品');
INSERT INTO `base_trade_mode` VALUES (59, '3100', '无代价抵偿', '无代价抵偿进出口货物');
INSERT INTO `base_trade_mode` VALUES (60, '3339', '其他进出口免费', '其他进出口免费提供货物');
INSERT INTO `base_trade_mode` VALUES (61, '3410', '承包工程进口', '对外承包工程进口物资');
INSERT INTO `base_trade_mode` VALUES (62, '3422', '对外承包出口', '对外承包工程出口物资');
INSERT INTO `base_trade_mode` VALUES (63, '3511', '援助物资', '国家和国际组织无偿援助物资');
INSERT INTO `base_trade_mode` VALUES (64, '3611', '无偿军援', '无偿军援');
INSERT INTO `base_trade_mode` VALUES (65, '3612', '捐赠物资', '进出口捐赠物资');
INSERT INTO `base_trade_mode` VALUES (66, '3910', '军事装备', '军事装备 ');
INSERT INTO `base_trade_mode` VALUES (67, '4019', '边境小额', '边境小额贸易(边民互市贸易除外)');
INSERT INTO `base_trade_mode` VALUES (68, '4039', '对台小额', '对台小额贸易');
INSERT INTO `base_trade_mode` VALUES (69, '4139', '对台小额商品交易市场', '进入对台小额商品交易专用市场的货物');
INSERT INTO `base_trade_mode` VALUES (70, '4200', '驻外机构运回', '我驻外机构运回旧公用物品');
INSERT INTO `base_trade_mode` VALUES (71, '4239', '驻外机构购进', '我驻外机构境外购买运回国的公务用品');
INSERT INTO `base_trade_mode` VALUES (72, '4400', '来料成品退换', '来料加工成品退换');
INSERT INTO `base_trade_mode` VALUES (73, '4500', '直接退运', '直接退运');
INSERT INTO `base_trade_mode` VALUES (74, '4539', '进口溢误卸', '进口溢卸、误卸货物');
INSERT INTO `base_trade_mode` VALUES (75, '4561', '退运货物', '因质量不符、延误交货等原因退运进出境货物');
INSERT INTO `base_trade_mode` VALUES (76, '4600', '进料成品退换', '进料成品退换');
INSERT INTO `base_trade_mode` VALUES (77, '5000', '料件进出区', '用于区内外非实际进出境货物');
INSERT INTO `base_trade_mode` VALUES (78, '5010', '出口加工区研发货物', '出口加工区与境外之间进出的研发货物');
INSERT INTO `base_trade_mode` VALUES (79, '5015', '区内加工货物', '加工区内企业从境外进口料件及加工出口成品');
INSERT INTO `base_trade_mode` VALUES (80, '5033', '区内仓储货物', '加工区内仓储企业从境外进口的货物');
INSERT INTO `base_trade_mode` VALUES (81, '5100', '成品进出区', '用于区内外非实际进出境货物');
INSERT INTO `base_trade_mode` VALUES (82, '5200', '区内边角调出', '用于区内外非实际进出境货物');
INSERT INTO `base_trade_mode` VALUES (83, '5300', '设备进出区', '用于区内外非实际进出境货物');
INSERT INTO `base_trade_mode` VALUES (84, '5335', '境外设备进区', '加工区内企业从境外进口的设备物资');
INSERT INTO `base_trade_mode` VALUES (85, '5361', '区内设备退运', '加工区内设备退运境外');
INSERT INTO `base_trade_mode` VALUES (86, '6033', '物流中心进出境货物', '保税物流中心与境外之间进出仓储货物');
INSERT INTO `base_trade_mode` VALUES (87, '9600', '内贸货物跨境运输', '内贸货物跨境运输');
INSERT INTO `base_trade_mode` VALUES (88, '9639', '海关处理货物', '海关变卖处理的超期未报货物 ,走私违规货物');
INSERT INTO `base_trade_mode` VALUES (89, '9700', '后续补税', '无原始报关单的后续补税');
INSERT INTO `base_trade_mode` VALUES (90, '9739', '其他贸易', '其他贸易');
INSERT INTO `base_trade_mode` VALUES (91, '9800', '租赁征税', '租赁期一年及以上的租赁贸易货物的租金');
INSERT INTO `base_trade_mode` VALUES (92, '9839', '留赠转卖物品', '外交机构转售境内或国际活动留赠放弃特批货');
INSERT INTO `base_trade_mode` VALUES (93, '9900', '其他', '其他');
INSERT INTO `base_trade_mode` VALUES (94, '1210', 'B2B2C 保税模式', 'B2B2C 保税模式');
INSERT INTO `base_trade_mode` VALUES (95, '9610', 'B2C 直邮模式', 'B2C 直邮模式');

SET FOREIGN_KEY_CHECKS = 1;
