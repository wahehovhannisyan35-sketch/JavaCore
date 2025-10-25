package tnayin.libary;

import java.util.Scanner;

public class LibaryDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_TITLE = "3";
    private static final String PRINT_EXPENSIVE_BOOK = "4";
    private static final String SEARCH_BOOK_BY_PRICE = "5";
    private static final String DELETE_BOOK_BY_ID = "6";

    static void main() {

        boolean isRun = true;
        while (isRun) {
            PrintCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    Book expensiveBook = bookStorage.getBookByMaxPrice();
                    System.out.println(expensiveBook);
                    break;
                case SEARCH_BOOK_BY_PRICE:
                    System.out.println("Please input frist price");
                    String start = scanner.nextLine();
                    System.out.println("Please input last price");
                    String end = scanner.nextLine();
                    bookStorage.getBookByPrice(start, end);
                    break;
                case DELETE_BOOK_BY_ID:
                    System.out.println("Please input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    bookStorage.deleteById(id);
                    break;
                default:
                    System.err.println("Wrong command! try again");
            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book title");
        String bookTitle = LibaryDemo.scanner.nextLine();
        System.out.println("Please input authorName");
        String authorName = LibaryDemo.scanner.nextLine();
        System.out.println("price");
        double price = Double.parseDouble(LibaryDemo.scanner.nextLine());
        Book book = new Book(bookTitle, authorName, price);
        LibaryDemo.bookStorage.add(book);
        System.out.println("Book added Succesfully");
    }

    private static void PrintCommands() {
        System.out.println("Please input  " + EXIT + " for EXIT");
        System.out.println("Please input  " + ADD_BOOK + " ADD_BOOK");
        System.out.println("Please input  " + PRINT_ALL_BOOKS + " PRINT_ALL_BOOKS");
        System.out.println("Please input  " + SEARCH_BOOK_BY_TITLE + " SEARCH_BOOK_BY_TITLE");
        System.out.println("Please input  " + PRINT_EXPENSIVE_BOOK + "  PRINT_EXPENSIVE_BOOK");
        System.out.println("Please input  " + SEARCH_BOOK_BY_PRICE + "  SEARCH_BOOK_BY_PRICE");
        System.out.println("Please input  " + DELETE_BOOK_BY_ID + "  DELETE_BOOK_BY_ID");
    }

}

