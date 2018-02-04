package com.aninstein.mapper;

import com.aninstein.po.InfomanagetbPO;
import com.aninstein.po.example.InfomanagetbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface InfomanagetbPOMapper {
    long countByExample(InfomanagetbPOExample example);

    int deleteByExample(InfomanagetbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InfomanagetbPO record);

    int insertSelective(InfomanagetbPO record);

    List<InfomanagetbPO> selectByExample(InfomanagetbPOExample example);

    InfomanagetbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InfomanagetbPO record, @Param("example") InfomanagetbPOExample example);

    int updateByExample(@Param("record") InfomanagetbPO record, @Param("example") InfomanagetbPOExample example);

    int updateByPrimaryKeySelective(InfomanagetbPO record);

    int updateByPrimaryKey(InfomanagetbPO record);
}