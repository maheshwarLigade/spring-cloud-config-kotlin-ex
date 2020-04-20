package com.techwasti.scc.server.springcloudconfigserverex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigServerexApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigServerexApplication>(*args)
}
