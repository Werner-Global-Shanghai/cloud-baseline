package com.werner.knowledge.authservice.repository

import com.werner.knowledge.authservice.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>