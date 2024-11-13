/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.librarywebservice.Models;

import java.util.ArrayList;

/**
 * @author Daniel García
 * 13/11/2024
 */
public class Library {
    private ArrayList<Book> listBooks;

    public Library() {
        this.listBooks = new ArrayList<>();
        //Add initial four elements
        this.listBooks.add(new Book(1, 1974, "Catcher on the rye", "J.D. Salinger", "ASBF45422334"));
        this.listBooks.add(new Book(2, 1979, "Confederacy of dunces", "John Kennedy Toole", "ASBF6745656"));
        this.listBooks.add(new Book(3, 1952, "The grapes of wrath", "John Steinback", "ASBF6697715"));
        this.listBooks.add(new Book(4, 1972, "Pride and Prejudice", "Jane Austen", "ASBF33985112"));
        this.listBooks.add(new Book(5, 1972, "Another book", "Jane Austen", "ASBF33185112"));
        this.listBooks.add(new Book(6, 1972, "One more book", "Jane Austen", "ASBF35985112"));
    }
    
    public ArrayList<Book> getListBooks() {
        return listBooks;
    }
    
    public Book searchBookISBN(String ISBN){
        if(!listBooks.isEmpty()){
            for(Book b : listBooks){
                if(b.getISBN().equals(ISBN))
                    return b;
            }
        }
        return null;
    }
    
    public ArrayList<Book> searchBookTitleYear(String title, int year){
        ArrayList<Book> foundBooks = new ArrayList<>();
        if(!listBooks.isEmpty()){
            for(Book b : listBooks){
                if(b.getTitle().equals(title) || b.getYear() == year)
                    foundBooks.add(b);
            }
        }
        return foundBooks;
    }
}
