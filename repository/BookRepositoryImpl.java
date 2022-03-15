package com.bookapp.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdkNotFoundException;
import com.bookapp.model.Book;

public class BookRepositoryImpl implements IBookRepository{

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Book findById(int bookId) throws IdkNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
