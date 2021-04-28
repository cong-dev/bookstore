package com.cong.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cong.bean.Book;
import com.cong.dao.BookDao;
import com.cong.dao.impl.BookDaoImpl;

class BookDaoImplTest {

	BookDao bookDao = new BookDaoImpl();
	
	@Test
	void testGetAllBooks() {
		List<Book> allBooks = bookDao.getAllBooks();
		for (Book book : allBooks) {
			System.out.println(book);
		}
		System.out.println("ok");
	}
	
	@Test
	void testAddBook() {
		bookDao.addBook(new Book(null, "testTitle", "testAuthor", 100, 200, 250, null));
	}

}
