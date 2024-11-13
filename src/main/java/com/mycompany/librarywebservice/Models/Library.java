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
        this.listBooks.add(new Book(1, "Catcher on the rye", "J.D. Salinger", "ASBF45422334"));
        this.listBooks.add(new Book(2, "Confederacy of dunces", "John Kennedy Toole", "ASBF6745656"));
        this.listBooks.add(new Book(3, "The grapes of wrath", "John Steinback", "ASBF6697715"));
        this.listBooks.add(new Book(4, "Pride and Prejudice", "Jane Austen", "ASBF33985112"));
    }

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }
}
