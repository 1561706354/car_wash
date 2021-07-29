package com.car_wash.mapper;

import com.car_wash.pojo.FileTable;
import com.car_wash.pojo.FileTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileTableMapper {
    int countByExample(FileTableExample example);

    int deleteByExample(FileTableExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(FileTable record);

    int insertSelective(FileTable record);

    List<FileTable> selectByExample(FileTableExample example);

    FileTable selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") FileTable record, @Param("example") FileTableExample example);

    int updateByExample(@Param("record") FileTable record, @Param("example") FileTableExample example);

    int updateByPrimaryKeySelective(FileTable record);

    int updateByPrimaryKey(FileTable record);
}