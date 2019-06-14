package com.bitcoin.bitcoin.dao;

import com.bitcoin.bitcoin.po.block;

public interface blockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(block record);

    int insertSelective(block record);

    block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(block record);

    int updateByPrimaryKey(block record);
}