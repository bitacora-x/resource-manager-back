package com.bitacorax.resourcemanagerback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ResourceManagerBackApplication

fun main(args: Array<String>) {
    runApplication<ResourceManagerBackApplication>(*args)
}
