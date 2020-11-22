package com.java.author.repository;

import java.util.List;

import com.java.author.AuthorEntity;

public interface AuthorRepositoryInterface {
	List<AuthorEntity> getAllAuthors();

	AuthorEntity getAuthorById(int author_id);

	AuthorEntity addAuthor(AuthorEntity author) throws Exception;

	void updateAuthor(AuthorEntity author);

	void deleteAuthor(int author_id);

	boolean authorExists(AuthorEntity author_name);
}
