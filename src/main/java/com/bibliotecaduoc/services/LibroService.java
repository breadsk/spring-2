package com.bibliotecaduoc.services;

import com.bibliotecaduoc.model.Libro;
import com.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getBooks() {
        return libroRepository.getAllLibros();
    }

    public Libro saveBook(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getBookById(int id) {
        return libroRepository.getLibroById(id);
    }

    public Libro updateBook(Libro libro) {
        return libroRepository.actualizarLibro(libro);
    }

    public String deleteBook(int id) {
        libroRepository.eliminar(id);
        return "Producto eliminado";
    }

}
