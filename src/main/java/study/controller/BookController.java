package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import study.model.Book;
import study.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/book/saveBook/{authorId}")
	public Book addBookToAuthor(@PathVariable Long authorId, @RequestBody Book book) {
		return bookService.save(book, authorId);
	}
	
	
}
