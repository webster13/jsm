/*
 Navicat Premium Data Transfer

 Source Server         : mac
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost
 Source Database       : jsm

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : utf-8

 Date: 03/14/2016 22:38:25 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `shiro_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_dictionary`;
CREATE TABLE `shiro_dictionary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_dictionary_all` (`name`,`parent_ids`,`parent_id`,`sequence`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_element`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_element`;
CREATE TABLE `shiro_element` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `menu_id` int(10) unsigned NOT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `is_show` tinyint(1) DEFAULT '1',
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_element_menu_id` (`menu_id`,`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_file`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_file`;
CREATE TABLE `shiro_file` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) NOT NULL,
  `file_path` varchar(255) DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_file_name` (`file_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文件';

-- ----------------------------
--  Table structure for `shiro_group`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_group`;
CREATE TABLE `shiro_group` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_group_all` (`name`,`parent_id`,`parent_ids`,`sequence`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_menu`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_menu`;
CREATE TABLE `shiro_menu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `url` varchar(2083) DEFAULT NULL,
  `is_show` tinyint(1) NOT NULL DEFAULT '1',
  `icon` varchar(100) DEFAULT NULL,
  `show_in` varchar(30) DEFAULT NULL COMMENT 'target ＝（mainFrame、 _blank、_self、_parent、_top）',
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_menu_tree` (`parent_id`,`parent_ids`,`sequence`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_operate`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_operate`;
CREATE TABLE `shiro_operate` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `permission_sign` varchar(30) DEFAULT NULL COMMENT '有这个标识的表示有此权限做此操作',
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shiro_operate_tree` (`parent_id`,`parent_ids`,`sequence`),
  KEY `shiro_operate_name` (`permission_sign`,`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_org`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_org`;
CREATE TABLE `shiro_org` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  KEY `shiro_org_tree` (`parent_id`,`parent_ids`,`sequence`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_org_role`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_org_role`;
CREATE TABLE `shiro_org_role` (
  `org_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  KEY `org_id` (`org_id`),
  KEY `role_id` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_permission_action`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_permission_action`;
CREATE TABLE `shiro_permission_action` (
  `permission_id` int(10) unsigned NOT NULL,
  `action_id` int(10) unsigned NOT NULL,
  KEY `action_id` (`action_id`),
  KEY `permission_id` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_user`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_user`;
CREATE TABLE `shiro_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  `salt` varchar(60) DEFAULT NULL,
  `real_name` varchar(24) DEFAULT NULL,
  `deposit` decimal(10,0) DEFAULT NULL,
  `org_id` int(10) unsigned NOT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `org_id` (`org_id`),
  KEY `shiro_user_name` (`username`,`real_name`,`org_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `shiro_user`
-- ----------------------------
BEGIN;
INSERT INTO `shiro_user` VALUES ('1', 'linda', '081b91c33adbee8ae3c49ba88de85b79', '04eff8bc69b505759dc763fbac17eda6', null, null, '1', '1', '2016-03-14 19:57:06', '1', '2016-03-14 19:57:18', null);
COMMIT;

-- ----------------------------
--  Table structure for `shiro_user_group`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_user_group`;
CREATE TABLE `shiro_user_group` (
  `user_id` int(10) unsigned NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `user_id` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shiro_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_user_role`;
CREATE TABLE `shiro_user_role` (
  `user_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  KEY `user_id` (`user_id`),
  KEY `role_id` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_permission`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_permission`;
CREATE TABLE `shrio_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `permission_type` enum('module','menu','element','file') DEFAULT NULL COMMENT 'menu=菜单,\nmodule=模块,\nfile=文件,\nelement=页面元素',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shrio_permission_type` (`permission_type`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_permission_element`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_permission_element`;
CREATE TABLE `shrio_permission_element` (
  `permission_id` int(10) unsigned NOT NULL,
  `element_id` int(10) unsigned NOT NULL,
  KEY `element_id` (`element_id`),
  KEY `permission_id` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_permission_file`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_permission_file`;
CREATE TABLE `shrio_permission_file` (
  `permission_id` int(10) unsigned NOT NULL,
  `file_id` int(10) unsigned NOT NULL,
  KEY `file_id` (`file_id`),
  KEY `permission_id` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_permission_menu`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_permission_menu`;
CREATE TABLE `shrio_permission_menu` (
  `permission_id` int(10) unsigned NOT NULL,
  `menu_id` int(10) unsigned NOT NULL,
  KEY `menu_id` (`menu_id`),
  KEY `permission_id` (`permission_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_role`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_role`;
CREATE TABLE `shrio_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '最多100个字节＝33个汉字',
  `description` varchar(255) DEFAULT NULL COMMENT '最多255个字节',
  `parent_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父级id',
  `parent_ids` varchar(100) NOT NULL COMMENT '所有父id，起始为 [ 0, ] ，以［  , ］作为分隔符',
  `sequence` int(10) unsigned DEFAULT NULL,
  `create_by` int(10) unsigned NOT NULL COMMENT '创建者id',
  `create_at` datetime NOT NULL COMMENT '创建时间',
  `update_by` int(10) unsigned NOT NULL COMMENT '更新者id',
  `update_at` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT NULL COMMENT '被删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `shrio_role_tree` (`parent_id`,`parent_ids`,`sequence`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_role_group`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_role_group`;
CREATE TABLE `shrio_role_group` (
  `role_id` int(10) unsigned NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  KEY `group_id` (`group_id`),
  KEY `role_id` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `shrio_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `shrio_role_permission`;
CREATE TABLE `shrio_role_permission` (
  `role_id` int(10) unsigned NOT NULL,
  `permission_id` int(10) unsigned NOT NULL,
  KEY `permission_id` (`permission_id`),
  KEY `role_id` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
