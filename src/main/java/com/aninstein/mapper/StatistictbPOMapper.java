package com.aninstein.mapper;

import com.aninstein.po.StatistictbPO;
import com.aninstein.po.example.StatistictbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatistictbPOMapper {
    long countByExample(StatistictbPOExample example);

    int deleteByExample(StatistictbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatistictbPO record);

    int insertSelective(StatistictbPO record);

    List<StatistictbPO> selectByExample(StatistictbPOExample example);

    StatistictbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatistictbPO record, @Param("example") StatistictbPOExample example);

    int updateByExample(@Param("record") StatistictbPO record, @Param("example") StatistictbPOExample example);

    int updateByPrimaryKeySelective(StatistictbPO record);

    int updateByPrimaryKey(StatistictbPO record);
}