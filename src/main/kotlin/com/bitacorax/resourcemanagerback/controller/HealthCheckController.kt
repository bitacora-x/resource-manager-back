package com.bitacorax.resourcemanagerback.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthCheckController {
    @GetMapping
    fun index(): String = "¡Hola desde Spring Boot con Kotlin!"
}
