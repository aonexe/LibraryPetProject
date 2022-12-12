package com.vorsin.library.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.vorsin.library")
@EnableWebMvc
@PropertySource("classpath: database.properties")
public class SpringConfig {
}
