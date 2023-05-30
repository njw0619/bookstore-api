package com.njw0619.bookstoreapi.service

import com.njw0619.bookstoreapi.annotation.UnitTest
import com.njw0619.bookstoreapi.entity.BookStore
import com.njw0619.bookstoreapi.model.BookStoreDTO
import com.njw0619.bookstoreapi.model.dummy.BookStoreDummyFactory
import com.njw0619.bookstoreapi.repository.BookStoreRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.mockk
import org.junit.jupiter.api.Test
import java.util.*


@UnitTest
internal class BookStoreServiceTest {

    private val bookStoreRepository: BookStoreRepository = mockk()

    @InjectMockKs
    private lateinit var bookStoreService: BookStoreService

    @Test
    fun getBookStore() {
        val id: Long = 1
        val bookStore: BookStore = BookStoreDummyFactory.generateBookStore()
        every { bookStoreRepository.findById(id) } returns Optional.of(bookStore)

        val result: BookStoreDTO = bookStoreService.getBookStore(id)
        println(result.toString())
    }
}