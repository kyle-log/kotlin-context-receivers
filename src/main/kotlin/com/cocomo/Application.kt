package com.cocomo

import com.cocomo.library.logger.LocalLogger
import com.cocomo.library.logger.Logger
import com.cocomo.library.logger.StandardLoggerContext
import com.cocomo.library.sentry.LocalSentry
import com.cocomo.library.sentry.Sentry
import com.cocomo.library.sentry.StandardSentryContext
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@Configuration
class Configuration {

    @Bean
    fun localLogger() = LocalLogger()

    @Bean
    fun loggerContext(logger: Logger) = StandardLoggerContext(logger)

    @Bean
    fun localSentry() = LocalSentry()

    @Bean
    fun sentryContext(sentry: Sentry) = StandardSentryContext(sentry)
}
