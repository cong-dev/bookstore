package com.cong.service.impl;

import java.util.List;

import com.cong.bean.Book;
import com.cong.dao.BookDao;
import com.cong.dao.impl.BookDaoImpl;
import com.cong.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao = new BookDaoImpl();
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Override
	public void delBookById(String id) {
		bookDao.delBookById(id);
	}

	@Override
	public Book getBookById(String id) {
		return bookDao.getBookById(id);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

}
