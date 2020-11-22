package com.java.book;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.java.author.AuthorEntity;

@Entity
@Table(name = "book")
public class BookEntity {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private Date published;

	@OneToOne(targetEntity = AuthorEntity.class)
	@JoinColumn(name = "author_id")
	private AuthorEntity author;

	public BookEntity() {

	}

	public BookEntity(int book_id, String title, String description, Date published, AuthorEntity author) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.description = description;
		this.published = published;
		this.author = author;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public AuthorEntity getAuthor() {
		return author;
	}

	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}

}
