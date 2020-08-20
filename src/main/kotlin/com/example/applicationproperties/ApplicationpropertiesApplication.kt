package com.example.applicationproperties

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableConfigurationProperties(ExampleProperties::class)
//or:
@ConfigurationPropertiesScan
class ApplicationpropertiesApplication(val exampleProperties: ExampleProperties) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println(exampleProperties)
    }
}

fun main(args: Array<String>) {
    runApplication<ApplicationpropertiesApplication>(*args)
}
