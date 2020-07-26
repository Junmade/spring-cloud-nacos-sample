package com.junmade.sample.provider;

import com.junmade.sample.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "provider: " + name;
    }
}
