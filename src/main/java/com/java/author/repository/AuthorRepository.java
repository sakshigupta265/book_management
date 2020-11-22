package com.java.author.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.java.author.AuthorEntity;

@Transactional
@Repository

public class AuthorRepository implements AuthorRepositoryInterface {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<AuthorEntity> getAllAuthors() {
		String hql = "FROM AuthorEntity as auth ORDER BY auth.author_id";
		return (List<AuthorEntity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public AuthorEntity getAuthorById(int author_id) {
		return entityManager.find(AuthorEntity.class, author_id);
	}

	@Override
	public AuthorEntity addAuthor(AuthorEntity author) throws Exception {

		if (authorExists(author)) {
			throw new Exception("Author Details Already Exists");
		}
		entityManager.persist(author);
		return getAuthorById(author.getAuthor_id());
	}

	@Override
	public void updateAuthor(AuthorEntity author) {
		AuthorEntity auth = getAuthorById(author.getAuthor_id());
		auth.setName(author.getName());
		auth.setEmail_id(author.getEmail_id());
		entityManager.flush();
	}

	@Override
	public void deleteAuthor(int author_id) {
		entityManager.remove(getAuthorById(author_id));
	}

	@Override
	public boolean authorExists(AuthorEntity author) {
		// TODO Auto-generated method stub

		List<AuthorEntity> list = getAllAuthors();
		for (AuthorEntity a : list) {
			if (a.getName().equals(author.getName()) && a.getEmail_id().equals(author.getEmail_id())) {
				return true;
			}
		}
		return false;
	}
}
