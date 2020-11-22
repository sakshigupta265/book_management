package com.java.book.repository;

import java.util.List;

import com.java.book.BookEntity;

public interface BookRepositoryInterface {
	List<BookEntity> getAllBooks();

	BookEntity getBookById(int book_id);

	BookEntity addBook(BookEntity item) throws Exception;

	void updateBook(BookEntity item);

	void deleteBook(int book_id);

	List<BookEntity> groupByAuthorId(int author_id);

	List<BookEntity> groupByAuthorName(String author_name);

	List<BookEntity> groupByBookDescription(String description);

	boolean bookExists(BookEntity book);
}
