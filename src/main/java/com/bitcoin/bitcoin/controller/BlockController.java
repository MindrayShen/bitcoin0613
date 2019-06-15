package com.bitcoin.bitcoin.controller;

import com.bitcoin.bitcoin.dto.BlockGetDto;
import com.bitcoin.bitcoin.dto.BlockListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {


    @GetMapping("/getrecentblocks")
    public List<BlockListDto> getrecentblocks(){

        ArrayList<BlockListDto> list = new ArrayList<>();
        BlockListDto blockListDto = new BlockListDto();
        blockListDto.setBlockhash("000000000000000000051ce97582f22c3f24de4884eb5ee7ca98efd563879dba");
        blockListDto.setHeight(580678);
        blockListDto.setMiner("F2Pool");
        blockListDto.setSize(1143.45f);
        blockListDto.setTime(new Date().getTime());
        blockListDto.setTransactions((short) 2564);
        list.add(blockListDto);

        BlockListDto blockListDto2 = new BlockListDto();
        blockListDto2.setBlockhash("00000000000000000011903ce43dad868af043ca2f967016b4a2ba16e5311e53");
        blockListDto2.setHeight(580673);
        blockListDto2.setMiner("ViaBTC");
        blockListDto2.setSize(1069.494f);
        blockListDto2.setTime(new Date().getTime());
        blockListDto2.setTransactions((short) 2688);
        list.add(blockListDto2);

        return list;
    }

    @GetMapping("/getByBlockhash")
    public BlockGetDto getByBlockhash(String blockhash){

        BlockGetDto blockGetDto = new BlockGetDto();
        blockGetDto.setBlockhash("00000000000000000011903ce43dad868af043ca2f967016b4a2ba16e5311e53");
        blockGetDto.setHeight(580673);
        blockGetDto.setBits(388365571f);
        blockGetDto.setBlockreward(12.5f);
        blockGetDto.setDifficulty(7409399249090.25);
        blockGetDto.setEstimated(215.78490109f);
        blockGetDto.setFees(0.22123845f);
        blockGetDto.setMerkleroot("e4ef6b371d290b2715d53f09315839d79f30c58837083bba2d07eb53576dc2bc");
        blockGetDto.setMiner("ViaBTC");
        blockGetDto.setNextBlock("0000000000000000001aa40e06ed3978a028fd3b4bdf7e1b882d1c827991b096");
        blockGetDto.setNonce(394583144);
        blockGetDto.setOutputtotal(	1692.97928358f);
        blockGetDto.setPrevBlock("0000000000000000001d05f0e7621183f88c452401fb8d180ba49fdd75c5b44e");
        blockGetDto.setSize(1069.494f);
        blockGetDto.setTime(new Date().getTime());
        blockGetDto.setTransactions((short) 2688);
        blockGetDto.setVersion("0x20000000");
        blockGetDto.setWeight(1f);

        return blockGetDto;
    }

    @GetMapping("/getByBlockheight")
    public BlockGetDto getByBlockheight(Integer blockheight){

        BlockGetDto blockGetDto = new BlockGetDto();
        blockGetDto.setBlockhash("00000000000000000011903ce43dad868af043ca2f967016b4a2ba16e5311e53");
        blockGetDto.setHeight(580673);
        blockGetDto.setBits(388365571f);
        blockGetDto.setBlockreward(12.5f);
        blockGetDto.setDifficulty(7409399249090.25);
        blockGetDto.setEstimated(215.78490109f);
        blockGetDto.setFees(0.22123845f);
        blockGetDto.setMerkleroot("e4ef6b371d290b2715d53f09315839d79f30c58837083bba2d07eb53576dc2bc");
        blockGetDto.setMiner("ViaBTC");
        blockGetDto.setNextBlock("0000000000000000001aa40e06ed3978a028fd3b4bdf7e1b882d1c827991b096");
        blockGetDto.setNonce(394583144);
        blockGetDto.setOutputtotal(	1692.97928358f);
        blockGetDto.setPrevBlock("0000000000000000001d05f0e7621183f88c452401fb8d180ba49fdd75c5b44e");
        blockGetDto.setSize(1069.494f);
        blockGetDto.setTime(new Date().getTime());
        blockGetDto.setTransactions((short) 2688);
        blockGetDto.setVersion("0x20000000");
        blockGetDto.setWeight(1f);

        return blockGetDto;
    }

}
