package com.woniu.dao;

import com.woniu.domain.ProductIn;
import com.woniu.domain.ProductInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInMapper {
    long countByExample(ProductInExample example);

    int deleteByExample(ProductInExample example);

    int deleteByPrimaryKey(String piId);

    int insert(ProductIn record);

    int insertSelective(ProductIn record);

    List<ProductIn> selectByExample(ProductInExample example);

    ProductIn selectByPrimaryKey(String piId);

    int updateByExampleSelective(@Param("record") ProductIn record, @Param("example") ProductInExample example);

    int updateByExample(@Param("record") ProductIn record, @Param("example") ProductInExample example);

    int updateByPrimaryKeySelective(ProductIn record);

    int updateByPrimaryKey(ProductIn record);
}