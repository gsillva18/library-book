package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.component.RegistryBook;
import org.framework.rodolfo.freire.git.library.component.SearchBook;
import org.framework.rodolfo.freire.git.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    final
    RegistryBook registryBook;

    final
    SearchBook searchBook;

    public BookController(RegistryBook registryBook, SearchBook searchBook) {
        this.registryBook = registryBook;
        this.searchBook = searchBook;
    }

}
