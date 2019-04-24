package com.qzj.cloudsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableConfigurationProperties(SecurityConfiguration.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/static/**")
            .permitAll()
            .and()
            .authorizeRequests()
            .anyRequest()
                .authenticated()
                .and()
                .formLogin()
//                .loginPage(securityProperties.getLoginPage())
                .defaultSuccessUrl("/index")
                .and()
                .httpBasic();
    }
}

