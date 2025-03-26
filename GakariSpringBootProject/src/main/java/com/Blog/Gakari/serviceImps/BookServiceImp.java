package com.Blog.Gakari.serviceImps;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog.Gakari.forms.bookForms.BookAddForm;
import com.Blog.Gakari.forms.bookForms.BookEditForm;
import com.Blog.Gakari.models.Book;
import com.Blog.Gakari.repositories.BookRepository;
import com.Blog.Gakari.services.BookService;

@Service
public class BookServiceImp implements BookService{
	//public List<Book> bookList;
	
	//public BookServiceImp() {
	//	this.bookList = new ArrayList<Book>();
	//}
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getCurrentBookList() {
		// TODO Auto-generated method stub
		//return this.bookList;
		//System.out.println("----------search book query start----------");
		//bookRepository.searchBooks();
		//System.out.println("----------search book query end----------");
		return bookRepository.findAll();
	}

	@Override
	public void addOneNewBook(BookAddForm bookAddForm) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setBookId(UUID.randomUUID().toString());
		//book.setBookName(name);
		book.setBookName(bookAddForm.getBookName());
		//book.setBookAuthor(author);
		book.setBookAuthor(bookAddForm.getBookAuthor());
		//this.bookList.add(book);
		bookRepository.save(book);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Book getOneBook(Integer bookId) {
		// TODO Auto-generated method stub
		return bookRepository.getById(bookId);
	}

	@Override
	public void deleteOneBook(Integer bookId) {
		// TODO Auto-generated method stub
		//JPA自带方法
		//bookRepository.deleteById(bookId);
		//自定义SQL方法操作
		bookRepository.deleteBookById(bookId);
		
	}

	@Override
	public void editOneBook(Book book, BookEditForm bookEditForm) {
		// TODO Auto-generated method stub
		
		//JPA自带方法
		//book.setBookName(bookEditForm.getBookName());
		//book.setBookAuthor(bookEditForm.getBookAuthor()); 
		//bookRepository.saveAndFlush(book);
		//重写一个自定义SQL
		bookRepository.updateBookById(bookEditForm.getBookName(), bookEditForm.getBookAuthor(), Integer.valueOf(bookEditForm.getBookId()));
	}

	@Override
	public List<Book> search(String searchBookNameKeyword) {
		// TODO Auto-generated method stub
		return bookRepository.searchBooks(searchBookNameKeyword);
	}
}
