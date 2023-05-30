package com.njw0619.bookstoreapi.service

import com.njw0619.bookstoreapi.entity.BookStore
import com.njw0619.bookstoreapi.model.BookStoreDTO
import com.njw0619.bookstoreapi.repository.BookStoreRepository
import org.springframework.stereotype.Service

@Service
class BookStoreService (
    private val bookStoreRepository: BookStoreRepository
){
    fun getBookStore(id: Long): BookStoreDTO {
        val bookStore: BookStore = bookStoreRepository.findById(id).orElseThrow { Exception() }
        return BookStoreDTO.of(bookStore)
    }
}