package com.woniu.dao;

import com.woniu.domain.BackDetail;
import com.woniu.domain.BackDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackDetailMapper {
    long countByExample(BackDetailExample example);

    int deleteByExample(BackDetailExample example);

    int insert(BackDetail record);

    int insertSelective(BackDetail record);

    List<BackDetail> selectByExample(BackDetailExample example);

    int updateByExampleSelective(@Param("record") BackDetail record, @Param("example") BackDetailExample example);

    int updateByExample(@Param("record") BackDetail record, @Param("example") BackDetailExample example);
}