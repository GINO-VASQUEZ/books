package pe.edu.upao.booksVS.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "books")


public class Book {

    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String description;


    @Column(nullable = false)
    String author;


    @Column(name = "imagen_url")
    String imageUrl;

    @Column( name = "create_at")
    LocalDateTime createAT;


    @Column( name = "updated_at")
    private LocalDateTime updatedAT;

    public Book() {
    }

    public Book(Long id, String title, String description, String author, String imageUrl, LocalDateTime createAT, LocalDateTime updatedAT) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUrl = imageUrl;
        this.createAT = createAT;
        this.updatedAT = updatedAT;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreateAT() {
        return createAT;
    }

    public void setCreateAT(LocalDateTime createAT) {
        this.createAT = createAT;
    }

    public LocalDateTime getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(LocalDateTime updatedAT) {
        this.updatedAT = updatedAT;
    }
}

