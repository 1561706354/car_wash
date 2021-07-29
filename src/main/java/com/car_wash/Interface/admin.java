package com.car_wash.Interface;

import com.car_wash.pojo.*;

import java.util.List;

public interface admin {
    //登录
    AdminTable login(String userName,String pwd);
    //修改管理员密码
    int update_password(AdminTable adminTable);
    //添加商户
     int insert_merchant(SiteTable siteTable);
    //查询所有商家信息
     List<SiteTable> select_merchant();
    //模糊查询商家
     List<SiteTable> selectSelective_merchant(SiteTable siteTable);
    //修改商户信息
    int update_merchant(SiteTable siteTable);
    //查看所有会员信息
     List<UserTable> select_merchant_user();
    //查看所有洗车券
    List<CouponsTable> select_merchant_discounts();
    //查看所有订单
     List<RecordTable> select_merchant_order();
    //查询报表
   List<RecordTable> select_merchant_report();
    //查询所有设备
   List<EquipmentTable> select_equipment();
    //模糊查询设备
    List<EquipmentTable> select_equipment_selective();
    //添加设备信息
     int insert_equipment(EquipmentTable equipmentTable);



}
