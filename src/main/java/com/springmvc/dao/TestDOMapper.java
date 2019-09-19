package com.springmvc.dao;


import com.springmvc.dbdo.TestDO;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface TestDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestDO record);

    int insertSelective(TestDO record);

    TestDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestDO record);

    int updateByPrimaryKey(TestDO record);
}