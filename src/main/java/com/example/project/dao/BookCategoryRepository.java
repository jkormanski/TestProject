package com.example.project.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.project.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface BookCategoryRepository extends PagingAndSortingRepository<BookCategory, Long> {

}
