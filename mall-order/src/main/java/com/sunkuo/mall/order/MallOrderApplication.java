package com.sunkuo.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunkuo
 * @date 2023/9/2 18:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallOrderApplication.class, args);
	}
}
