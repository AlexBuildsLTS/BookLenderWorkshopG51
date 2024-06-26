package fullstackOS.org;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Person's name
        String firstName;
        String lastName;
        do {
            System.out.println("Enter first name of the person:");
            firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                System.out.println("First name cannot be empty. Please try again.");
            }
        } while (firstName.isEmpty());

        do {
            System.out.println("Enter last name of the person:");
            lastName = scanner.nextLine();
            if (lastName.isEmpty()) {
                System.out.println("Last name cannot be empty. Please try again.");
            }
        } while (lastName.isEmpty());

        // Create a person instance
        Person person = new Person(firstName, lastName);
        // Display person information
        System.out.println(person.getPersonInformation());

        // Input Book details with validation
        String bookId;
        String bookTitle;
        String bookAuthor;
        do {
            System.out.println("Enter the book ID:");
            bookId = scanner.nextLine();
            if (bookId.isEmpty()) {
                System.out.println("Book ID cannot be empty. Please try again.");
            }
        } while (bookId.isEmpty());

        do {
            System.out.println("Enter the book title:");
            bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                System.out.println("Book title cannot be empty. Please try again.");
            }
        } while (bookTitle.isEmpty());

        do {
            System.out.println("Enter the book author:");
            bookAuthor = scanner.nextLine();
            if (bookAuthor.isEmpty()) {
                System.out.println("Book author cannot be empty. Please try again.");
            }
        } while (bookAuthor.isEmpty());

        // Create a book instance
        Book book = new Book(bookId, bookTitle, bookAuthor);
        // Display book information
        System.out.println(book.getBookInformation());

        // Loan a book to the person
        person.loanBook(book);

        // Display person information after borrowing the book
        System.out.println(person.getPersonInformation());
        // Display book information after borrowing the book
        System.out.println(book.getBookInformation());

        // Display loaned books
        System.out.println("Loaned Books:");
        for (Book loanedBook : person.getLoanedBooks()) {
            System.out.println(loanedBook.getBookInformation());
        }

        // Return the borrowed book
        person.returnBook(book);

        // Display person information after returning the book
        System.out.println(person.getPersonInformation());
        // Display book information after returning the book
        System.out.println(book.getBookInformation());
    }
}
