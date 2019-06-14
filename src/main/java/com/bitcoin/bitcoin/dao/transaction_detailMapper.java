package com.bitcoin.bitcoin.dao;

import com.bitcoin.bitcoin.po.transaction_detail;

public interface transaction_detailMapper {
    int deleteByPrimaryKey(Long txDetailId);

    int insert(transaction_detail record);

    int insertSelective(transaction_detail record);

    transaction_detail selectByPrimaryKey(Long txDetailId);

    int updateByPrimaryKeySelective(transaction_detail record);

    int updateByPrimaryKey(transaction_detail record);
}