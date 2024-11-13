/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.librarywebservice;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PUT;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.MediaType;
import com.mycompany.librarywebservice.Models.Library;
import com.mycompany.librarywebservice.Models.Book;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import java.util.ArrayList;

/**
 * REST Web Service
 *
 * @author Daniel García
 */
@Path("/library")
@RequestScoped
public class LibraryResource {
    
    Library library = new Library();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LibraryResource
     */
    public LibraryResource() {
    }
    
    @GET
    @Path("/isbn/{ISBN}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBookByISBN(@PathParam("ISBN") String ISBN) {
        Book b = library.searchBookISBN(ISBN);
        if(b == null){
            return "No book found with that ISBN";
        }
        return b.toString();
    }
    
    @GET
    @Path("/title&year/{Title}/{Year}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBookByTitleYear(@PathParam("Title") String title, @PathParam("Year") String year) {
        int yearNumb = 0;
        String message = "";
        try{
            yearNumb = Integer.parseInt(year);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        ArrayList<Book> foundBooks = library.searchBookTitleYear(title, yearNumb);
        if(!foundBooks.isEmpty()){
            for(Book b : foundBooks){
                message += "\n" + b.toString();
            }
        }else{
            message = "No books found";
        }
        return message;
    }
    
    @GET
    @Path("/Query")
    @Produces(MediaType.TEXT_PLAIN)
    public String getBookByQuery(@QueryParam("isbn") String ISBN, @QueryParam("year") int year, @QueryParam("title") String title) {
        return "ISBN: " + ISBN + " Year: " + year + " Title: " + title;
    }
    
    @PUT
    @Path("/asda")
    @Produces(MediaType.TEXT_PLAIN)
    public String updateData(){
        return "";
    }
}
