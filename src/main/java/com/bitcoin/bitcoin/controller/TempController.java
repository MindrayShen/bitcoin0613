package com.bitcoin.bitcoin.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bitcoin.bitcoin.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private BitcoinRestApi bitcoinRestApi;


    @GetMapping("/test")
    public String test(){

//        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
//        JSONObject blockNoTxDetail = bitcoinRestApi.getBlockNoTxDetail("000000000000033ba3b0104d1c4f662f789caa7634670c49677aaa91f9ecb9a3");
        JSONArray blockHeaders = bitcoinRestApi.getBlockHeaders(5, "000000000000033ba3b0104d1c4f662f789caa7634670c49677aaa91f9ecb9a3");
//        JSONObject txByHashJson = bitcoinRestApi.getTxByHashJson("48890e18fa956ed43d43c22297d159359bb446a3a45d63e668607f89a0dbbb99");
//        JSONObject hashByHeight = bitcoinRestApi.getHashByHeight(1543827);
//        JSONObject memPool = bitcoinRestApi.getMemPool();
//        JSONObject memPoolContents = bitcoinRestApi.getMemPoolContents();
        return blockHeaders.toJSONString();

    }
}
