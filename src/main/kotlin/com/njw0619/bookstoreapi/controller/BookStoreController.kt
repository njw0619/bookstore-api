package com.njw0619.bookstoreapi.controller

import com.njw0619.bookstoreapi.model.BookStoreDTO
import com.njw0619.bookstoreapi.service.BookStoreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/book-store")
class BookStoreController (private val bookStoreService: BookStoreService) {

    @GetMapping("/{id}")
    fun getBookStore(@PathVariable("id") id: Long): BookStoreDTO {
        return bookStoreService.getBookStore(id)
    }
}