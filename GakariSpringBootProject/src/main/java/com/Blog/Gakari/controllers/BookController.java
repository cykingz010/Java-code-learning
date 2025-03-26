package com.Blog.Gakari.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Blog.Gakari.forms.bookForms.BookAddForm;
import com.Blog.Gakari.forms.bookForms.BookEditForm;
import com.Blog.Gakari.models.Book;
import com.Blog.Gakari.services.BookService;

@Controller
public class BookController {
	//public List<Book> bookList; //放到service imp里
	
	//public BookController() {
	//	this.bookList = new ArrayList<Book>();
		
		//测试数据，记得删除
		//for(int i=0;i<3;i++){
		//	Book book = new Book();
		//	book.setBookId(UUID.randomUUID().toString());
		//	book.setBookName("图书" + i);
		//	book.setBookAuthor("作者" + i);
		//	this.bookList.add(book);
		//}
	//}
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value="/book")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		//向mav里设置数据
		//mav.addObject("books",this.bookList);
		mav.addObject("books",bookService.getCurrentBookList());
		//向mav里设置要展示的页面
		mav.setViewName("book/index");
		
		return mav;
		//return "book/index";
	}
	
	@PostMapping(value="/book")
	public ModelAndView search(@RequestParam("bookName") String bookName) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("book/index");
		mav.addObject("books",bookService.search(bookName));
		return mav;
	} 
	
	@GetMapping(value="/book/add")
	public String add() {
		return "book/add"; 
	}
	
	@PostMapping(value="/book/add")
	//public String add(@RequestParam("bookName") String name, @RequestParam("bookAuthor") String author) {
	public String addAction(BookAddForm bookAddForm) {
		//System.out.println("bookName: "+ name);
		//System.out.println("bookAuthor: "+ author);
		//Book book = new Book();
		//book.setBookId(UUID.randomUUID().toString());
		//book.setBookName(name);
		//book.setBookName(bookAddForm.getBookName());
		//book.setBookAuthor(author);
		//book.setBookAuthor(bookAddForm.getBookAuthor());
		//this.bookList.add(book);
		bookService.addOneNewBook(bookAddForm);
		return "redirect:/book"; //重新定向到book的URL，也就是再执行一次getMapping的那个/book
	}
	
	@GetMapping(value="/book/view")
	public ModelAndView view(@RequestParam("bookId") String bookId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("book/view");
		mav.addObject("book",bookService.getOneBook(Integer.valueOf(bookId)));
		//Book book = bookService.getOneBook(Integer.valueOf(bookId));
		//return "book/view";
		return mav;
	}
	
	@GetMapping(value="/book/delete")
	public String delete(@RequestParam("bookId") String bookId) {
		bookService.deleteOneBook(Integer.valueOf(bookId));
		return "redirect:/book";
	} 
	

	
	@GetMapping(value="/book/edit")
	public ModelAndView edit(@RequestParam("bookId") String bookId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("book/edit");
		mav.addObject("book",bookService.getOneBook(Integer.valueOf(bookId)));
		return mav;
	} 
	
	@PostMapping(value="/book/edit")
	public String editAction(BookEditForm bookEditForm) {
		bookService.editOneBook(bookService.getOneBook(Integer.valueOf(bookEditForm.getBookId())),bookEditForm);
		return "redirect:/book";
	} 
	
}
