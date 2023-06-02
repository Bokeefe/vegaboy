package com.example.vegaboy.controller;

import com.example.vegaboy.model.Book;
import com.example.vegaboy.repository.BookRepository;
import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
  private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
  /*thia maps allBooks schema to the query to be used
   * findAll() is  a spring boot methid that returns every row of that type in the DB
   * */
//  @SchemaMapping(typeName = "Query", value = "allBooks")
    @QueryMapping
  public List<Book> allBooks() {
    return bookRepository.findAll();
  }
}
