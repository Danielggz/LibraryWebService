/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.librarywebservice.Models;

/**
 * @author Daniel García
 * 13/11/2024
 */
public class Book {
    private int id, year;
    private String title, author, ISBN;

    public Book(int id, int year, String title, String author, String ISBN) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book info: \n" + "Id: " + id + "\nYear: " + year + "\nTitle: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN;
    }
    
    
}
