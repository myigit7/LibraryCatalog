Problem: Creating a Library Catalog

You are tasked with creating a library catalog system in Java using Object-Oriented Programming principles. The catalog should be able to store and manage information about books, including their title, author, publication year, and availability.

Here are the specific requirements:

Create a Book class with the following attributes:

title (String): The title of the book.
author (String): The author of the book.
publicationYear (int): The year the book was published.
available (boolean): A flag indicating whether the book is available for borrowing.
Implement constructors for the Book class to initialize its attributes.

Create a Library class that maintains a collection of books. This class should have the following methods:

addBook(Book book): Adds a book to the library's collection.
borrowBook(String title): Marks a book with the specified title as unavailable.
returnBook(String title): Marks a book with the specified title as available.
displayAvailableBooks(): Displays a list of all available books in the library.
displayUnavailableBooks(): Displays a list of all unavailable (borrowed) books in the library.
Ensure that the Library class uses an appropriate data structure (e.g., an ArrayList) to store the collection of books.

Create a LibraryCatalog class that contains the main method. In the main method, demonstrate how to use the Library class to perform the following actions:

Add several books to the library catalog.
Display the list of available books.
Borrow a book.
Display the list of available and unavailable books again.
Return a borrowed book.
Display the list of available and unavailable books once more.
Remember to use proper encapsulation and follow OOP principles while implementing this system. Feel free to include any additional features or enhancements you think would be useful for a library catalog system.

Please let me know if you'd like further assistance with any specific part of the problem or if you have any questions!