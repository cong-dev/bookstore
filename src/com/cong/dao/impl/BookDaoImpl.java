package com.cong.dao.impl;

import java.util.List;

import com.cong.bean.Book;
import com.cong.dao.BaseDao;
import com.cong.dao.BookDao;

public class BookDaoImpl extends BaseDao<Book> implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		String sql = "SELECT id,title,author,price,sales,stock,img_path FROM books";
		return this.getBeanList(sql);
	}

	@Override
	public void addBook(Book book) {
		String sql = "insert into books(title,author,price,sales,stock,img_path) values(?,?,?,?,?,?)";
		this.update(sql, book.getTitle(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath());
	}

	@Override
	public void delBookById(String id) {
		String sql = "delete from books where id = ?";
		this.update(sql, id);
	}

	@Override
	public Book getBookById(String id) {
		String sql = "SELECT id,title,author,price,sales,stock,img_path FROM books WHERE id = ?";
		return this.getBean(sql, id);
	}

	@Override
	public void updateBook(Book book) {
		String sql = "update books set title=?,author=?,price=?,sales=?,stock=? where id=?";
		this.update(sql, book.getTitle(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getId());
	}

	
	
}
