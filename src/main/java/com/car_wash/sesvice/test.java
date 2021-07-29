package com.car_wash.sesvice;

import com.car_wash.mapper.AdminTableMapper;
import com.car_wash.pojo.AdminTable;
import com.car_wash.pojo.AdminTableExample;

import java.util.List;

public class test implements AdminTableMapper {

    @Override
    public int countByExample(AdminTableExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AdminTableExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String adminId) {
        return 0;
    }

    @Override
    public int insert(AdminTable record) {
        return 0;
    }

    @Override
    public int insertSelective(AdminTable record) {
        return 0;
    }

    @Override
    public List<AdminTable> selectByExample(AdminTableExample example) {
        return null;
    }

    @Override
    public AdminTable selectByPrimaryKey(String adminId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(AdminTable record, AdminTableExample example) {
        return 0;
    }

    @Override
    public int updateByExample(AdminTable record, AdminTableExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(AdminTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AdminTable record) {
        return 0;
    }
}
