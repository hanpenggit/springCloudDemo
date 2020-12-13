package cn.hanpeng.feign.rest;

import cn.hanpeng.feign.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloworldService helloworldService;
    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)

    public String sayHi(@RequestParam(defaultValue = "hanpeng",required = false) String name){
        return helloworldService.sayHelloworldFromClient(name);
    }
}
