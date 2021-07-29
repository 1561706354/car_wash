package com.car_wash.Interface;

import com.car_wash.pojo.RecordTable;
import com.car_wash.pojo.SiteTable;
import com.car_wash.pojo.UserTable;

import java.util.List;

public interface User {
    //注册
    int register(UserTable userTable);
    //登录
    UserTable login(UserTable userTable);
    //查看所有洗车点
    List<SiteTable> select_merchant();
    //扫码洗车
    int car_wash(RecordTable recordTable);
    //查询我的信息
    UserTable personal_information(UserTable userTable);
    //更改信息
    int update_personal_information();
    //购买洗车券
    int buy_discounts(UserTable userTable);
    //我的消费明细
    List<RecordTable> selectRecord_byExample(RecordTable recordTable);
    //我的消费明细模糊查询
    List<RecordTable> selectRecord_byExampleSelective(RecordTable recordTable);
}
