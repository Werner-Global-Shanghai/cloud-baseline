package com.werner.knowledge.authservice.api

import com.werner.knowledge.authservice.model.User
import com.werner.knowledge.authservice.repository.UserRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResource(val userRepository: UserRepository) {

    @PostMapping("/register")
    fun registerUser(@RequestBody user: User) = userRepository.save(user)
}

