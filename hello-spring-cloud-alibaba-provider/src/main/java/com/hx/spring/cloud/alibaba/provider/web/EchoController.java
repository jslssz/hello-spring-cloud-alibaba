package com.hx.spring.cloud.alibaba.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxlgcmh
 * @date 2019-09-08 09:22
 */
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/hello")
    public String printText() {
        return "hello nacos";
    }

    @GetMapping("lb")
    public String lb() {
        return "端口号是"+port;
    }

    /**
     *  测试配置中心
     * @param user
     * @return
     */
    @GetMapping("config/{user}")
    public String getUser(@PathVariable("user") String user){
        return "用户名是"+user;
    }

}
