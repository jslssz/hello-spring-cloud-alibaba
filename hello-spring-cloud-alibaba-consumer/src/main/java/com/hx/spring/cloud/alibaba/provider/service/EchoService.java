package com.hx.spring.cloud.alibaba.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jxlgcmh
 * @date 2019-09-08 10:15
 */
@FeignClient("service-provider")
public interface EchoService {
    @GetMapping(value = "/hello")
    String getText();

    @GetMapping(value = "/lb")
    String getPort();
}
