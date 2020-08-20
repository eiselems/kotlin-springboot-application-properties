package com.example.applicationproperties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "example.property")
data class ExampleProperties(
        /**
         * my first String
         */
        val myString: String,
        val myBool: Boolean
)