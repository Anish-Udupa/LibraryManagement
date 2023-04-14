package com.example.LibraryManagement.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.LibraryManagement.Model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
