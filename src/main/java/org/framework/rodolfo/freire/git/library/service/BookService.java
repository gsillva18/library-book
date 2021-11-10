package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.component.SearchBook;
import org.framework.rodolfo.freire.git.library.model.Book;
import org.framework.rodolfo.freire.git.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    final
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public Book save(Book book){

        return bookRepository.save(book);
    }

    public Optional<Book> searchByName(String bookName) {

         return bookRepository.findByBookNome(bookName);
    }
    
    public List<Book> listAll(){
        
        return bookRepository.findAll();
    }
    
    public Book update(Book book){

        return bookRepository.save(book);
    }

    public void delete(Book book){

        bookRepository.delete(book);
    }
}
