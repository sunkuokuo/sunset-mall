package com.sunkuo.mall.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunkuo
 * @date 2023/9/2 18:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallSaleApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallSaleApplication.class, args);
	}
}
