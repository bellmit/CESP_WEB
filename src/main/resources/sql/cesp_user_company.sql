DROP table if  EXISTS company;

-- 与广州国际贸易单一窗口对接的企业
create table company(
    id int(10) AUTO_INCREMENT COMMENT 'pk',
    gzeport_code varchar(18) COMMENT '电子口岸备案号（企业单一窗口企业注册编号）',
    name varchar(100) COMMENT '企业海关备案名称',
    edi_code varchar(18) COMMENT 'EDI账号（sender）',
    dxp_id varchar(18) COMMENT '数据交换（传输）编号',
    
    cus_code varchar(18) COMMENT '海关备案号',
    ciq_code varchar(10) COMMENT '检验检疫备案号',
    
    internet_domain_name varchar(100) COMMENT '企业网址',

    contact varchar(30) COMMENT '联系人',
    telephone varchar(50) COMMENT '联系电话',
    address varchar(255) COMMENT '联系地址',
    email varchar(255) COMMENT '联系人邮箱',
    note varchar(255) COMMENT '备注',
    

    create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
    
    PRIMARY KEY (id),
    unique(gzeport_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table http_account(
	id int(10) AUTO_INCREMENT COMMENT 'pk',
	company_id int(10) NOT NULL COMMENT '所属企业id',
	http_url varchar(255) COMMENT 'http接口地址',
	http_api_key varchar(18) COMMENT '接口调用秘钥',
	certificate_code varchar(18) COMMENT '企业证书编号',
	http_key_path varchar(255) COMMENT 'http接口调用证书路径',
	
	create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
	
	PRIMARY KEY (id),
	unique(company_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table ftp_account(
	id int(10) AUTO_INCREMENT COMMENT 'pk',
	company_id int(10) NOT NULL COMMENT '所属企业id',
	ftp_url varchar(255) COMMENT 'ftp服务器ip地址',
	ftp_port int(10) COMMENT 'ftp服务端口号',
	ftp_user varchar(32) COMMENT 'ftp账户',
	ftp_password varchar(64) COMMENT 'ftp账户密码',
	
	create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
    
    PRIMARY KEY (id),
	unique(company_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--create table mq_account(
--
--)


DROP table if  EXISTS qualification;

-- 企业角色(类型)
create table qualification(
  id int(10) AUTO_INCREMENT COMMENT 'pk',
  name varchar(32) COMMENT '企业角色（类型）名称',
  `type` varchar(8) COMMENT '企业类型代码',
  `spec` varchar(1000) COMMENT '角色描述',
  
  PRIMARY KEY (id),
  unique(name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS company_qualification;

-- 企业与企业角色中间表
create table company_qualification(
  cid int(10) NOT NULL COMMENT '企业ID',
  qid int(10) NOT NULL COMMENT '企业角色（类型）ID'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS module;

-- 系统模块表
create table module(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  p_id int(10) COMMENT '父节点（菜单）id',
  en_code varchar(64) COMMENT '英文名称',
  name varchar(255) COMMENT '权限（资源）名称',
  icon varchar(255) COMMENT '小图标属性',
  target varchar(64) COMMENT '节点属性',
  is_menu tinyint(1) COMMENT '菜单or功能',
  is_public tinyint(1) COMMENT '是否是公共权限（资源）',
  sort_code tinyint(3) COMMENT '排序',
  url varchar(255) COMMENT 'url链接地址',
  enable_mark tinyint(1) COMMENT '是否可用（0-禁用，1-可用）',
  function_code varchar(10) COMMENT '业务逻辑标识（I-进口，O-出口，IO-进出口）',
  
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS qualification_module;

-- 企业角色与系统模块对应中间表
create table qualification_module(
  qid int(10) NOT NULL COMMENT '企业角色（类型）ID',
  mid int(10) NOT NULL COMMENT '系统模块ID'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS permission;

-- 用户操作权限表
create table permission(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  p_id int(10) COMMENT '父节点（菜单）id',
  name varchar(255) COMMENT '权限（资源）名称',
  is_menu tinyint(1) COMMENT '菜单or功能',
  is_public tinyint(1) COMMENT '是否是公共权限（资源）',
  sort_code tinyint(3) COMMENT '排序',
  url varchar(255) COMMENT 'url链接地址',
  enable_mark tinyint(1) COMMENT '是否可用（0-禁用，1-可用）',
  
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS role;

-- 角色表
CREATE TABLE `role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `type` varchar(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP table if  EXISTS role_permission;

-- 角色-权限对应表
CREATE TABLE `role_permission` (
  `rid` int(10) DEFAULT NULL COMMENT '角色ID',
  `pid` int(10) DEFAULT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS user;

-- 用户表
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `name` varchar(64) NOT NULL COMMENT '登录账号（名称）',
  `email` varchar(128) DEFAULT NULL COMMENT '用户邮箱',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `company_id` int(10) COMMENT '账户所属企业',
  `last_login_time` timestamp  COMMENT '最后登录时间',
  `status` tinyint(2) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  
    create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

DROP table if  EXISTS user_role;

-- 用户-角色映射表
CREATE TABLE `user_role` (
  `uid` int(10) DEFAULT NULL COMMENT '用户ID',
  `rid` int(10) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS system_config;

-- 系统配置
CREATE TABLE `system_config` (
  `k` varchar(20) NOT NULL COMMENT '键',
  `v` varchar(512) DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`k`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 报关员表
create table customs_declarer(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  customs_declarer varchar(30) COMMENT '报关员',
  comp_access_id int(10) NOT NULL COMMENT '所属报关企业ID',
  declaration_comp_addr varchar(200) COMMENT '报关员单位地址',
  declarer_post_code varchar(30) COMMENT '报关员邮编',
  customs_declarer_tel varchar(60) COMMENT '报关员电话',
  notes varchar(1000) COMMENT '备注',

  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

