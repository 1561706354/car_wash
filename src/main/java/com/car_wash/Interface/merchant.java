package com.car_wash.Interface;

import com.car_wash.pojo.CouponsTable;
import com.car_wash.pojo.RecordTable;
import com.car_wash.pojo.SiteTable;
import com.car_wash.pojo.UserTable;

import java.util.List;

public interface merchant {
    //登录
    SiteTable login();
    //查看所有会员信息
    List<UserTable> select_userAll(SiteTable siteTable);
    //查询用户详情
    UserTable select_user(UserTable userTable);
    //更改用户信息
    int update_user(UserTable userTable);
    //查询会员账户充值消费记录
    List<RecordTable> select_userRecord(UserTable userTable);
    //添加洗车劵
    int insert_discounts(CouponsTable couponsTable);
    //更改洗车券类型
    int update_discounts(CouponsTable couponsTable);
    //洗车劵购买记录
    List<RecordTable> select_discountsRecord();
    //查看所有订单
    List<RecordTable> select_recordAll();
    //退款
    int refund(RecordTable recordTable);

}
