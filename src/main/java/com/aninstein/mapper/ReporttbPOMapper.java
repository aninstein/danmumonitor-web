package com.aninstein.mapper;

import com.aninstein.po.ReporttbPO;
import com.aninstein.po.example.ReporttbPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ReporttbPOMapper {
    long countByExample(ReporttbPOExample example);

    int deleteByExample(ReporttbPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReporttbPO record);

    int insertSelective(ReporttbPO record);

    List<ReporttbPO> selectByExampleWithBLOBs(ReporttbPOExample example);

    List<ReporttbPO> selectByExample(ReporttbPOExample example);

    ReporttbPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReporttbPO record, @Param("example") ReporttbPOExample example);

    int updateByExampleWithBLOBs(@Param("record") ReporttbPO record, @Param("example") ReporttbPOExample example);

    int updateByExample(@Param("record") ReporttbPO record, @Param("example") ReporttbPOExample example);

    int updateByPrimaryKeySelective(ReporttbPO record);

    int updateByPrimaryKeyWithBLOBs(ReporttbPO record);

    int updateByPrimaryKey(ReporttbPO record);
}