-- DicParameterDTO  参数表
CREATE TABLE `dic_parameter` (
  `owner` varchar(255) NOT NULL DEFAULT '',
  `PARA_SESSION` varchar(255) NOT NULL DEFAULT '',
  `PARA_NAME` varchar(255) NOT NULL DEFAULT '',
  `para_value` varchar(255) DEFAULT NULL,
  `para_note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`owner`,`PARA_SESSION`,`PARA_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 海关关区代码
create table  base_customs_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '海关代码',
	name varchar(255) COMMENT '海关关区',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 计量单位代码
create table base_unit_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '计量单位代码',
	name varchar(255) COMMENT '计量单位',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 国家代码
create table base_country_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '国家（地区）代码',
	iso_code varchar(255) COMMENT '国际（地区）代码',
	name varchar(255) COMMENT '国家（地区）',
	en_name varchar(255) COMMENT '国家（地区）英文',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 行政区域代码
create table base_province_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '省市代码',
	name varchar(255) COMMENT '省市',
	parent_code varchar(255) COMMENT '父节点代码',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 币制代码
create table base_currency_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '货币代码',
	iso_code varchar(255) COMMENT '货币国际代码',
	name varchar(255) COMMENT '货币',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 包装类型代码
create table base_package_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '包装形式代码',
	name varchar(255) COMMENT '包装形式',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 运输方式代码
create table base_transport_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '运输方式代码',
	name varchar(255) COMMENT '运输方式',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 贸易类型代码
create table base_trade_mode(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '贸易类型代码',
	name varchar(255) COMMENT '名称',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 备案商品表代码
create table base_commodity_record(
	id int(10) primary key auto_increment COMMENT 'pk',
	customs_code varchar(10) COMMENT '海关关区编码',
	name varchar(255) COMMENT '商品名称',
	en_name varchar(255) COMMENT '商品英文名称',
	model varchar(255) COMMENT '规格型号',
	customs_record_no varchar(255) COMMENT '商品海关备案号',
	hs_code varchar(255) COMMENT 'hs编码',
	gross_weight decimal(19,5) COMMENT '毛重',
	net_weight decimal(19,5) COMMENT '净重',
	unit varchar(255) COMMENT '计量单位',
	unit_desc varchar(255) COMMENT '计量单位描述',
	price decimal(19,5) COMMENT '单价',
	bar_code_international varchar(255) COMMENT '条形码',
	post_tariff_code varchar(255) COMMENT '行邮税号',
	country_code varchar(4) COMMENT '原产国代码',
	note varchar(255) COMMENT '备注'
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 用途代码表
create table base_use_info(
    id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '用途代码',
	name varchar(255) COMMENT '用户名称',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 国检机构代码
create table base_ciq_org_info(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '国检机构代码',
	name varchar(255) COMMENT '国检机构名称',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 港口代码
create table base_port_info(
    id int(10) primary key auto_increment COMMENT 'pk',
    code varchar(255) COMMENT '港口代码',
    country_code  varchar(8) COMMENT '国别代码',
    c_name varchar(255) COMMENT '港口中文名称',
    e_name varchar(255) COMMENT '港口英文名称',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 成交方式
create table base_transaction_mode(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '成交方式代码',
	name varchar(255) COMMENT '成交方式说明',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 减征免税方式
create table base_tax_exemption_method(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '减征免税方式代码',
	name varchar(255) COMMENT '减征免税方式说明',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 监管场所
create table base_regulatory_place(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '监管场所代码',
	name varchar(255) COMMENT '监管场所名称',
	owner_name varchar(255) COMMENT '所属海关关区',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 监管点
create table base_regulatory_location(
	id int(10) primary key auto_increment COMMENT 'pk',
	code varchar(255) COMMENT '监管点代码',
	name varchar(255) COMMENT '监管点名称',
	note varchar(255) COMMENT '备注'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
