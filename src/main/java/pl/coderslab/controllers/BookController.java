package pl.coderslab.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.models.Book;
import pl.coderslab.service.BookService;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/books")
@Slf4j
@AllArgsConstructor
@Controller
public class BookController {
    BookService<Book> service;



    @RequestMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = service.findAll();
        model.addAttribute("books", books);
        return "all-books";
    }
    @RequestMapping("/add")
    public String create(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }
    @PostMapping("/add")
    public String create(@Valid Book book, BindingResult result) {
        if(result.hasErrors()){
            return "add-book";
        }
        service.add(book);
        return "redirect:/books/all";
    }
    @RequestMapping(path="/edit/{id}")
    public String edit(Model model,@PathVariable long id){
        model.addAttribute("book", service.getById(id));
        return "add-book";
    }
    @PostMapping("/edit/{id}")
    public String editSave(@Valid Book book, BindingResult result) {
        if(result.hasErrors()){
            return "add-book";
        }
        service.add(book);
        return "redirect:/books/all";
    }

    @GetMapping("/show/{id}")
    public String getById(@PathVariable Long id, Model model) {

        model.addAttribute("book", service.getById(id));
        return "book";
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("")
    public String add(@RequestParam String isbn, @RequestParam String title, @RequestParam String author, @RequestParam String publisher, @RequestParam String type) {
        service.add(new Book(isbn, title, author, publisher, type));
        return "<a href=\"/\">home</a>";
    }


    @PutMapping(value="", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Book book)  {
        service.update(book);
    }



}


