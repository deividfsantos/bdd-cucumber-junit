package com.deividsantos.bdd.dto;

public class Book {
    private Integer code;
    private String name;
    private Integer pages;
    private String genre;
    private String author;

    public Book() {
    }

    public Book(Integer code, String name, Integer pages, String genre, String author) {
        this.code = code;
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}