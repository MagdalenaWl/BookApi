package pl.coderslab.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.models.Book;
import pl.coderslab.repositories.BookRepository;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class JpaBookService implements BookService<Book> {
    private final BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);

    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }
}
