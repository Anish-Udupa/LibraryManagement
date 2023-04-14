package com.example.LibraryManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagement.Model.Book;
import com.example.LibraryManagement.Repository.BookRepository;

@RestController
@RequestMapping("/")
@CrossOrigin
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("getBooks")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	@PostMapping("/createBook")
	public void createBook(@RequestBody Book book) {
		System.out.println(book);
		bookRepository.save(book);
	}
}
