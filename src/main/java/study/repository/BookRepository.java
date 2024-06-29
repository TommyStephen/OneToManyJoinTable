package study.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import study.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
}
