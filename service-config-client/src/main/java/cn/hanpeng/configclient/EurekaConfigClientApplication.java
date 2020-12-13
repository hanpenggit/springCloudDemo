package cn.hanpeng.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClientApplication.class, args);
	}


	@Value("${servicetest}")
	String servicetest;

	@RequestMapping(value = "/demo")
	public String demo(){
		return servicetest;
	}

}
