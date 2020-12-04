package com.example.demo.service.fallback;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallback implements DemoService {
    @Override
    public String echo(String string) {
        return "echo fallback";
    }
}
