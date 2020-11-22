package com.java.book.service;

import java.util.List;

import com.java.book.BookEntity;

public interface BookService {
	public List<BookEntity> getAllBooks();

	public BookEntity getBookById(int book_id);

	public BookEntity addBook(BookEntity book) throws Exception;

	public BookEntity updateBook(BookEntity book);

	public void deleteBook(int book_id);

	public List<BookEntity> groupByAuthorId(int author_id);

	public List<BookEntity> groupByAuthorName(String author_name);

	public List<BookEntity> groupByBookDescription(String decsription);
}
