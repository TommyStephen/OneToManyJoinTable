package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import study.model.Author;
import study.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping("/author/saveAuthorWithBook")
	public Author saveAuthorWithBook(@RequestBody Author author) {

		return authorService.save(author);
	}
	

}
