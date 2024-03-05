package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    private int bNo;
    private String title;
    private int category;
    private String author;

    public void BookDTO(){}

    public BookDTO(int bNo,String title, int category, String author) {
        this.bNo = bNo;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", author='" + author + '\'' +
                '}';
    }

}
