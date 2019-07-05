package com.sys.util;

import com.alibaba.fastjson.JSONObject;

public class ResultInfoUtil {

    public static JSONObject result(String flag, Object data, String msg){
        JSONObject jo = new JSONObject();
        if ("success".equals(flag)) {
            jo.put("code", "000000");
        } else {
            jo.put("code", "000001");
        }
        jo.put("msg", msg);
        jo.put("data", data);
        return jo;
    }
}
