package com.java.author.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.author.AuthorEntity;
import com.java.author.repository.AuthorRepository;
import com.java.exception.NotFoundException;

@Service
public class AuthorServiceInterface implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public List<AuthorEntity> getAllAuthors() {
		return authorRepository.getAllAuthors();
	}

	@Override
	public AuthorEntity getAuthorById(int author_id) {
		if (authorRepository.getAuthorById(author_id) != null) {
			return authorRepository.getAuthorById(author_id);
		} else {
			throw new NotFoundException("Author Not Found!");
		}
	}

	@Override
	public AuthorEntity addAuthor(AuthorEntity author) throws Exception {
		return authorRepository.addAuthor(author);
	}

	@Override
	public AuthorEntity updateAuthor(AuthorEntity author) {
		authorRepository.updateAuthor(author);
		return author;
	}

	@Override
	public void deleteAuthor(int author_id) {
		authorRepository.deleteAuthor(author_id);
	}

}
