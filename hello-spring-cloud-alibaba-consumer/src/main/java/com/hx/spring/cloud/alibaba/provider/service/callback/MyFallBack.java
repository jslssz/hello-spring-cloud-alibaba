package com.hx.spring.cloud.alibaba.provider.service.callback;

import com.hx.spring.cloud.alibaba.provider.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author jxlgcmh
 * @date 2019-09-08 15:20
 */
@Component
public class MyFallBack implements EchoService {
    @Override
    public String getText() {
        return "服务器出错！";
    }

    @Override
    public String getPort() {
        return "服务器出错";
    }

    @Override
    public String getUser(String user) {
        return "服务器出错";
    }
}
