package com.example.project.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_category")
public class BookCategory extends BaseEntity  {
	
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private Set<Book> books;

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
