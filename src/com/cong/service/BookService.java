package com.cong.service;

import java.util.List;

import com.cong.bean.Book;

public interface BookService {

	/**
	 * 获取所有books信息
	 * @return
	 */
	public List<Book> getAllBooks();
	
	/**
	 * 添加book
	 * @param book
	 */
	public void addBook(Book book);
	
	/**
	 * 删除book通过id
	 * @param id
	 */
	public void delBookById(String id);
	
	/**
	 * 修改book
	 * 		1. 通过id获取Book信息
	 * 		2. updateBook
	 */
	public Book getBookById(String id);
	
	/**
	 * 修改book
	 */
	public void updateBook(Book book);
	
}
