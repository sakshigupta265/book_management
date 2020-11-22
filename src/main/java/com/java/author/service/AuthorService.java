package com.java.author.service;

import java.util.List;

import com.java.author.AuthorEntity;

public interface AuthorService {
	public List<AuthorEntity> getAllAuthors();

	public AuthorEntity getAuthorById(int author_id);

	public AuthorEntity addAuthor(AuthorEntity author) throws Exception;

	public AuthorEntity updateAuthor(AuthorEntity author);

	public void deleteAuthor(int author_id);
}
