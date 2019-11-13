package com.woniu.dao;

import com.woniu.domain.Vip;
import com.woniu.domain.VipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipMapper {
    long countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(String vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(String vipId);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
}