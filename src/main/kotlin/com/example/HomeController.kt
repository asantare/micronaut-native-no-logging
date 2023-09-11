package com.example
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller
open class HomeController {
    private val logger: Logger = LoggerFactory.getLogger(HomeController::class.java)

    @Get
    fun index(): Map<String, String> {
        logger.info("INDEX INVOKED")
        return mapOf("message" to "Hello World")
    }
}