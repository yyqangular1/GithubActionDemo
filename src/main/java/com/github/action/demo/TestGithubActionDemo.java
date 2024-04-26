package com.github.action.demo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.sofast.cloud.core.feign.annotation.EnableSolFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableSolFeign
@EnableDiscoveryClient
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class TestGithubActionDemo {

    public static void main(String[] args) {
        SpringApplication.run(TestGithubActionDemo.class, args);
    }
}
