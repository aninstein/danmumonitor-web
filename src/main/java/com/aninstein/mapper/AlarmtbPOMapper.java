package com.aninstein.mapper;

import com.aninstein.po.AlarmtbPO;
import com.aninstein.po.example.AlarmtbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AlarmtbPOMapper {
    long countByExample(AlarmtbPOExample example);

    int deleteByExample(AlarmtbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlarmtbPO record);

    int insertSelective(AlarmtbPO record);

    List<AlarmtbPO> selectByExample(AlarmtbPOExample example);

    AlarmtbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlarmtbPO record, @Param("example") AlarmtbPOExample example);

    int updateByExample(@Param("record") AlarmtbPO record, @Param("example") AlarmtbPOExample example);

    int updateByPrimaryKeySelective(AlarmtbPO record);

    int updateByPrimaryKey(AlarmtbPO record);
}