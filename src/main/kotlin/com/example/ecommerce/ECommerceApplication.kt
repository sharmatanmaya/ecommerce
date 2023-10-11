package com.example.ecommerce

import com.example.ecommerce.application.config.FakeStoreConfig
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties


@SpringBootApplication
@EnableConfigurationProperties(FakeStoreConfig::class)
class ECommerceApplication

fun main(args: Array<String>) {
	//runApplication<ECommerceApplication>(*args)
	SpringApplicationBuilder(ECommerceApplication::class.java)
		.bannerMode(Banner.Mode.OFF)
		.build()
		.run(*args)
}
