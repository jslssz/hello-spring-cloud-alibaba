package com.hx.spring.cloud.alibaba.provider.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jxlgcmh
 * @date 2019-09-08 09:43
 */
@RestController
public class TestConsumer {

    private RestTemplate restTemplate;

    @Autowired
    public TestConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("hello")
    public String getText() {
        return restTemplate.getForObject("http://service-provider/hello",String.class);
    }

}
