package com.java.author.controller;

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

import com.java.author.AuthorEntity;
import com.java.author.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@PostMapping(path = "/addAuthor")
	public ResponseEntity<AuthorEntity> addAuthor(@RequestBody AuthorEntity author) throws Exception {
		return new ResponseEntity<>(authorService.addAuthor(author), HttpStatus.CREATED);
	}

	@GetMapping(path = "/getAuthorById/{author_id}")
	public ResponseEntity<AuthorEntity> getAuthorById(@PathVariable(value = "author_id") int author_id) {
		return new ResponseEntity<>(authorService.getAuthorById(author_id), HttpStatus.OK);
	}

	@GetMapping(path = "/getAllAuthors")
	public ResponseEntity<List<AuthorEntity>> getAllAuthors() {
		return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateAuthor")
	public ResponseEntity<AuthorEntity> updateAuthor(@RequestBody AuthorEntity author) {
		return new ResponseEntity<>(authorService.updateAuthor(author), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/deleteAuthor/{author_id}")
	public ResponseEntity<String> deleteAuthor(@PathVariable(value = "author_id") int author_id) {
		authorService.deleteAuthor(author_id);
		return new ResponseEntity<>("Author Details Deleted!", HttpStatus.OK);
	}
}
