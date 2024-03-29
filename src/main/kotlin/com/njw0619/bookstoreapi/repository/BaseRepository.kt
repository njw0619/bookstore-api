package com.njw0619.bookstoreapi.repository

import com.njw0619.bookstoreapi.config.JPAConfig
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Import
import org.springframework.data.jpa.repository.JpaRepository

@Import(JPAConfig::class)
interface BaseRepository<T, ID>: JpaRepository<T, ID> {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(this::class.java.name);
    }
}