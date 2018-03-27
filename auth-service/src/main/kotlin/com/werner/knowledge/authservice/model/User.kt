package com.werner.knowledge.authservice.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
                var username: String,
                var password: String) : Serializable