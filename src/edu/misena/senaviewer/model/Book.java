package edu.misena.senaviewer.model;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String edititionDate;
    private String editorial;
    private List<String> authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    // Constructor
    public Book(String title, String edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
        this.authors = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getEdititionDate() { return edititionDate; }
    public void setEdititionDate(String edititionDate) { this.edititionDate = edititionDate; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public List<String> getAuthors() { return authors; }
    public void setAuthors(List<String> authors) { this.authors = authors; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isReaded() { return readed; }
    public void setReaded(boolean readed) { this.readed = readed; }

    public int getTimeReaded() { return timeReaded; }
    public void setTimeReaded(int timeReaded) { this.timeReaded = timeReaded; }

}