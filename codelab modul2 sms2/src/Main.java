

class Book {
    // Encapsulate Field
    private String title;
    private String author;
    private int stock;
    private double price;

    // Introduce Constant
    private static final double DISCOUNT_RATE = 0.1;

    // Getter dan Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Extract Method
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Stock: " + stock);
        System.out.println("Price after discount: " + calculateDiscount());
    }
}

class Library {
    // Encapsulate Field
    private Book book;
    private String location;

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayLibrary() {
        System.out.println("Library location: " + location);
        book.displayInfo();
    }
}

// Move Method: main dipindahkan ke class Main
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Clean Code");
        book.setAuthor("Robert C. Martin");
        book.setStock(5);
        book.setPrice(150000);

        Library library = new Library();
        library.setBook(book);
        library.setLocation("Malang");

        library.displayLibrary();
    }
}
