package com.aninstein.mapper;

import com.aninstein.po.BantbPO;
import com.aninstein.po.example.BantbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface BantbPOMapper {
    long countByExample(BantbPOExample example);

    int deleteByExample(BantbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BantbPO record);

    int insertSelective(BantbPO record);

    List<BantbPO> selectByExample(BantbPOExample example);

    BantbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BantbPO record, @Param("example") BantbPOExample example);

    int updateByExample(@Param("record") BantbPO record, @Param("example") BantbPOExample example);

    int updateByPrimaryKeySelective(BantbPO record);

    int updateByPrimaryKey(BantbPO record);
}