package com.example.demo.service;

import com.example.demo.service.fallback.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "quickstart-provider",fallback = DemoServiceFallback.class)
public interface DemoService {
    /**
     * 模拟provider
     * @param string
     * @return
     */
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);

}
