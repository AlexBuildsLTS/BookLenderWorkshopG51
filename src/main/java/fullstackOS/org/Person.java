package fullstackOS.org;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> loanedBooks;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.loanedBooks = new ArrayList<>();
    }

    private int getNextId() {
        return ++sequencer;
    }

    public String getPersonInformation() {
        return "Person ID: " + id + ", Name: " + firstName + " " + lastName;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getLoanedBooks() {
        return loanedBooks;
    }
}