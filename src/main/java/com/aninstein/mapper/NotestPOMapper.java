package com.aninstein.mapper;

import com.aninstein.po.NotestPO;
import com.aninstein.po.example.NotestPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotestPOMapper {
    long countByExample(NotestPOExample example);

    int deleteByExample(NotestPOExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(NotestPO record);

    int insertSelective(NotestPO record);

    List<NotestPO> selectByExample(NotestPOExample example);

    NotestPO selectByPrimaryKey(Integer number);

    int updateByExampleSelective(@Param("record") NotestPO record, @Param("example") NotestPOExample example);

    int updateByExample(@Param("record") NotestPO record, @Param("example") NotestPOExample example);

    int updateByPrimaryKeySelective(NotestPO record);

    int updateByPrimaryKey(NotestPO record);
}