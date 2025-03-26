package com.Blog.Gakari.services;

import java.util.List;

import com.Blog.Gakari.forms.bookForms.BookAddForm;
import com.Blog.Gakari.forms.bookForms.BookEditForm;
import com.Blog.Gakari.models.Book;

public interface BookService {
	public List<Book> getCurrentBookList();
	public List<Book> search(String searchBookNameKeyword);
	public void addOneNewBook(BookAddForm bookAddForm);
	public Book getOneBook(Integer bookId);
	public void deleteOneBook(Integer bookId);
	public void editOneBook(Book book, BookEditForm bookEditForm);
	
}
