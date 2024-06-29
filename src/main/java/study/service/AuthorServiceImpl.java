package study.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.model.Author;
import study.model.Book;
import study.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Transactional
	@Override
	public Author save(Author author) {
		// Ensure each book has the author set
		for(Book book :author.getBooks()) {
			book.setAuthor(author); 
		}
		return authorRepository.save(author);
	}

}
