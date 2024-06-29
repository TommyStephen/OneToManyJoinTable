package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
