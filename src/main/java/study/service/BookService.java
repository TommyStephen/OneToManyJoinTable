package study.service;

import study.model.Book;

public interface BookService {

Book save(Book book, long authorId);

}
