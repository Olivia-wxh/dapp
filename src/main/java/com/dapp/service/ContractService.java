package com.dapp.service;

import com.alibaba.fastjson.JSONObject;
import com.dapp.entity.Contract;

public interface ContractService {
    JSONObject insert(Contract contract);
}
