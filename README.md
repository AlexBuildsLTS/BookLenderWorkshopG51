# Book Lender System

## Overview

The Book Lender System is a simple Java application that simulates a book lending process. It allows a person to loan and return books, demonstrating the use of object-oriented programming principles such as encapsulation and maintaining relationships between classes.

## Project Structure

The project consists of three main classes:

1. **Person**: Represents a person who can loan books.
2. **Book**: Represents a book that can be loaned to a person.
3. **App**: The main class that runs the application, taking user input and demonstrating the functionality of the system.

### Person Class

The `Person` class has the following attributes and methods:

- **Attributes**:
    - `id`: Unique identifier for the person.
    - `firstName`: First name of the person.
    - `lastName`: Last name of the person.
    - `loanedBooks`: A list of books that the person has loaned.

- **Methods**:
    - `Person(String firstName, String lastName)`: Constructor to create a new person with a first name and last name.
    - `loanBook(Book book)`: Loans a book to the person if it is available.
    - `returnBook(Book book)`: Returns a loaned book.
    - `getPersonInformation()`: Returns a string with the person's information.
    - Getters and setters for all attributes to ensure encapsulation.

### Book Class

The `Book` class has the following attributes and methods:

- **Attributes**:
    - `id`: Unique identifier for the book.
    - `title`: Title of the book.
    - `author`: Author of the book.
    - `available`: Availability status of the book.
    - `borrower`: The person who has loaned the book.

- **Methods**:
    - `Book(String title, String author)`: Constructor to create a new book with a title and author.
    - `Book(String title, String author, Person borrower)`: Constructor to create a new book with a title, author, and borrower.
    - `getBookInformation()`: Returns a string with the book's information.
    - Getters and setters for all attributes to ensure encapsulation.

### App Class

The `App` class contains the `main` method and demonstrates the functionality of the system by:

1. **Creating Instances**:
    - The application prompts the user to enter details for a person and a book.
    - Creates a `Person` object with the entered first name and last name.
    - Creates a `Book` object with the entered title and author.

2. **Loaning a Book**:
    - Loans the created book to the person using the `loanBook` method.
    - Displays the person and book information before and after the loan.

3. **Returning the Book**:
    - Returns the book using the `returnBook` method.
    - Displays the person and book information after the return.

### How to Run

- git clone <repository-url>
- cd book-lender

