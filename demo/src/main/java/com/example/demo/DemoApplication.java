package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
import org.springframework.cloud.openfeign.EnableFeignClients;
*/


/*
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

*/

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
*/
@SpringBootApplication
@EnableDiscoveryClient

public class DemoApplication {

/*
    @NacosInjected
    private NamingService namingService;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
*/

/*

	@NacosInjected
	private NamingService namingService;

	@Value("${server.port}")
	private int serverPort;

	@Value("${spring.application.name}")
	private String applicationName;

	@PostConstruct
	public void registerInstance() throws NacosException{
		namingService.registerInstance(applicationName,"192.168.3.10",serverPort);
	}

	@RequestMapping(value = "/getInstance", method = GET)
	@ResponseBody
	public List<Instance> getInstance(@RequestParam String serviceName) throws NacosException {
		return namingService.getAllInstances(serviceName);
	}

*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
/*

        @GetMapping("/demo")
        public String demo() {
            return "do not pod me!";
        }
*/

}
