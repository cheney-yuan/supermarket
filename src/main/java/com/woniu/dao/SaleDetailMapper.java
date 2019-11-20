package com.woniu.dao;

import com.woniu.domain.SaleDetail;
import com.woniu.domain.SaleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleDetailMapper {
    long countByExample(SaleDetailExample example);

    int deleteByExample(SaleDetailExample example);

    int insert(SaleDetail record);

    int insertSelective(SaleDetail record);

    List<SaleDetail> selectByExample(SaleDetailExample example);

    int updateByExampleSelective(@Param("record") SaleDetail record, @Param("example") SaleDetailExample example);

    int updateByExample(@Param("record") SaleDetail record, @Param("example") SaleDetailExample example);
}