package com.youxuewen.dubbo.provider.quickstart;

import com.youxuewen.dubbo.ServerApi;

/**
 * created by zhangjingchuan on 2020/5/14
 */
public class QuickStartServiceImpl implements ServerApi {

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message-".concat(message);
    }
}
