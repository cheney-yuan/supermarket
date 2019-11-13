package com.woniu.dao;

import com.woniu.domain.ReducePrice;
import com.woniu.domain.ReducePriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReducePriceMapper {
    long countByExample(ReducePriceExample example);

    int deleteByExample(ReducePriceExample example);

    int deleteByPrimaryKey(String rpId);

    int insert(ReducePrice record);

    int insertSelective(ReducePrice record);

    List<ReducePrice> selectByExample(ReducePriceExample example);

    ReducePrice selectByPrimaryKey(String rpId);

    int updateByExampleSelective(@Param("record") ReducePrice record, @Param("example") ReducePriceExample example);

    int updateByExample(@Param("record") ReducePrice record, @Param("example") ReducePriceExample example);

    int updateByPrimaryKeySelective(ReducePrice record);

    int updateByPrimaryKey(ReducePrice record);
}