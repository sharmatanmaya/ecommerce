package com.example.ecommerce.application.service

import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import javax.inject.Named

@Named
class StartupService: ApplicationListener<ApplicationReadyEvent> {
    private val logger = LoggerFactory.getLogger(this::class.java.name)
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        logger.info("startup service called")

    }
}