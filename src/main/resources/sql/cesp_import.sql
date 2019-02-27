# 进口部分业务表

DROP table if  EXISTS goods_reg_head;

-- 商品备案申报头
create table goods_reg_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  ebp_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  curr_code varchar(3) COMMENT '币制代码',
  business_type varchar(1) COMMENT '跨境业务类型（1-特殊监管区域BBC保税进口；2-保税仓库BBC保税进口；3-BC直购进口；）',
  input_date timestamp NULL DEFAULT NULL COMMENT '录入日期',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `goods_reg_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `goods_reg_head` ADD INDEX `IDX_DECLENTID`(`decl_ent_id`);

DROP table if  EXISTS goods_content;

-- 商品备案清单信息
create table goods_content(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  goods_reg_head_id int(10) COMMENT '关联商品备案申报头id',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ebp_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  seq decimal(3) COMMENT '商品序号',
  ent_goods_no varchar(20) COMMENT '企业商品自编号',
  eport_goods_no varchar(60) COMMENT '跨境公共平台商品备案申请号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(50) COMMENT '海关正式备案编号',
  ems_no varchar(255) COMMENT '账册编号',
  item_no varchar(255) COMMENT '保税账册中的项号',
  shelf_gname varchar(255) COMMENT '上架品名',
  ncad_code varchar(8) COMMENT '行邮税号',
  hs_code varchar(10) COMMENT 'HS编码',
  bar_code varchar(30) COMMENT '商品条形码',
  goods_name varchar(255) COMMENT '商品名称',
  goods_style varchar(255) COMMENT '规格型号',
  brand varchar(50) COMMENT '品牌',
  gunit varchar(3) COMMENT '申报计量单位',
  std_unit varchar(3) COMMENT '第一法定计量单位',
  sec_unit varchar(3) COMMENT '第二法定计量单位',
  reg_price decimal(19,5) COMMENT '单价（指无税的销售价格, RMB）',
  gift_flag varchar(1) COMMENT '是否赠品（0-是；1-否，默认否）',
  origin_country varchar(3) COMMENT '原产国代码',
  quality varchar(100) COMMENT '商品品质及说明',
  qualify_certify varchar(100) COMMENT '品质证明说明',
  manufactory varchar(255) COMMENT '生产厂家或供应商',
  net_wt decimal(19,5) COMMENT '净重，单位KG',
  gross_wt decimal(19,5) COMMENT '毛重，单位KG',
  notes varchar(1000) COMMENT '备注',
  
  cus_message_status_goods varchar(10) DEFAULT '0' COMMENT '海关商品备案状态',
  cus_goods_return_info varchar(1000) COMMENT '海关商品备案回执内容',
  
  ciq_message_status_goods varchar(10) DEFAULT '0' COMMENT '国检商品备案状态',
  ciq_goods_return_info varchar(1000) COMMENT '国检商品备案回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
 
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `goods_content` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `goods_content` ADD INDEX `IDX_DECLENTID`(`decl_ent_id`);

DROP table if  EXISTS inbound_head;

-- 进仓清单头部信息
create table inbound_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ent_inbound_no varchar(60) COMMENT '企业自编号（可以是总运单号）',
  eport_inbound_no varchar(60) COMMENT '公共平台入仓编号',
  ciq_inbound_no varchar(36) COMMENT '检验检疫入仓编号',
  cis_inbound_no varchar(60) COMMENT '海关入仓编号',
  discharge_place varchar(50) COMMENT '货物存放地（填在检验检疫申请到的仓库编号）',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  corr_doc_type varchar(1) COMMENT '对应单据类型（0-报关单　1-进口转关单　2-出口转关单；）',
  ems_no varchar(12) COMMENT '账册编号',
  trade_mode varchar(4) COMMENT '监管方式',
  recipient varchar(100) COMMENT '收货人（填写保税进口商名称。非具体货物的收货人）',
  shipper varchar(100) COMMENT '发货人（填写境外交易人名称。非具体货物的发货人）',
  inbound_port varchar(10) COMMENT '进境口岸（检验检疫口岸代码，具体哪个现场就填哪个口岸代码）',
  country_code varchar(3) COMMENT '起抵国（国家代码）',
  inbound_date timestamp NULL DEFAULT NULL COMMENT '进出仓日期',
  input_date timestamp NULL DEFAULT NULL COMMENT '录入日期',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS inbound_content;

-- 进仓清单信息
create table inbound_content(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  inbound_head_id int(10) COMMENT '关联进仓清单申报头id',
--  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
--  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
--  customs_code varchar(4) COMMENT '主管海关代码',
--  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  
  seq decimal(3) COMMENT '商品序号',
  goods_batch_no varchar(60) COMMENT '商品批次号（溯源商品必须填写提运单号）',
  ent_goods_no varchar(20) COMMENT '企业商品自编号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(50) COMMENT '海关正式备案编号',
  hs_code varchar(10) COMMENT '海关商品编码',
  origin_country varchar(3) COMMENT '原产国/地区（参照国别代码表）',
  purchase_place varchar(3) COMMENT '采购地点（参照国别代码表）',
  goods_name varchar(255) COMMENT '商品名称（对应报关单的商品名称）',
  goods_style varchar(100) COMMENT '型号规格（对应报关单的商品规格、型号）',
  std_unit varchar(3) COMMENT '标准计量单位（对应报关单的第一计量单位）',
  sec_unit varchar(3) COMMENT '第二计量单位（对应报关单的第二计量单位）',
  manufactory varchar(200) COMMENT '生产厂家',
  std_qty decimal(19,5) COMMENT '标准数量（对应报关单的第一数量）',
  sec_qty decimal(19,5) COMMENT '第二数量（对应报关单的第二数量）',
  declare_price decimal(19,5) COMMENT '申报单价（采购价格）',
  dec_total decimal(19,5) COMMENT '申报总价',
  curr_code varchar(3) COMMENT '币制代码',
  trade_country varchar(3) COMMENT '贸易国别代码',
  package_type varchar(4) COMMENT '包装种类（内包装）代码',
  outer_package varchar(4) COMMENT '辅助包材',
  gross_weight decimal(15,5) COMMENT '毛重',
  net_weight decimal(15,5) COMMENT '净重',
  notes varchar(1000) COMMENT '备注',
  
  
--  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
--  create_user_id int(10) COMMENT '数据录入用户ID',
--  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
--  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS book;

-- 账册
create table book(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  ems_no varchar(12) COMMENT '账册编号',
  
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  
  ent_goods_no varchar(20) COMMENT '企业商品自编号',
  eport_goods_no varchar(60) COMMENT '跨境公共平台商品备案申请号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(50) COMMENT '海关正式备案编号',
  
  goods_name varchar(250) COMMENT '商品名称',
  goods_style varchar(200) COMMENT '规格型号',
  unit varchar(3) COMMENT '计量单位',
  
  
  inventory decimal(19,5) COMMENT '商品库存',
--  available_inventory decimal(19,5) COMMENT '可用库存',
  
  notes varchar(1000) COMMENT '备注',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS book_log;

-- 库存入出明细记录
create table book_log(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  book_id int(10) COMMENT '关联账册主键id',
  
  inventory_type varchar(8) COMMENT '库存类型',
  io_flag varchar(1) COMMENT '入出库标志（I-入库，O-出库）',
  qty decimal(19,5) COMMENT '入出库数量',
  io_date timestamp NULL DEFAULT NULL COMMENT '入出库日期',
  corr_doc_code varchar(18) COMMENT '单据编号',
  corrt_doc_type varchar(1) COMMENT '单据类型',
  
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP table if  EXISTS order_head;

-- 电子订单申报头部信息
create table order_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ebp_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  order_detail_ids varchar(255) COMMENT '关联订单详情id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `order_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);


DROP table if  EXISTS order_detail;

-- 电子订单详情信息
create table order_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  order_head_id int(10) COMMENT '关联电子订单表头ID',
  ent_order_no varchar(60) NOT NULL  COMMENT '企业电子订单编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ebp_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  order_status varchar(1) COMMENT '电子订单状态（0-订单确认；1-订单完成；2-订单取消）',
  pay_status varchar(1) COMMENT '支付状态（0-已付款；1-未付款）',
  order_good_total decimal(19,5) COMMENT '订单商品总额',
  order_good_total_curr varchar(3) COMMENT '订单商品总额币制',
  freight decimal(19,5) COMMENT '订单运费(无则填“0”)',
  tax decimal(19,5) COMMENT '税款(无则填“0”)',
  other_payment decimal(19,5) COMMENT '抵付金额(优惠减免金额，无则填“0”)',
  other_pay_notes varchar(1024) COMMENT '抵付说明',
  other_charges decimal(19,5) COMMENT '其他费用(无则填“0”)',
  actual_amount_paid decimal(19,5) COMMENT '实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））',
  recipient_name varchar(100) COMMENT '收货人名称，同运单',
  recipient_addr varchar(200) COMMENT '收货人地址，同运单',
  recipient_tel varchar(50) COMMENT '收货人电话，同运单',
  recipient_country varchar(8) COMMENT '收货人所在国家代码',
  recipient_provinces_code varchar(6) COMMENT '收货人行政区代码',
  order_doc_account varchar(60) COMMENT '下单人账户',
  order_doc_name varchar(60) COMMENT '下单人姓名',
  order_doc_type varchar(2) COMMENT '下单人证件类型（01:身份证、02:护照、04:其他）',
  order_doc_id varchar(60) COMMENT '下单人证件号(默认为身份证号)',
  order_doc_tel varchar(50) COMMENT '下单人电话',
  order_date timestamp NULL DEFAULT NULL COMMENT '订单日期',
  batch_numbers varchar(100) COMMENT '商品批次号',
  invoice_type varchar(1) COMMENT '发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）',
  invoice_no varchar(20) COMMENT '发票编号',
  invoice_title varchar(100) COMMENT '发票抬头',
  invoice_identify_id varchar(30) COMMENT '纳税人标志号',
  invoice_desc varchar(200) COMMENT '发票内容',
  invoice_amount decimal(19,5) COMMENT '发票金额',
  invoice_date timestamp NULL DEFAULT NULL COMMENT '开票日期',
  notes varchar(1000) COMMENT '备注',
  
  cus_message_status_order varchar(10) DEFAULT '0' COMMENT '海关电子订单状态',
  cus_order_return_info varchar(1000) COMMENT '海关订单回执内容',
  
  ciq_message_status_order varchar(10) DEFAULT '0' COMMENT '国检电子订单状态',
  ciq_order_return_info varchar(1000) COMMENT '国检订单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `order_detail` ADD INDEX `IDX_ORDERHEADID`(`order_head_id`);
ALTER TABLE `order_detail` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `order_detail` ADD INDEX `IDX_DECLENTID_ORDERNO`(`decl_ent_id`,`ent_order_no`);
ALTER TABLE `order_detail` ADD INDEX `IDX_EBENTID_ORDERNO`(`eb_ent_id`,`ent_order_no`);

DROP table if  EXISTS order_goods_list;

-- 订单商品信息
create table order_goods_list(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  order_detail_id int(10) COMMENT '关联电子订单详情ID',
  seq decimal(4) COMMENT '商品序号',
  ent_goods_no varchar(30) COMMENT '企业商品自编号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(50) COMMENT '海关正式备案编号',
  hs_code varchar(10) COMMENT 'HS编码',
  goods_name varchar(250) COMMENT '企业商品品名',
  goods_style varchar(200) COMMENT '规格型号',
  goods_describe varchar(1000) COMMENT '企业商品描述',
  origin_country varchar(3) COMMENT '原产国代码',
  bar_code varchar(20) COMMENT '商品条形码',
  brand varchar(100) COMMENT '品牌',
  qty decimal(19,5) COMMENT '数量',
  unit varchar(3) COMMENT '计量单位',
  price decimal(19,5) COMMENT '单价',
  total decimal(19,5) COMMENT '总价',
  curr_code varchar(3) COMMENT '币制',
  notes varchar(1000) COMMENT '备注',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `order_goods_list` ADD INDEX `IDX_ORDERDETAILID`(`order_detail_id`);

DROP table if  EXISTS waybill_head;

-- 电子运单申报头部信息
create table waybill_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  ehs_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  waybill_detail_ids varchar(255) COMMENT '关联运单详情id集合',

  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `waybill_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);

DROP table if  EXISTS waybill_detail;

-- 电子运单详情信息
create table waybill_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  waybill_head_id int(10) COMMENT '关联电子运单表头ID',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  ehs_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  ent_order_no varchar(30) COMMENT '企业电子订单号',
  bill_no varchar(30) COMMENT '提运单号',
  out_date timestamp NULL DEFAULT NULL COMMENT '出仓/进境日期',
  discharge_place varchar(50) COMMENT '货物存放地',
  ehs_batch_no varchar(60) COMMENT '物流批次号',
  create_date timestamp NULL DEFAULT NULL COMMENT '运单创建日期',
  route_status varchar(600) COMMENT '路由状态',
  waybill_status varchar(1) COMMENT '电子运单状态',
  fee_rate decimal(19,5) COMMENT '运费/率',
  fee_curr_code varchar(3) COMMENT '运费币制',
  fee_mark varchar(1) COMMENT '运费标志（1代表率；2代表单价；3代表总价）',
  insur_rate decimal(19,5) COMMENT '保费/率',
  other_rate decimal(19,5) COMMENT '杂费/率',
  total_amount decimal(19,5) COMMENT '运送货物总价',
  pack_no decimal(19) COMMENT '件数',
  net_wt decimal(18,4) COMMENT '净重',
  gross_wt decimal(19,5) COMMENT '毛重',
  goods_detail varchar(200) COMMENT '商品信息',
  recipient_name varchar(100) COMMENT '收货人名称',
  recipient_addr varchar(200) COMMENT '收货人地址',
  recipient_tel varchar(50) COMMENT '收货人电话',
  recipient_country varchar(3) COMMENT '收货人所在国家代码',
  recipient_provinces_code varchar(6) COMMENT '收件人省市区代码',
  shipper_name varchar(100) COMMENT '发货人名称',
  shipper_datailed_address varchar(200) COMMENT '发货人地址',
  shipper_phone varchar(60) COMMENT '发货人电话',
  shipper_country_code varchar(3) COMMENT '发货人所在国家代码',
  shipper_provinces_code varchar(6) COMMENT '发货人省市区代码',
  notes varchar(1000) COMMENT '备注',
  
  
  cus_message_status_waybill varchar(10) DEFAULT '0' COMMENT '海关电子运单状态',
  cus_waybill_return_info varchar(1000) COMMENT '海关运单回执内容',
  
  ciq_message_status_waybill varchar(10) DEFAULT '0' COMMENT '国检电子运单状态',
  ciq_waybill_return_info varchar(1000) COMMENT '国检运单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `waybill_detail` ADD INDEX `IDX_WAYBILLHEADID`(`waybill_head_id`);
ALTER TABLE `waybill_detail` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `waybill_detail` ADD INDEX `IDX_DECLENTID_ENTWAYBILLNO`(`decl_ent_id`,`ent_waybill_no`);
ALTER TABLE `waybill_detail` ADD INDEX `IDX_EHSENTID_ENTWAYBILLNO`(`ehs_ent_id`,`ent_waybill_no`);

DROP table if  EXISTS payment_head;

-- 电子支付单申报头部信息
create table payment_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  payment_detail_ids varchar(255) COMMENT '关联支付单详情id集合',

  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `payment_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);

DROP table if  EXISTS payment_detail;

-- 电子支付单详情信息
create table payment_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  payment_head_id int(10) COMMENT '关联电子支付单表头ID',
  ent_pay_no varchar(50) COMMENT '支付交易编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  pay_status varchar(2) COMMENT '支付交易状态',
  pay_amount decimal(19,5) COMMENT '支付金额',
  pay_curr_code varchar(3) COMMENT '支付币制',
  pay_time timestamp NULL DEFAULT NULL COMMENT '付款时间',
  payer_name varchar(60) COMMENT '支付人姓名',
  payer_document_type varchar(2) COMMENT '支付人证件类型(01:身份证;02:护照;04:其他)',
  payer_document_number varchar(60) COMMENT '支付人证件号码',
  ent_order_no varchar(60) COMMENT '电子订单编号',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  notes varchar(1000) COMMENT '备注',

  cus_message_status_pay varchar(10) DEFAULT '0' COMMENT '海关电子支付单状态',
  cus_pay_return_info varchar(1000) COMMENT '海关支付单回执内容',
  
  ciq_message_status_pay varchar(10) DEFAULT '0' COMMENT '国检电子支付单状态',
  ciq_pay_return_info varchar(1000) COMMENT '国检支付单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `payment_detail` ADD INDEX `IDX_PAYMENTHEADID`(`payment_head_id`);
ALTER TABLE `payment_detail` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `payment_detail` ADD INDEX `IDX_DECLENTID_ENTPAYNO`(`decl_ent_id`,`ent_pay_no`);
ALTER TABLE `payment_detail` ADD INDEX `IDX_PAYENTID_ENTPAYNO`(`pay_ent_id`,`ent_pay_no`);


DROP table if  EXISTS elist_head;

-- 电子清单申报头部
create table elist_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  apply_sea_port varchar(4) COMMENT '申报口岸 关区代码',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  elist_type varchar(2) COMMENT '清单类型',
  total_count decimal(9) COMMENT '清单总票数',
  total_weight decimal(19,5) COMMENT '总重量',
  total_pack_num decimal(9) COMMENT '商品总件数',
  total_value decimal(19,5) COMMENT '总货值',
  curr_code varchar(3) COMMENT '货币代码',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  input_date timestamp NULL DEFAULT NULL COMMENT '录入日期',
  input_staff_id int(10) COMMENT '录入员ID',
  comp_access_id int(10) NOT NULL COMMENT '报关企业ID',
  customs_declarer_id int(10) COMMENT '报关员ID',
  
  check_documents varchar(1) COMMENT '核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))',
  
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',

  central_id int(10) COMMENT '关联集中申报表头ID',
  elist_detail_info_ids varchar(255) COMMENT '关联清单详情id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `elist_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);

DROP table if  EXISTS elist_detail_info;

-- 电子清单详情信息
create table elist_detail_info(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  elist_head_id int(10) COMMENT '关联电子清单申报表头ID',
  ent_elist_no varchar(20) COMMENT '清单编号(企业内部的清单编号)',
  
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  
  tax_no varchar(64) COMMENT '税务编号',
  status varchar(1) COMMENT '征税状态',
  customs_tax decimal(19,5) COMMENT '关税',
  value_added_tax decimal(19,5) COMMENT '增值税',
  consumption_tax decimal(19,5) COMMENT '消费税',
  
  ent_order_no varchar(60) COMMENT '企业电子订单编号',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  eport_elist_no varchar(18) COMMENT '跨境平台清单编号',
  pre_no varchar(18) COMMENT '预录入编号（电子口岸标识单证编号）',
  cus_elist_no varchar(18) COMMENT '海关清单编号',
  ciq_elist_no varchar(36) COMMENT '检验检疫清单编号',
  assure_id int(10) COMMENT '担保企业ID',
  ie_port varchar(4) COMMENT '进出口岸代码',
  sv_p_code varchar(4) COMMENT '监管场所代码',
  ie_date timestamp NULL DEFAULT NULL COMMENT '进出口日期',
  ems_no varchar(30) COMMENT '备案号/账册编号',
  area_id int(10) COMMENT '区内企业ID(保税业务)',
  license_no varchar(19) COMMENT '许可证号',
  trans_mode varchar(2) COMMENT '成交方式',
  use_to varchar(3) COMMENT '生成厂家/用途',
  bill_no varchar(37) COMMENT '提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）',
  pack_ent_name varchar(60) COMMENT '组货单位名称',
  wrap_type varchar(4) COMMENT '外包装种类代码',
  pack_quantity int(10) COMMENT '包裹件数',
  trans_type varchar(1) COMMENT '运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）',
  trans_code varchar(1) COMMENT '运输方式代码',
  trans_no varchar(100) COMMENT '运输工具编号',
  voyage_no varchar(32) COMMENT '航班航次号',
  destination_country varchar(3) COMMENT '起运国/运抵国',
  destination_port varchar(4) COMMENT '起运港/抵运港',
  edest_date timestamp NULL DEFAULT NULL COMMENT '拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）',
  route_country varchar(3) COMMENT '经停地区或国家代码',
  consignee_name varchar(60) COMMENT '消费者名称',
  consignee_id_num varchar(30) COMMENT '消费者证件号码',
  consignee_card_type varchar(1) COMMENT '消费者证件类型代码（1-身份证；2-其它）',
  consignee_country varchar(3) COMMENT '消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)',
  consignee_tel varchar(30) COMMENT '消费者联系电话号码',
  notes varchar(1000) COMMENT '备注',
  
  cus_message_status_list varchar(10) DEFAULT '0' COMMENT '海关电子清单状态',
  cus_list_return_info varchar(1000) COMMENT '海关清单回执内容',
  
  ciq_message_status_list varchar(10) DEFAULT '0' COMMENT '国检电子清单状态',
  ciq_list_return_info varchar(1000) COMMENT '国检清单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `elist_detail_info` ADD INDEX `IDX_ELISTHEADID`(`elist_head_id`);
ALTER TABLE `elist_detail_info` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `elist_detail_info` ADD INDEX `IDX_DECLENTID_ENTELISTNO`(`decl_ent_id`,`ent_elist_no`);
ALTER TABLE `elist_detail_info` ADD INDEX `IDX_EBENTID_ENTELISTNO`(`eb_ent_id`,`ent_elist_no`);


DROP table if  EXISTS elist_waybill;

-- 清单关联运单信息
create table elist_waybill(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  elist_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  ehs_ent_id int(10) COMMENT '所属物流企业ID',
  gross_weight decimal(19,5) COMMENT '毛重',
  net_wt decimal(19,5) COMMENT '净重',
  fee_rate decimal(19,5) COMMENT '运费',
  fee_mark varchar(1) COMMENT '运费标志（预留字段）（1代表率；2代表单价；3代表总价）',
  insur_rate decimal(19,5) COMMENT '保费',
  other_rate decimal(19,5) COMMENT '杂费',
  recipient_name_c varchar(100) COMMENT '收件人中文名称',
  recipient_name_e varchar(100) COMMENT '收件人英文名称',
  recipient_card_type varchar(2) COMMENT '收件人证件类型（01:身份证、02:护照、03:其他）',
  recipient_no varchar(30) COMMENT '收发件人证件号',
  recipient_country varchar(3) COMMENT '收件人国家代码',
  recipient_provinces_code varchar(6) COMMENT '收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）',
  recipient_addr_c varchar(200) COMMENT '收件人中文地址',
  recipient_addr_e varchar(500) COMMENT '收件人英文地址',
  recipient_tel varchar(60) COMMENT '收件人电话',
  shipper_c varchar(255) COMMENT '发件人中文名称(电商或电商物流服务商中文名)',
  shipper_e varchar(255) COMMENT '发件人英文名称(电商或电商物流服务商英文名)',
  shipper_country varchar(3) COMMENT '发件人国家代码(进口填发货国或地区代码；出口填中国（142）)',
  shipper_provinces_code varchar(100) COMMENT '发件人城市（进口填境外城市名；出口填境内发货城市名）',
  shipper_addr_c varchar(500) COMMENT '发件人中文地址',
  shipper_addr_e varchar(500) COMMENT '发件人英文名称',
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `elist_waybill` ADD INDEX `IDX_ELISTDETAILINFOID`(`elist_detail_info_id`);

DROP table if  EXISTS elist_pay;

-- 清单关联支付信息
create table elist_pay(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  elist_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  ent_pay_no varchar(50) COMMENT '支付交易编号',
  pay_ent_id int(10) COMMENT '所属支付企业ID',
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `elist_pay` ADD INDEX `IDX_ELISTDETAILINFOID`(`elist_detail_info_id`);

DROP table if  EXISTS elist_order;

-- 清单关联订单表体
create table elist_order(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  elist_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  ebp_ent_id  int(10) COMMENT '所属电商平台ID',
  ent_order_no varchar(60) COMMENT '企业电子订单编号',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `elist_order` ADD INDEX `IDX_ELISTDETAILINFOID`(`elist_detail_info_id`);

DROP table if  EXISTS goods_detail_info;

-- 清单关联订单货物信息
create table goods_detail_info(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  elist_order_id int(10) COMMENT '关联电子清单关联订单表体ID',
  seq decimal(3) COMMENT '商品序号,从1开始连续序号（一一对应关联电子订单）',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(30) COMMENT '海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）',
  ent_goods_no varchar(30) COMMENT '企业商品货号',
  goods_name varchar(200) COMMENT '企业商品品名',
  gname varchar(200) COMMENT '海关商品归类名称',
  goods_style varchar(100) COMMENT '商品规格型号',
  hs_code varchar(10) COMMENT 'HS编码',
  brand varchar(50) COMMENT '品牌',
  bar_code varchar(50) COMMENT '商品条形码',
  origin_country varchar(3) COMMENT '原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））',
  discharge_place varchar(200) COMMENT '货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）',
  goods_batch_no varchar(200) COMMENT '商品批次',
  license_no varchar(200) COMMENT '商品许可证号',
  appr_no varchar(200) COMMENT '商品批准文号',
  package_type varchar(8) COMMENT '包装类型',
  pack_num decimal(6) COMMENT '包装件数',
  qty decimal(19,5) COMMENT '数量',
  gunit varchar(3) COMMENT '成交计量单位',
  std_unit varchar(3) COMMENT '第一计量单位',
  std_qty decimal(19,5) COMMENT '第一计量数量',
  sec_unit varchar(3) COMMENT '第二计量单位',
  sec_qty decimal(19) COMMENT '第二计量单位数量',
  gross_weight decimal(19,5) COMMENT '重量',
  unit_price decimal(19,5) COMMENT '商品单价',
  total_price decimal(19,5) COMMENT '商品总价',
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `goods_detail_info` ADD INDEX `IDX_ELISTORDERID`(`elist_order_id`);

DROP table if  EXISTS centralization_head;

-- 集中申报 头部信息
create table centralization_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  eb_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  ebp_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  ehs_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  comp_access_id int(10) NOT NULL COMMENT '报关企业ID',
  
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  proposer_type varchar(1) COMMENT '经营者类型(1 - 企业； 2 - 个人；默认为1；)',
  proposer_id varchar(18) COMMENT '经营者身份标识号(默认为电商企业的单一窗口备案社会信用代码)',
  proposer_name varchar(100) COMMENT '经营者名称(默认为电商企业名称)',
  
  apply_sea_port varchar(4) COMMENT '申报口岸 关区代码',
  elist_type varchar(2) COMMENT '清单类型',
  curr_code varchar(3) COMMENT '货币代码',
  input_staff_id int(10) COMMENT '录入员ID',
  customs_declarer_id int(10) COMMENT '报关员ID',
  check_documents varchar(1) COMMENT '核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))',
  
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  decl_head_ids varchar(255) COMMENT '关联四单申报头部id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `centralization_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);


DROP table if  EXISTS logistics_head;

-- 进口 进区总运单
create table logistics_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  ehs_ent_id int(10) COMMENT '所属物流企业ID',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  ent_loading_no varchar(30) COMMENT '总运单号(BC业务填写转关单号；BBC业务企业自编号)',
  bill_type varchar(4) COMMENT '总运单类型（1：转关单，2: 舱单）',
  ie_flag varchar(1) COMMENT '进出口标志（I-进口；E-出口）',
  ie_port varchar(4) COMMENT '进出口岸代码',
  destination_port varchar(4) COMMENT '指运港/抵运港代码',
  pack_no decimal(19,5) COMMENT '总件数(运单数据累加)',
  gross_weight decimal(19,5) COMMENT '毛重/总重',
  ie_date timestamp NULL DEFAULT NULL COMMENT '进出口日期',
  app_type varchar(20) COMMENT '业务类型',
  traf_mode varchar(1) COMMENT '运输方式',
  tran_no varchar(32) COMMENT '运输工具，车牌号',
  
  app_uid varchar(20) COMMENT 'IC卡号，预留字段',
  car_ec_no varchar(8) COMMENT '电子车牌，预留字段',
  ship_custom_no varchar(32) COMMENT '运输工具备案号，预留字段',
  vayage_no varchar(32) COMMENT '车次/航次',
  bill_no varchar(37) COMMENT '提运单号',
  loc_code varchar(6) COMMENT '监管点（四位海关代码+两位序号）',
  unload_location varchar(100) COMMENT '卸货库位',
  load_date timestamp NULL DEFAULT NULL COMMENT '装载时间',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报日期',
  input_date timestamp NULL DEFAULT NULL COMMENT '录入日期',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-取消)',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  
  cus_message_status_logistics varchar(10) DEFAULT '0' COMMENT '海关入区总运单状态',
  cus_logistics_return_info varchar(1000) COMMENT '海关入区总运单回执内容',
  
  ciq_message_status_logistics varchar(10) DEFAULT '0' COMMENT '国检入区总运单状态',
  ciq_logistics_return_info varchar(1000) COMMENT '国检入区总运单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `logistics_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);
ALTER TABLE `logistics_head` ADD INDEX `IDX_DECLENTID_ENTLOADINGNO`(`decl_ent_id`,`ent_loading_no`);
ALTER TABLE `logistics_head` ADD INDEX `IDX_EHSENTID_ENTLOADINGNO`(`ehs_ent_id`,`ent_loading_no`);


DROP table if  EXISTS logistics_content;

-- 进口 进区总运单明细
create table logistics_content(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  logistics_head_id int(10) COMMENT '关联总运单申报表头ID',
  
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  cus_elist_no varchar(50) COMMENT '海关电子清单编号',
  ciq_inbound_no varchar(36) COMMENT '检验检疫入仓编号',
  tray_no varchar(30) COMMENT '托盘/托架/主箱编号',
  gross_wt decimal(19,5) COMMENT '毛重',
  qty decimal(19,5) COMMENT '申报数量（单个运单下件数）',
  notes varchar(1000) COMMENT '备注',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `logistics_content` ADD INDEX `IDX_LOGISTICSHEADID`(`logistics_head_id`);

DROP table if  EXISTS load_head;

-- 货物装载清单头信息
create table load_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  ehs_id int(10) NOT NULL COMMENT '物流企业id',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  top_log_no varchar(30) COMMENT '总运单号',
  ie_flag varchar(1) COMMENT '进出口标志',
  ie_port varchar(4) COMMENT '进出口岸代码',
  destination_port varchar(4) COMMENT '指运港/抵运港',
  pack_no decimal(19,5) COMMENT '总件数',
  ie_date timestamp NULL DEFAULT NULL COMMENT '进出日期',
  traf_mode varchar(1) COMMENT '运输方式',
  tran_no varchar(30) COMMENT '运输工具，车牌号',
  app_uid varchar(20) COMMENT 'IC卡号',
  car_ec_no varchar(8) COMMENT '电子车牌',
  ship_customs_no varchar(32) COMMENT '运输工具备案号',
  voyage_no varchar(32) COMMENT '车次/航次',
  bill_no varchar(37) COMMENT '提运单号',
  load_date timestamp NULL DEFAULT NULL COMMENT '装载日期',
  total_weight decimal(19,5) COMMENT '毛重/总重',
  ent_loading_no varchar(30) COMMENT '企业装载货物自编号',
  eport_loading_no varchar(60) COMMENT '公共平台装载清单受理号',
  ciq_load_no varchar(36) COMMENT '检验检疫装载清单编号',
  cus_load_no varchar(50) COMMENT '海关装载清单编号',
  decl_time timestamp NULL DEFAULT NULL COMMENT '申报日期',
  input_date timestamp NULL DEFAULT NULL COMMENT '录入日期',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-取消)',
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  
  cus_message_status_load varchar(10) DEFAULT '0' COMMENT '海关BBC货物装载清单状态',
  cus_load_return_info varchar(1000) COMMENT '海关BBC货物装载清单回执内容',
  
  ciq_message_status_load varchar(10) DEFAULT '0' COMMENT '国检BBC货物装载清单状态',
  ciq_load_return_info varchar(1000) COMMENT '国检BBC货物装载清单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `load_head` ADD INDEX `IDX_CREATE_AT`(`create_at`);

DROP table if  EXISTS load_content;

-- 货物装载清单业务明细信息
create table load_content(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  load_head_id int(10) COMMENT '关联货物装载清单申报头id',
  
  seq decimal(3) COMMENT '流水号',
  ciq_elist_no varchar(30) COMMENT '检验检疫电子清单编号',
  cus_elist_no varchar(30) COMMENT '海关电子清单编号',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  gross_wt decimal(19,5) COMMENT '毛重',
  qty decimal(19, 5) COMMENT '申报数量',
  notes varchar(1000) COMMENT '申报数量',
  
  cus_message_status_confirm varchar(10) DEFAULT '0' COMMENT '海关BBC货物出区确认状态',
  cus_confirm_return_info varchar(1000) COMMENT '海关BBC货物装载清单回执内容',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `load_content` ADD INDEX `IDX_LOAD_HEAD_ID`(`load_head_id`);

DROP table if  EXISTS send_message;

-- 发送报文
create table send_message(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
--  head_id int(10) COMMENT '申报头部ID',
  detail_id int(10) COMMENT '申报信息详情ID',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  message_id varchar(60) COMMENT '报文编号',
  message_type varchar(15) COMMENT '报文类型',
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  sender varchar(30) COMMENT '报文发送者标识',
  receiver varchar(30) COMMENT '报文接收人标识',
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  send_time timestamp NULL DEFAULT NULL COMMENT '报文发送时间',
  
  decl_mode varchar(32) COMMENT '报送方式',
  status varchar(1) COMMENT '状态（0-未发送；1-待发送；2-发送成功；3-发送失败）',
  description varchar(255) COMMENT '报文发送结果描述',
  function_code varchar(10) COMMENT '业务类型(CIQ/CUS/BOTH)',
  version varchar(10) COMMENT '版本号（默认3.0）',
  
  message_detail text COMMENT '报文详情',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `send_message` ADD INDEX `IDX_CREATE_AT`(`create_at`);

DROP table if  EXISTS receive_message;

-- 接收报文
create table receive_message(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  business_no varchar(60) COMMENT '业务编号（企业内部唯一编号）',
  message_id varchar(60) COMMENT '回执报文编号',
  message_type varchar(15) COMMENT '报文类型',
  org_message_type varchar(30) COMMENT '旧（申报）报文类型',
--  org_message_id varchar(60) COMMENT '旧（申报）报文编号',
  
  ie_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  sender varchar(30) COMMENT '报文发送者标识',
  receiver varchar(30) COMMENT '报文接收人标识',
  
  receive_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '接收时间',
  deal_time  timestamp NULL DEFAULT NULL COMMENT '处理时间',
  response_by varchar(2) COMMENT '回执返回方（01-平台，02-海关，03-国检）',
  return_status varchar(10) COMMENT '回执状态编码',
  return_info varchar(1000) COMMENT '回执接收信息',
  
  
  message_detail text COMMENT '报文详情',
  
  result varchar(1) COMMENT '标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)',
  description varchar(255) COMMENT '回执处理结果描述',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `receive_message` ADD INDEX `IDX_RECEIVE_TIME`(`receive_time`);
