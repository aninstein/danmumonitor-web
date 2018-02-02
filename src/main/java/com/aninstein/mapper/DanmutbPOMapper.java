package com.aninstein.mapper;

import com.aninstein.po.DanmutbPO;
import com.aninstein.po.example.DanmutbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DanmutbPOMapper {
    long countByExample(DanmutbPOExample example);

    int deleteByExample(DanmutbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DanmutbPO record);

    int insertSelective(DanmutbPO record);

    List<DanmutbPO> selectByExample(DanmutbPOExample example);

    DanmutbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DanmutbPO record, @Param("example") DanmutbPOExample example);

    int updateByExample(@Param("record") DanmutbPO record, @Param("example") DanmutbPOExample example);

    int updateByPrimaryKeySelective(DanmutbPO record);

    int updateByPrimaryKey(DanmutbPO record);
}