package ru.netology;

public class Book extends Product { //класс книг

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Book(int id, String productName, int productPrice, String writer) {
        super(id, productName, productPrice);
        this.writer = writer;
    }

    private String writer; //автор


}
