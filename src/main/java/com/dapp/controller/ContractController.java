package com.dapp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dapp.entity.Contract;
import com.dapp.service.ContractService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dapp/contract")
public class ContractController {

    @Resource
    ContractService contractService;

    /**
     * 添加采购合同
     * @param contract
     * @return
     */
    public JSONObject save(Contract contract){
        JSONObject jo = new JSONObject();
        jo = contractService.insert(contract);
        return jo;
    }
}
