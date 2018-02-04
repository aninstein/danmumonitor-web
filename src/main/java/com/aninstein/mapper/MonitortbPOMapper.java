package com.aninstein.mapper;

import com.aninstein.po.MonitortbPO;
import com.aninstein.po.example.MonitortbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MonitortbPOMapper {
    long countByExample(MonitortbPOExample example);

    int deleteByExample(MonitortbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonitortbPO record);

    int insertSelective(MonitortbPO record);

    List<MonitortbPO> selectByExample(MonitortbPOExample example);

    MonitortbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MonitortbPO record, @Param("example") MonitortbPOExample example);

    int updateByExample(@Param("record") MonitortbPO record, @Param("example") MonitortbPOExample example);

    int updateByPrimaryKeySelective(MonitortbPO record);

    int updateByPrimaryKey(MonitortbPO record);
}