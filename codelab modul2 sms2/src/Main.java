

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

}