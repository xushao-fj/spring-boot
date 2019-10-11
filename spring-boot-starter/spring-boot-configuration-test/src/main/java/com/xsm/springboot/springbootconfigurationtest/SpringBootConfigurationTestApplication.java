package com.xsm.springboot.springbootconfigurationtest;

import com.xsm.springboot.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootConfigurationTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigurationTestApplication.class, args);
    }

    @RestController
    static class HelloController{
        @Autowired
        private HelloService helloService;

        @GetMapping("/hello")
        public String sayHello(){
            return helloService.sayHello("hello");
        }
    }

}
