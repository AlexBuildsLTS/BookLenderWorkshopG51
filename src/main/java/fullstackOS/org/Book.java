package fullstackOS.org;

public class Book {
        private String id;
        private String title;
        private String author;
        private boolean available;
        private Person borrower;

        public Book(String id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.available = true;
            this.borrower = null;
        }

        public String getBookInformation() {
            return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
        }

        // the getter and setters
        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public Person getBorrower() {
            return borrower;
        }

        public void setBorrower(Person borrower) {
            this.borrower = borrower;
        }
    }
}