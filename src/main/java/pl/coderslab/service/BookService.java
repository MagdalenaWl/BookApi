package pl.coderslab.service;

import java.util.List;

public interface BookService<T>{

    List<T> findAll();
    T getById(Long id);
    void update(T t);
    void delete(Long id);
    void add(T t);

}
