package com.car_wash.mapper;

import com.car_wash.pojo.SiteTable;
import com.car_wash.pojo.SiteTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteTableMapper {
    int countByExample(SiteTableExample example);

    int deleteByExample(SiteTableExample example);

    int deleteByPrimaryKey(String name);

    int insert(SiteTable record);

    int insertSelective(SiteTable record);

    List<SiteTable> selectByExample(SiteTableExample example);

    SiteTable selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SiteTable record, @Param("example") SiteTableExample example);

    int updateByExample(@Param("record") SiteTable record, @Param("example") SiteTableExample example);

    int updateByPrimaryKeySelective(SiteTable record);

    int updateByPrimaryKey(SiteTable record);
}