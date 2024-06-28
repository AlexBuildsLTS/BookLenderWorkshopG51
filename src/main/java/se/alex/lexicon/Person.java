package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int sequencer = 0;

    private final int id;
    private String firstName;
    private String lastName;
    private final List<Book> loanedBooks;

    public Person(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty.");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty.");
        }

        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.loanedBooks = new ArrayList<>();
    }

    private int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        if (!book.isAvailable()) {
            throw new IllegalArgumentException("Book is not available.");
        }

        loanedBooks.add(book);
        book.setBorrower(this);
    }

    public void returnBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }

        if (loanedBooks.remove(book)) {
            book.setBorrower(null);
        } else {
            System.out.println("This book was not loaned by this person.");
        }
    }

    public String getPersonInformation() {
        return "Person{ id=" + id + ", firstName='" + firstName + "', lastName='" + lastName +
                "', number of borrowedBooks=" + loanedBooks.size() + '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    public List<Book> getLoanedBooks() {
        return loanedBooks;
    }
}
