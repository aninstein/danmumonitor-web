package com.aninstein.mapper;

import com.aninstein.po.AnchormapperPO;
import com.aninstein.po.example.AnchormapperPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnchormapperPOMapper {
    long countByExample(AnchormapperPOExample example);

    int deleteByExample(AnchormapperPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnchormapperPO record);

    int insertSelective(AnchormapperPO record);

    List<AnchormapperPO> selectByExample(AnchormapperPOExample example);

    AnchormapperPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnchormapperPO record, @Param("example") AnchormapperPOExample example);

    int updateByExample(@Param("record") AnchormapperPO record, @Param("example") AnchormapperPOExample example);

    int updateByPrimaryKeySelective(AnchormapperPO record);

    int updateByPrimaryKey(AnchormapperPO record);
}