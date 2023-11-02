package com.cocomo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author kyle.kim@daangn.com
 */
@RestController
class TestController {

    @GetMapping
    fun test(): String {
        return "Hello, World!"
    }
}