package com.car_wash.mapper;

import com.car_wash.pojo.AdminTable;
import com.car_wash.pojo.AdminTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminTableMapper {
    int countByExample(AdminTableExample example);

    int deleteByExample(AdminTableExample example);

    int deleteByPrimaryKey(String adminId);

    int insert(AdminTable record);

    int insertSelective(AdminTable record);

    List<AdminTable> selectByExample(AdminTableExample example);

    AdminTable selectByPrimaryKey(String adminId);

    int updateByExampleSelective(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    int updateByExample(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    int updateByPrimaryKeySelective(AdminTable record);

    int updateByPrimaryKey(AdminTable record);
}