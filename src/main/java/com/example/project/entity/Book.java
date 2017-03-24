package com.example.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Book extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST})
    @JoinColumn(name = "book_category_id")
	@RestResource(exported = false)
	private BookCategory bookCategory;

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public boolean isNew() {
		return null == getId() && bookCategory.getId() == null;
	}
}
