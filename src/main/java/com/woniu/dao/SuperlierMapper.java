package com.woniu.dao;

import com.woniu.domain.Superlier;
import com.woniu.domain.SuperlierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperlierMapper {
    long countByExample(SuperlierExample example);

    int deleteByExample(SuperlierExample example);

    int deleteByPrimaryKey(String supplierId);

    int insert(Superlier record);

    int insertSelective(Superlier record);

    List<Superlier> selectByExample(SuperlierExample example);

    Superlier selectByPrimaryKey(String supplierId);

    int updateByExampleSelective(@Param("record") Superlier record, @Param("example") SuperlierExample example);

    int updateByExample(@Param("record") Superlier record, @Param("example") SuperlierExample example);

    int updateByPrimaryKeySelective(Superlier record);

    int updateByPrimaryKey(Superlier record);
}