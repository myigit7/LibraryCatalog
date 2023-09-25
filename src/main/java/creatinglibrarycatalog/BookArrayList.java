package creatinglibrarycatalog;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookArrayList {

    public static void main(String[] args) {
        // Kullanıcıdan isteyeceğimiz değerlerin fonc. and method larını olusturuyoruz.

        System.out.println("Please enter a title of the book : ");
        Scanner titleScanner = new Scanner(System.in);
        String title = titleScanner.next();

        System.out.println("Please enter a Name of the book : ");
        Scanner authorScanner = new Scanner(System.in);
        String author = authorScanner.nextLine();

        System.out.println("Please enter a Publication Year (PY) of the book : ");
        Scanner publicationYearScanner = new Scanner(System.in);
        String publicationYear = publicationYearScanner.next();

        //availability ile alakalı if sayesinde kontrol edebileceğimiz bir şey yazabiliriz. Buraya ekleyeceğim.

        List<Object> bookList = Arrays.asList(title, author, publicationYear);

        System.out.println(bookList);


    }

}