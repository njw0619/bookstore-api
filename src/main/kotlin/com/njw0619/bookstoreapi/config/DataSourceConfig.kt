//package com.njw0619.bookstoreapi.config
//
//import org.springframework.boot.context.properties.ConfigurationProperties
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.context.annotation.Primary
//import javax.sql.DataSource
//
//@Configuration
//class DataSourceConfig {
//
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    fun dataSource(): DataSource {
//        return DataSourceBuilder.create().build()
//    }
//}