package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdkNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	
	void addBook(Book book);
	void updateBook(int bookid,double price);
	void deleteBook(int bookid);

	List<Book> getAll();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getByCategory(String category)throws BookNotFoundException;
	Book getById(int bookId)throws IdkNotFoundException;
	List<Book> getByLesserPrice(double price) throws BookNotFoundException;

}
