package com.java.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.book.BookEntity;
import com.java.book.repository.BookRepository;
import com.java.exception.NotFoundException;

@Service
public class BookServiceInterface implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<BookEntity> getAllBooks() {
		return bookRepository.getAllBooks();
	}

	@Override
	public BookEntity getBookById(int book_id) {
		if (bookRepository.getBookById(book_id) != null) {
			return bookRepository.getBookById(book_id);
		} else {
			throw new NotFoundException("Book Not Found!");
		}
	}

	@Override
	public BookEntity addBook(BookEntity book) throws Exception {
		return bookRepository.addBook(book);
	}

	@Override
	public BookEntity updateBook(BookEntity book) {
		bookRepository.updateBook(book);
		return book;
	}

	@Override
	public void deleteBook(int book_id) {
		bookRepository.deleteBook(book_id);
	}

	@Override
	public List<BookEntity> groupByAuthorId(int author_id) {
		return bookRepository.groupByAuthorId(author_id);
	}

	@Override
	public List<BookEntity> groupByAuthorName(String author_name) {
		return bookRepository.groupByAuthorName(author_name);
	}

	@Override
	public List<BookEntity> groupByBookDescription(String decsription) {
		return bookRepository.groupByBookDescription(decsription);
	}

}
