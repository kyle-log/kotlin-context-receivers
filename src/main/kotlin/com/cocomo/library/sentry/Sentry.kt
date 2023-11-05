package com.cocomo.library.sentry

interface Sentry {
    fun send(exception: Exception)
}

class LocalSentry : Sentry {
    override fun send(exception: Exception) {
        println("[SENTRY] ${exception.message}")
    }
}