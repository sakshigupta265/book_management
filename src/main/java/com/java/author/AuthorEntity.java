package com.java.author;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GenerationType;

@Entity
@Table(name = "author")
public class AuthorEntity {

	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_id;

	@Column(name = "name")
	private String name;

	@Column(name = "email_id")
	private String email_id;

	public AuthorEntity() {

	}

	public AuthorEntity(int author_id, String name, String email_id) {
		super();
		this.author_id = author_id;
		this.name = name;
		this.email_id = email_id;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
