package creatinglibrarycatalog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("1 :");
        Scanner titleScanner = new Scanner(System.in);
        String title1 = titleScanner.next();

        System.out.println("2 :");
        Scanner authorScanner = new Scanner(System.in);
        String author1 = authorScanner.nextLine();

        System.out.println("3 :");
        Scanner publicationYearScanner = new Scanner(System.in);
        int publicationYear1 = publicationYearScanner.nextInt();

        Book book1 = new Book(title1,author1,publicationYear1);
        book1.getAuthor();
        book1.getTitle();
        book1.getPublicationYear();

        List<? extends Serializable> bookList = Arrays.asList(book1.getTitle(),book1.getAuthor(),book1.getPublicationYear());

       String name12 = book1.checkTheAvailability(book1.getAuthor(), book1.publicationYear);

        System.out.print(name12);







    }//Main sonu



    }//Calss sonu

