package com.bitcoin.bitcoin.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BitcoinRestApi",url = "http://localhost:18332")
public interface BitcoinRestApi {


    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainInfo();

    @GetMapping("/rest/block/notxdetails/{blockhash}.json")
    //PathVariable  如果后面不填  默认是参数名  对接 {}      地址参数{}接收   但是我这里不行  必须加上名字
    JSONObject getBlockNoTxDetail(@PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/headers/{count}/{blockhash}.json")
    JSONArray getBlockHeaders(@PathVariable("count") Integer count, @PathVariable("blockhash") String blockhash);

    @GetMapping("/rest/tx/{txhash}.json")
    JSONObject getTxByHashJson(@PathVariable("txhash") String txhash);

    @GetMapping("/rest/blockhashbyheight/{height}.json")
    JSONObject getHashByHeight(@PathVariable("height") Integer height);

    @GetMapping("/rest/mempool/info.json")
    JSONObject getMemPool();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getMemPoolContents();

}