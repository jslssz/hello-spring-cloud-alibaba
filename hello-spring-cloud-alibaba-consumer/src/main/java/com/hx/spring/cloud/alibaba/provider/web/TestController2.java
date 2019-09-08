package com.hx.spring.cloud.alibaba.provider.web;

import com.hx.spring.cloud.alibaba.provider.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-09-08 10:18
 */
@RestController
@RefreshScope
public class TestController2 {
    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String user;

    @GetMapping(value = "/feign")
    public String echo() {
        return echoService.getText();
    }

    @GetMapping(value = "/feign2")
    public String getPort() {
        return echoService.getPort();
    }

    @GetMapping(value = "/config")
    public String getUser() {
        return echoService.getUser(user);
    }
}
