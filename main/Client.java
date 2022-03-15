package com.bookapp.main;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdkNotFoundException;
import com.bookapp.model.*;
import java.util.List;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService bookService=new BookServiceImpl();
		System.out.println("All Books");
		List<Book> allBooks=bookService.getAll();
		for(Book book:allBooks) {
			System.out.println(book);
		}
		
		System.out.println();
		System.out.println("Books By Auhtor");
		try {
			
			List<Book> booksByAuthor=bookService.getByAuthor("Steve");
			for(Book book:booksByAuthor) {
				System.out.println(book);
			}
			
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Book by ID");
		try {
			Book nbook=bookService.getById(5);
			System.out.println(nbook);
		}catch(IdkNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
}
