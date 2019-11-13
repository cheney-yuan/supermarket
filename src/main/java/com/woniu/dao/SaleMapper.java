package com.woniu.dao;

import com.woniu.domain.Sale;
import com.woniu.domain.SaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
    long countByExample(SaleExample example);

    int deleteByExample(SaleExample example);

    int deleteByPrimaryKey(String saleId);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(String saleId);

    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}