package com.example.ecommerce.application.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import javax.inject.Named



@ConfigurationProperties(prefix = "fakestore")
@EnableConfigurationProperties
data class FakeStoreConfig(
    var url: String,
    var paths: UrlPaths

)

data class UrlPaths(
    var products: String,
    var categories: String,
    var category: String
)
