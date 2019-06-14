package com.bitcoin.bitcoin.dao;

import com.bitcoin.bitcoin.po.transaction;

public interface transactionMapper {
    int deleteByPrimaryKey(String txhash);

    int insert(transaction record);

    int insertSelective(transaction record);

    transaction selectByPrimaryKey(String txhash);

    int updateByPrimaryKeySelective(transaction record);

    int updateByPrimaryKey(transaction record);
}