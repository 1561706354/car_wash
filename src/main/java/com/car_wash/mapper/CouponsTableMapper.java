package com.car_wash.mapper;

import com.car_wash.pojo.CouponsTable;
import com.car_wash.pojo.CouponsTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponsTableMapper {
    int countByExample(CouponsTableExample example);

    int deleteByExample(CouponsTableExample example);

    int deleteByPrimaryKey(Integer couponsId);

    int insert(CouponsTable record);

    int insertSelective(CouponsTable record);

    List<CouponsTable> selectByExample(CouponsTableExample example);

    CouponsTable selectByPrimaryKey(Integer couponsId);

    int updateByExampleSelective(@Param("record") CouponsTable record, @Param("example") CouponsTableExample example);

    int updateByExample(@Param("record") CouponsTable record, @Param("example") CouponsTableExample example);

    int updateByPrimaryKeySelective(CouponsTable record);

    int updateByPrimaryKey(CouponsTable record);
}