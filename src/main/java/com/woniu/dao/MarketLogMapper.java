package com.woniu.dao;

import com.woniu.domain.MarketLog;
import com.woniu.domain.MarketLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketLogMapper {
    long countByExample(MarketLogExample example);

    int deleteByExample(MarketLogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(MarketLog record);

    int insertSelective(MarketLog record);

    List<MarketLog> selectByExample(MarketLogExample example);

    MarketLog selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") MarketLog record, @Param("example") MarketLogExample example);

    int updateByExample(@Param("record") MarketLog record, @Param("example") MarketLogExample example);

    int updateByPrimaryKeySelective(MarketLog record);

    int updateByPrimaryKey(MarketLog record);
}