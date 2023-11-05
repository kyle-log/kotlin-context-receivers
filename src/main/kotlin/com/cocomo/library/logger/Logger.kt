package com.cocomo.library.logger

import java.lang.Exception

interface Logger {
    fun error(exception: Exception)
}

class LocalLogger : Logger {
    override fun error(exception: Exception) {
        println("[ERROR] ${exception.message}")
    }
}
