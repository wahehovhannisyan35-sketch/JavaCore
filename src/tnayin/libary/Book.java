package tnayin.libary;

import java.util.Objects;

public class Book {
    private String title;
    private String authorname;
    private double price;
    private int quantity;
    private int id;

    public Book(String title, String authorname, double price) {
        this.title = title;
        this.authorname = authorname;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && id == book.id && Objects.equals(title, book.title) && Objects.equals(authorname, book.authorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorname, price, quantity, id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorname='" + authorname + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
