package com.Blog.Gakari.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Blog.Gakari.models.Book;

import jakarta.transaction.Transactional;

@Repository 
public interface BookRepository extends JpaRepository<Book,Integer > {
	@Query(value="SELECT id, book_serial_number, book_name, book_author FRoM book WHERE book_name LIKE CONCAT('%',?1,'%')",nativeQuery=true)
	List<Book> searchBooks(String keyword);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE book SET book_name=?1, book_author=?2 WHERE id=?3", nativeQuery=true)
	void updateBookById(String bookName, String bookAuthor, int bookId);
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM book WHERE id=?1",nativeQuery=true)
	void deleteBookById(int bookId);
}
