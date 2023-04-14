package com.example.LibraryManagement.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
public class Book {
	@Id
	private String id;
	private String bookName;
	private String authorName;
	private String bookDesc;
	private int cost;
	
	public Book(String bookName, String authorName, String bookDesc, int cost) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookDesc = bookDesc;
		this.cost = cost;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public String getBookDesc() {
		return bookDesc;
	}
	
	public int getCost() {
		return cost;
	}
	
	
}
