package pe.edu.upao.booksVS.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.upao.booksVS.models.Book;
import pe.edu.upao.booksVS.repositories.BookRepository;

import java.time.LocalDateTime;

@Service

public class BookService {

    public final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(String title, String author, String description, MultipartFile image) {
        return bookRepository.save(new Book(null, title, author, description, "", LocalDateTime.now(), LocalDateTime.now()));
    }
}
