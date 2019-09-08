package com.hx.spring.cloud.alibaba.provider.web;

import com.hx.spring.cloud.alibaba.provider.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-09-08 10:18
 */
@RestController
public class TestController2 {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/feign")
    public String echo() {
        return echoService.getText();
    }

    @GetMapping(value = "/feign2")
    public String getPort() {
        return echoService.getPort();
    }
}
