package creatinglibrarycatalog;

import java.util.Scanner;

public class Book extends BookRunner{

    String title;
    String author;
    Integer publicationYear;
    Boolean availability = true;
    public Book(String title, String author,Integer publicationYear){
       this.publicationYear= publicationYear;
       this.title= title;
       this.author= author;
    }
    public String getTitle  (){
    return title;
    }

    public String getAuthor  (){
    return author;
    }

    public Integer getPublicationYear (){
        return publicationYear;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public String checkTheAvailability(String name, int year){
        if(name==this.title){
           System.out.println(availability);
       } else if (name==this.author) {
           System.out.println(availability);
       } else if (year==publicationYear) {
           System.out.println(availability);
       }else {
           System.out.println("Invalid book :( ...");
       }
        return name;
    }






















    }






