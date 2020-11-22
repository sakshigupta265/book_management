package com.java.book.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.java.book.BookEntity;

@Transactional
@Repository

public class BookRepository implements BookRepositoryInterface {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<BookEntity> getAllBooks() {
		String hql = "FROM BookEntity as book ORDER BY book.book_id";
		return (List<BookEntity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public BookEntity getBookById(int book_id) {
		return entityManager.find(BookEntity.class, book_id);
	}

	@Override
	public BookEntity addBook(BookEntity book) throws Exception {

		if (bookExists(book)) {
			throw new Exception("Book Details Already Exists!");
		}
		entityManager.persist(book);
		return getBookById(book.getBook_id());

	}

	@Override
	public void updateBook(BookEntity book) {
		BookEntity itm = getBookById(book.getBook_id());
		itm.setTitle(book.getTitle());
		itm.setDescription(book.getDescription());
		itm.setPublished(book.getPublished());
		itm.setAuthor(book.getAuthor());
		entityManager.flush();
	}

	@Override
	public void deleteBook(int book_id) {
		entityManager.remove(getBookById(book_id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookEntity> groupByAuthorId(int author_id) {
		String hql = "FROM BookEntity where author_id = " + author_id;
		return (List<BookEntity>) entityManager.createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookEntity> groupByAuthorName(String author_name) {
		String hql = "FROM BookEntity where author.name = '" + author_name + "'";
		return (List<BookEntity>) entityManager.createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookEntity> groupByBookDescription(String description) {
		String hql = "FROM BookEntity where description = '" + description + "'";
		return (List<BookEntity>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public boolean bookExists(BookEntity book) {
		// TODO Auto-generated method stub

		List<BookEntity> list = getAllBooks();
		for (BookEntity b : list) {
			if (b.getTitle().equals(book.getTitle())) {
				return true;
			}
		}
		return false;
	}

}
