package com.junmade.nacos.config.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCloudNacosConfigSampleApplication {

    public static void main(String[] args) throws InterruptedException {

        // SpringApplication.run(SpringCloudNacosConfigSampleApplication.class, args);

        // 从 Environment 读取配置
        ConfigurableApplicationContext context = SpringApplication.run(SpringCloudNacosConfigSampleApplication.class, args);

        while (true) {
            String info = context.getEnvironment().getProperty("info");
            System.out.println(info);
            Thread.sleep(2000);
        }
    }

}
