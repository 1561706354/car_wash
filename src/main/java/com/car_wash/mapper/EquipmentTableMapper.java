package com.car_wash.mapper;

import com.car_wash.pojo.EquipmentTable;
import com.car_wash.pojo.EquipmentTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentTableMapper {
    int countByExample(EquipmentTableExample example);

    int deleteByExample(EquipmentTableExample example);

    int deleteByPrimaryKey(String equipmentNumber);

    int insert(EquipmentTable record);

    int insertSelective(EquipmentTable record);

    List<EquipmentTable> selectByExample(EquipmentTableExample example);

    EquipmentTable selectByPrimaryKey(String equipmentNumber);

    int updateByExampleSelective(@Param("record") EquipmentTable record, @Param("example") EquipmentTableExample example);

    int updateByExample(@Param("record") EquipmentTable record, @Param("example") EquipmentTableExample example);

    int updateByPrimaryKeySelective(EquipmentTable record);

    int updateByPrimaryKey(EquipmentTable record);
}