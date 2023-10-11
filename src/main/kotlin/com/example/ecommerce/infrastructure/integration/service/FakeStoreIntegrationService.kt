package com.example.ecommerce.infrastructure.integration.service

import com.example.ecommerce.application.config.FakeStoreConfig
import com.example.ecommerce.entities.domain.Product

import com.example.ecommerce.entities.interfaces.integration.FakeStoreService
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class FakeStoreIntegrationService(
private val fakestoreConfig: FakeStoreConfig
): FakeStoreService {

    override fun getAllProducts(): Flux<Product> {

        /*val webclient = WebClient.create(fakestoreConfig.url)

        return webclient.get()
            .uri(fakestoreConfig.paths.products)
            .retrieve()
            .bodyToFlux(Product::class.java)*/
        val webClient = WebClient.create()
        return webClient.get()
            .uri("https://fakestoreapi.com/products") // Replace with your API endpoint URL
            .retrieve()
            .bodyToFlux(Product::class.java)
    }

    override fun productById(productId: String): Mono<Product> {
        val webClient = WebClient.create()
        return webClient.get()
            .uri("https://fakestoreapi.com/products/${productId}")
            .retrieve()
            .bodyToMono(Product::class.java)
    }
}