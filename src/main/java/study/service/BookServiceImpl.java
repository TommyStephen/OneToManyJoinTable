package study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.model.Author;
import study.model.Book;
import study.repository.AuthorRepository;
import study.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private AuthorRepository authorRepository;

	@Override
	public Book save(Book book, long authorId) {
		
		Author author = authorRepository.findById(authorId).orElseThrow();
		book.setAuthor(author);
		return bookRepository.save(book);
	}
    
    
}
