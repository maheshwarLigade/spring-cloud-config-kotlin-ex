package com.techwasti.springcloudclient.springcloudclientapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    @Value("\${app.adminusername}")
    var username="Test"
//get request serving
    @GetMapping("/whoami")
    fun whoami() = "I am a  "+ username

}