package cn.hanpeng.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-helloworld")
public interface HelloworldService {

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    String sayHelloworldFromClient(String name);
}
