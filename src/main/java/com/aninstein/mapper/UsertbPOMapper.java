package com.aninstein.mapper;

import com.aninstein.po.UsertbPO;
import com.aninstein.po.example.UsertbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UsertbPOMapper {
    long countByExample(UsertbPOExample example);

    int deleteByExample(UsertbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsertbPO record);

    int insertSelective(UsertbPO record);

    List<UsertbPO> selectByExample(UsertbPOExample example);

    UsertbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsertbPO record, @Param("example") UsertbPOExample example);

    int updateByExample(@Param("record") UsertbPO record, @Param("example") UsertbPOExample example);

    int updateByPrimaryKeySelective(UsertbPO record);

    int updateByPrimaryKey(UsertbPO record);
}