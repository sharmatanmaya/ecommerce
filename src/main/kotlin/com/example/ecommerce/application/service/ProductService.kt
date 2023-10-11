package com.example.ecommerce.application.service

import com.example.ecommerce.entities.domain.Product

import com.example.ecommerce.usecase.ProductUseCase
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class ProductService(
    private val productUseCase: ProductUseCase
) {
    fun getAllProducts(): Flux<Product> {
        return productUseCase.getAllProducts()

    }

    fun getProductById(productId: String): Mono<Product> {
        return productUseCase.productById(productId)

    }
}