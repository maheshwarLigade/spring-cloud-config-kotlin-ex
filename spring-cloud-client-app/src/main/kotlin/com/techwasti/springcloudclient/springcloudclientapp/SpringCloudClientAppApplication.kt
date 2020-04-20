package com.techwasti.springcloudclient.springcloudclientapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudClientAppApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudClientAppApplication>(*args)
}

