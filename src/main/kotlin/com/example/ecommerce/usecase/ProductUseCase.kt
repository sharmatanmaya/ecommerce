package com.example.ecommerce.usecase

import com.example.ecommerce.entities.domain.Product

import com.example.ecommerce.entities.interfaces.integration.FakeStoreService
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class ProductUseCase(
private val fakeStoreService: FakeStoreService
) {

    fun getAllProducts(): Flux<Product> {
        return fakeStoreService.getAllProducts()
    }

    fun productById(productId: String): Mono<Product> {
        return fakeStoreService.productById(productId)

    }
}