package com.dapp.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dapp/contract")
public class ContractController {

    /**
     * 添加采购合同tiana
     * @param contract
     * @return
     */
    public JSONObject save(Contract contract){
        JSONObject jo = new JSONObject();
        return jo;
    }
}
