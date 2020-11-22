package com.java.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.book.BookEntity;
import com.java.book.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping(path = "/addBook")
	public ResponseEntity<BookEntity> addBook(@RequestBody BookEntity book) throws Exception {
		return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getBookById/{book_id}")
	public ResponseEntity<BookEntity> getBookById(@PathVariable(value = "book_id") int book_id) {
		return new ResponseEntity<>(bookService.getBookById(book_id), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllBooks")
	public ResponseEntity<List<BookEntity>> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateBook")
	public ResponseEntity<BookEntity> updateBook(@RequestBody BookEntity book) {
		return new ResponseEntity<>(bookService.updateBook(book), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteBook/{book_id}")
	public ResponseEntity<String> deleteBook(@PathVariable(value = "book_id") int book_id) {
		bookService.deleteBook(book_id);
		return new ResponseEntity<>("Book Deleted!", HttpStatus.OK);
	}

	@GetMapping(path = "/groupByAuthorId/{author_id}")
	public ResponseEntity<List<BookEntity>> groupByAuthorId(@PathVariable(value = "author_id") int author_id) {
		return new ResponseEntity<>(bookService.groupByAuthorId(author_id), HttpStatus.OK);
	}

	@GetMapping(path = "/groupByAuthorName/{author_name}")
	public ResponseEntity<List<BookEntity>> groupByAuthorName(@PathVariable(value = "author_name") String author_name) {
		return new ResponseEntity<>(bookService.groupByAuthorName(author_name), HttpStatus.OK);
	}

	@GetMapping(path = "/groupByBookDescription/{description}")
	public ResponseEntity<List<BookEntity>> groupByBookDescription(
			@PathVariable(value = "description") String description) {
		return new ResponseEntity<>(bookService.groupByBookDescription(description), HttpStatus.OK);
	}
}
