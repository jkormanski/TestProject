package com.example.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Book extends BaseEntity {
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_category_id")
	@RestResource(exported = false)
	private BookCategory bookCategory;

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
}
