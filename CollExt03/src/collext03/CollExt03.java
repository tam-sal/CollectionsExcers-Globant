/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext03;

import collext03.entities.Book;
import collext03.services.BookService;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExt03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BookService bs = new BookService();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String menu = "Press:\n"
                + "1. Create a new book\n"
                + "2. Display book info\n"
                + "3. Display all books\n"
                + "4. Borrow a book\n"
                + "5. Return a borrowed book\n"
                + "0. To exit";
        String title;
        int borrowed;
        int copies;
        String author;
        int userInput = -1;
        while (userInput != 0) {
            System.out.println(menu);
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Type book's title");
                    title = input.next();
                    System.out.println("Type book's author");
                    author = input.next();
                    System.out.println("Quantity of copies:[only positive] ");
                    copies = input.nextInt();
                    while(copies <1){
                        System.out.println("Copies must be a positive value");
                        copies = input.nextInt();
                    }
                    System.out.println("Quantity of borrowed copies: [Only Positive or Zero]");
                    borrowed = input.nextInt();
                    while(borrowed < 0 || borrowed > copies){
                        System.out.println("Borrowed qty must equal or be less than existing copies");
                        borrowed = input.nextInt();
                    }
                    bs.addBook(title, author, copies, borrowed);
                    break;
                    
                case 2:
                    System.out.println("Enter the book's title");
                    Book b = bs.findByTitle(input.next());
                    if(b==null){
                        System.out.println("The book doesn't exist");
                    }
                    else{
                        System.out.println(b.getTitle() + " | " + b.getAuthor()+" | "+" Copies "+b.getCopies()+"  | Borrowed "+b.getBorrowedCopies());
                    }
                    break;
                    
                case 3:
                    bs.displayBooks();
                    break;
                
                case 4:
                    System.out.println("Enter a book's title to borrow");
                    bs.borrowBook(input.next());
                    break;
                
                case 5:
                    System.out.println("Enter the book's title to return");
                    bs.returnBook(input.next());
                    break;
                
                case 0:
                    System.out.println("Exiting system...");
                    break;
                
                default:
                    System.out.println("invalid input");
                    break;
                    
            }
        }

    }

}
