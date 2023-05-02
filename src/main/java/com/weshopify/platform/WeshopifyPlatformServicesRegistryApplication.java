package com.weshopify.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = SystemMetricsAutoConfiguration.class)
@EnableEurekaServer
public class WeshopifyPlatformServicesRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeshopifyPlatformServicesRegistryApplication.class, args);
	}
}
