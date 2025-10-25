package tnayin.libary;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;
    private int id = 1;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size] = book;
        books[size].setQuantity(size + 1);
        books[size++].setId(id++);
    }

    private void extend() {
        Book[] tmp = new Book[10 + size];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("Books quantity=" + books[size - 1].getQuantity());
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
        System.out.println("Books quantity =" + books[size - 1].getQuantity());
    }

    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;

        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        System.out.println("Books quantity=" + books[size - 1].getQuantity());
        return books[maxIndex];
    }

    public void getBookByPrice(String start, String end) {
        int num_Start = Integer.parseInt(start);
        int num_End = Integer.parseInt(end);
        for (int i = 0; i < size; i++) {
            if (num_Start < books[i].getPrice() && books[i].getPrice() < num_End) {
                System.out.println(books[i]);
            }

        }
        System.out.println("Books quantity=" + books[size - 1].getQuantity());
    }

    public void deleteById(int id) {
        for (int i = id - 1; i < size; i++) {
            if (i != size - 1) {
                books[i] = books[i + 1];
                books[i].setId(i + 1);
            }
        }
        this.id = size;
        books[--size].setQuantity(size);
        print();
    }
}


