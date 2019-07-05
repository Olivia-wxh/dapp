package com.dapp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dapp.dao.ContractMapper;
import com.dapp.entity.Contract;
import com.dapp.service.ContractService;
import com.sys.util.ResultInfoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ContractServiceImpl implements ContractService {

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Resource
    ContractMapper contractMapper;

    @Override
    public JSONObject insert(Contract contract) {
        //todo查询当前系统登录的公司名字作为质押申请方

        //判断当前公司是什么角色：供应商，合同类型设置为“供应”，核心企业，合同类型设置为“采购”

        //设置合同录入时间
        Date date = new Date();
        String enterTime = format.format(date);
        contract.setEnterTime(enterTime);
        //状态默认是已录入
        contract.setStatus("已录入");
        int res = contractMapper.insert(contract);
        if (res == 1){
            return ResultInfoUtil.result("success", null, "success");
        } else {
            return ResultInfoUtil.result("fail", null, "fail");
        }
    }
}
