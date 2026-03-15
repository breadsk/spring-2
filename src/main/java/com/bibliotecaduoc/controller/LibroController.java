package com.bibliotecaduoc.controller;

import com.bibliotecaduoc.model.Libro;
import com.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getBooks() {
        return libroService.getBooks();
    }

    @PostMapping
    public Libro saveBook(@RequestBody Libro libro) {
        return libroService.saveBook(libro);
    }

    @GetMapping("{id}")
    public Libro findBookById(@PathVariable int id) {
        // El id lo usaremos mas adelante
        return libroService.getBookById(id);
    }

    @PutMapping("{id}")
    public Libro updateBook(@PathVariable int id, @RequestBody Libro libro) {
        // el id lo usaremos mas adelante
        return libroService.updateBook(libro);
    }

    @DeleteMapping("{id}")
    public String deleteBook(@PathVariable int id) {
        return libroService.deleteBook(id);
    }

}
