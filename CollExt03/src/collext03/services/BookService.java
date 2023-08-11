/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext03.services;

import collext03.entities.Book;
import java.util.HashSet;

/**
 *
 * @author blue_
 */
public class BookService {

    private final HashSet<Book> _books = new HashSet();

    public Book createBook(String title, String author, int copies, int borrowed) {
        return new Book(title, author, copies, borrowed);
    }

    public void addBook(String title, String author, int copies, int borrowed) {
        Book b = createBook(title, author, copies, borrowed);
        _books.add(b);
    }

    public boolean isBooksFilled() {
        return !_books.isEmpty();
    }

    public Book findByTitle(String title) {
        if (isBooksFilled()) {
            for (Book b : _books) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    return b;
                }
            }
        } else {
            System.out.println("Empty Library!");
        }
        return null;
    }

    public boolean borrowBook(String title) {
        Book foundBook = findByTitle(title);
        boolean isBorrowedSuccess = false;
        if (foundBook != null) {
            if (foundBook.getBorrowedCopies() < foundBook.getCopies()) {
                foundBook.setBorrowedCopies(foundBook.getBorrowedCopies() + 1);
                isBorrowedSuccess = true;
                System.out.println("a copy of " + title + " was borrowed successfully");
            } else {
                System.out.println("All copies are already borrowed!");
            }
        } else {
            System.out.println("The book " + title + " doesn't exist!");
        }
        return isBorrowedSuccess;
    }

    public boolean returnBook(String title) {
        Book foundBook = findByTitle(title);
        boolean isReturnSuccess = false;
        if (foundBook == null) {
            System.out.println("Book not in library");

        } else {
            if (foundBook.getBorrowedCopies() == 0) {
                System.out.println("Book was not borrowed from this library");
                return isReturnSuccess;

            } else {
                foundBook.setBorrowedCopies(foundBook.getBorrowedCopies() - 1);
                System.out.println("a copy of " + title + " was returned successfully");
                isReturnSuccess = true;
                return isReturnSuccess;

            }
        }
        return isReturnSuccess;
    }

    public void displayBooks() {
        if (isBooksFilled()) {
            System.out.println("******************************************");
            _books.forEach(b -> {
                System.out.print("Author: " + b.getAuthor() + " Title: " + b.getTitle() + " Copies: " + b.getCopies() + " Borrowed: " + b.getBorrowedCopies());
                System.out.println();
                System.out.println("-----------------------------------------------------");
            });
            System.out.println("******************************************");
        } else {
            System.out.println("Empty Library");
        }
    }

}
