package com.woniu.dao;

import com.woniu.domain.ProductInDetail;
import com.woniu.domain.ProductInDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInDetailMapper {
    long countByExample(ProductInDetailExample example);

    int deleteByExample(ProductInDetailExample example);

    int insert(ProductInDetail record);

    int insertSelective(ProductInDetail record);

    List<ProductInDetail> selectByExample(ProductInDetailExample example);

    int updateByExampleSelective(@Param("record") ProductInDetail record, @Param("example") ProductInDetailExample example);

    int updateByExample(@Param("record") ProductInDetail record, @Param("example") ProductInDetailExample example);
}