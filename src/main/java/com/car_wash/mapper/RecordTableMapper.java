package com.car_wash.mapper;

import com.car_wash.pojo.RecordTable;
import com.car_wash.pojo.RecordTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordTableMapper {
    int countByExample(RecordTableExample example);

    int deleteByExample(RecordTableExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(RecordTable record);

    int insertSelective(RecordTable record);

    List<RecordTable> selectByExample(RecordTableExample example);

    RecordTable selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") RecordTable record, @Param("example") RecordTableExample example);

    int updateByExample(@Param("record") RecordTable record, @Param("example") RecordTableExample example);

    int updateByPrimaryKeySelective(RecordTable record);

    int updateByPrimaryKey(RecordTable record);
}