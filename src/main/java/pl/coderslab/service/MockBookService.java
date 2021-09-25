package pl.coderslab.service;

import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.coderslab.models.Book;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class MockBookService implements BookService<Book> {
    List<Book> bookList = new ArrayList<>();


    @Override
    public List<Book> findAll() {
        return bookList;
    }

    @Override
    public Book getById(Long id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void update(Book book) {
        for (Book book1 : bookList) {
            if (book1.getId() == book.getId()) {
                bookList.set(bookList.indexOf(book1), book);
                return;
            }
        }
    }

    @Override
    public void delete(Long id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                bookList.remove(book);
            }
        }
    }

    @Override
    public void add(Book book) {
        bookList.add(book);
    }

}
