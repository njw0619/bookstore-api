package com.njw0619.bookstoreapi.repository

import com.njw0619.bookstoreapi.entity.BookStore
import org.springframework.stereotype.Repository

@Repository
interface BookStoreRepository: BaseRepository<BookStore, Long>