package com.woniu.dao;

import com.woniu.domain.ProductBack;
import com.woniu.domain.ProductBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBackMapper {
    long countByExample(ProductBackExample example);

    int deleteByExample(ProductBackExample example);

    int deleteByPrimaryKey(String pbId);

    int insert(ProductBack record);

    int insertSelective(ProductBack record);

    List<ProductBack> selectByExample(ProductBackExample example);

    ProductBack selectByPrimaryKey(String pbId);

    int updateByExampleSelective(@Param("record") ProductBack record, @Param("example") ProductBackExample example);

    int updateByExample(@Param("record") ProductBack record, @Param("example") ProductBackExample example);

    int updateByPrimaryKeySelective(ProductBack record);

    int updateByPrimaryKey(ProductBack record);
}