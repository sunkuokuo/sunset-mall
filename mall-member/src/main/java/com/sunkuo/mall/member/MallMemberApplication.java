package com.sunkuo.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunkuo
 * @date 2023/9/2 18:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallMemberApplication.class, args);
	}
}
