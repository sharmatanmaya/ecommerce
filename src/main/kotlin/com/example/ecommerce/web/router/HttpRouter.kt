package com.example.ecommerce.web.router

import com.example.ecommerce.web.handler.ProductHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class HttpRouter(
    private val productHandler: ProductHandler
) {
    @Bean
    fun routes() = router {
        "/ecommerce".nest {
            accept(MediaType.APPLICATION_JSON ).nest {
                GET("/test", productHandler::test)
                GET("/products", productHandler::allProducts)
                GET("/products/{id}", productHandler::productById)
            }
        }

    }
}