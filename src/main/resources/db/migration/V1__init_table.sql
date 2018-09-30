CREATE TABLE `product` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '名前',
  `effective_period_start` date NOT NULL DEFAULT '1970-01-01',
  `effective_period_end` date DEFAULT NULL,
  `division` int(10) unsigned NOT NULL DEFAULT '1' COMMENT '1:固体;2:流体',
  `supplier_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `stock` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '商品ID',
  `warehouse_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '倉庫ID',
  `stock_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '在庫数',
  `avaliable_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '有効数',
  `allocated_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '引当済数',
  `unallocated_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '未引当数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_summary` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `request_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cancel_flag` tinyint(1) NOT NULL DEFAULT '0',
  `user_id` int(10) unsigned NOT NULL DEFAULT '0',
  `zip` varchar(10) NOT NULL DEFAULT '0000-00-00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_detail` (
  `order_id` bigint(20) unsigned NOT NULL DEFAULT '0',
  `detail_no` tinyint(4) NOT NULL DEFAULT '1',
  `product_id` bigint(20) unsigned NOT NULL,
  `warehouse_id` int(10) unsigned DEFAULT NULL,
  `specify_warehouse_id` int(10) unsigned DEFAULT NULL,
  `demand_count` int(10) unsigned NOT NULL DEFAULT '0',
  `allocated_count` int(10) unsigned NOT NULL DEFAULT '0',
  `unallocated_count` int(10) unsigned NOT NULL DEFAULT '0',
  `shipment_order_count` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`order_id`,`detail_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `warehouse` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '',
  `delete_flag` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
