package com.example.MyBadRequest

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class MyController {

    @PostMapping
    fun testPost(@RequestBody testRequest: TestRequest): TestRequest{
        println(testRequest)
        return testRequest
    }
}

data class TestRequest(var one:String, var two:String)
