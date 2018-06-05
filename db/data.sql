



CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Data for the table `t_sys_permission` */

insert  into `t_sys_permission`(`id`,`name`,`description`,`url`,`pid`) values (1,'121212','home页面的一个标签','/',NULL),(2,'1212121','ABel','/admin',NULL);

/*Data for the table `t_sys_permission_role` */

insert  into `t_sys_permission_role`(`id`,`role_id`,`permission_id`) values (1,1,1),(2,1,2),(3,2,1);

/*Data for the table `t_sys_role` */

insert  into `t_sys_role`(`id`,`name`,`desc`) values (1,'ROLE_ADMIN',' '),(2,'ROLE_USER','test');

/*Data for the table `t_sys_user` */

insert  into `t_sys_user`(`id`,`username`,`password`) values (1,'zz','a69568113923428bffcf6073a7b88892'),(2,'bb','a69568113923428bffcf6073a7b88892');

/*Data for the table `t_sys_user_role` */

insert  into `t_sys_user_role`(`id`,`user_id`,`role_id`) values (1,1,2),(2,2,2),(3,2,1);

