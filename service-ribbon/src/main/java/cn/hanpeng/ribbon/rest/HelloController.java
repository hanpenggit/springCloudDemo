package cn.hanpeng.ribbon.rest;

import cn.hanpeng.ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;


    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/helloworld")
    public String helloworld(@RequestParam(defaultValue = "hanpeng",required = false) String name){
        return helloService.helloworldService(name);
    }

    public String hiError(String name) {
        return "hi "+name+",sorry,error!";
    }
}
