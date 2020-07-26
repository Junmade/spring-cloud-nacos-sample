package com.junmade.sample.consumer;

import com.junmade.sample.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private IHelloService service;

    @RequestMapping("/say")
    public String sayHello() {

        return service.sayHello("made");
    }

}
