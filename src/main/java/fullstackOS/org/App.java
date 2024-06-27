package fullstackOS.org;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Person's name with validation
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
        System.out.println("Person ID: " + person.getId());
        System.out.println(person.getPersonInformation());

        // Update person's first and last name to demonstrate setters
        person.setFirstName("UpdatedFirstName");
        person.setLastName("UpdatedLastName");
        System.out.println("Updated person information:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        // Input Book details
        String bookTitle;
        String bookAuthor;
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
        Book book = new Book(bookTitle, bookAuthor);
        // Display book information using getters
        System.out.println("Book ID: " + book.getId());
        printBookInformation(book);

        // Loaning the book to person
        person.loanBook(book);

        // Display person information after borrowing the book
        System.out.println("Person information after borrowing a book:");
        System.out.println("Person ID: " + person.getId());
        System.out.println(person.getPersonInformation());

        // Display book information after borrowing the book
        System.out.println("Book Information After Loan:");
        System.out.println("Book ID: " + book.getId());
        printBookInformation(book);

        // Display loaned books
        System.out.println("Loaned Books:");
        for (Book loanedBook : person.getLoanedBooks()) {
            printBookInformation(loanedBook);
        }

        // Return the borrowed book
        person.returnBook(book);

        // Display person information after returning the book
        System.out.println("Person information after returning the book:");
        System.out.println("Person ID: " + person.getId());
        System.out.println(person.getPersonInformation());

        // Display book information after returning the book
        System.out.println("Book Information After Return:");
        System.out.println("Book ID: " + book.getId());
        printBookInformation(book);
    }

    private static void printBookInformation(Book book) {
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Available: " + book.isAvailable());
        if (book.getBorrower() != null) {
            System.out.println("Borrower: " + book.getBorrower().getFirstName() + " " + book.getBorrower().getLastName());
        } else {
            System.out.println("Borrower: None");
        }
    }
}
