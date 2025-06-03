drop database if exists xiaohashu ;

create database xiaohashu;
       use xiaohashu;

CREATE TABLE `t_user` (
`id` BIGINT (20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
`username` VARCHAR (32) NOT NULL COMMENT '用户名',
`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB COMMENT = '用户测试表';
