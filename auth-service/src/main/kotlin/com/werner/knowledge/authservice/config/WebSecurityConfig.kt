package com.werner.knowledge.authservice.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService

@EnableWebSecurity
class WebSecurityConfig: WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {

        http!!.authorizeRequests().anyRequest().authenticated()
                .and()
                .csrf().disable()
    }

    override fun configure(web: WebSecurity?) {

        web!!.ignoring().antMatchers("/register")
    }

    override fun userDetailsService(): UserDetailsService {
        return super.userDetailsService()
    }
}