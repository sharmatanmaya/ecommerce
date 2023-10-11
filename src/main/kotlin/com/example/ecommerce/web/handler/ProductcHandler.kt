package com.example.ecommerce.web.handler

import com.example.ecommerce.application.service.ProductService
import com.example.ecommerce.entities.domain.Product
import org.springframework.boot.context.properties.bind.Bindable.mapOf
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import javax.inject.Named


@Named
class ProductHandler(
    private val productService: ProductService
) {
    fun test(serverRequest: ServerRequest): Mono<ServerResponse> {
        val message = "this is a test api"
        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue("message:: $message")

    }
    fun allProducts(serverRequest: ServerRequest): Mono<ServerResponse> {

        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(
                productService.getAllProducts(),
                Product::class.java
            )
    }
    fun productById(serverRequest: ServerRequest): Mono<ServerResponse> {
        val productId = serverRequest.pathVariable("id")
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(
                productService.getProductById(productId),
                Product::class.java
            )

    }



}