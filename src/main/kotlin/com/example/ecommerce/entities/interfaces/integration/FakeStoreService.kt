package com.example.ecommerce.entities.interfaces.integration

import com.example.ecommerce.entities.domain.Product
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface FakeStoreService {
     fun getAllProducts(): Flux<Product>
     fun productById(productId: String): Mono<Product>
}