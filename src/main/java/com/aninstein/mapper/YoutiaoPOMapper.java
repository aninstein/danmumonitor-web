package com.aninstein.mapper;

import com.aninstein.po.YoutiaoPO;
import com.aninstein.po.example.YoutiaoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface YoutiaoPOMapper {
    long countByExample(YoutiaoPOExample example);

    int deleteByExample(YoutiaoPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoutiaoPO record);

    int insertSelective(YoutiaoPO record);

    List<YoutiaoPO> selectByExample(YoutiaoPOExample example);

    YoutiaoPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoutiaoPO record, @Param("example") YoutiaoPOExample example);

    int updateByExample(@Param("record") YoutiaoPO record, @Param("example") YoutiaoPOExample example);

    int updateByPrimaryKeySelective(YoutiaoPO record);

    int updateByPrimaryKey(YoutiaoPO record);
}