package com.sunkuo.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sunkuo
 * @date 2023/9/2 18:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.sunkuo.mall.common", "com.sunkuo.mall.member"})
@EnableFeignClients(basePackages = "com.sunkuo.mall.member.feign")
public class MallMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallMemberApplication.class, args);
	}
}
