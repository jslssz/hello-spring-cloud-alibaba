package com.hx.spring.cloud.alibaba.provider.service;

import com.hx.spring.cloud.alibaba.provider.service.callback.MyFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jxlgcmh
 * @date 2019-09-08 10:15
 */
@FeignClient(value = "service-provider",fallback = MyFallBack.class)
public interface EchoService {
    @GetMapping(value = "/hello")
    String getText();

    @GetMapping(value = "/lb")
    String getPort();

    @GetMapping(value = "config/{user}")
    String getUser(@PathVariable("user") String user);
}
