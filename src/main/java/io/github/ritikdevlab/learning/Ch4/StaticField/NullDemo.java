package io.github.ritikdevlab.learning.Ch4.StaticField;
import java.util.Objects;
/**
 * Demonstrates the use of the Objects utility class for:
 * <ul>
 *    <li>Null validation</li>
 *    <li>Default values</li>
 *    <li>Lazy objects creation</li>
 * </ul>
 * 
 * The program simulates a simple library system where books
 * can be added, issued, returned and displayed 
 */
public class NullDemo {
    /**
     * Runs the library management application.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Books[] m = null;
        int num = 0;
        while(true) {
            String qn = IO.readln("Add ,issue ,return ,show ,exit :- " );
            /*1. Use requireNonNullElse to provide a default action 
            string (that is "invalid" in this case which in turn give the default Switch value that is "Invalid input") 
            if qn is null and if not give the return qn*/
            /**It equivalent is
             *  if(qn != null) {
                    qn = qn;
                }
                else {
                    qn = "Invalid";
                } */
            qn = Objects.requireNonNullElse(qn,"Invalid");
            switch (qn.toLowerCase()) {
                case "add" -> {
                    int Number = Integer.parseInt(IO.readln("Give the number of books you want to add:- "));
                    m = new Books[Number];
                    for (int i = 0;i < Number;i++) {
                        String name = IO.readln("Give the name of the book:- ");
                        int id = Integer.parseInt(IO.readln("Give the id of the book:- "));
                        m[i] = Books.ShowBooks(name, id);
                    }
                    num = Number;
                }
                case "issue" -> {
                    /*2.Throws NullPointerException with 
                    message(In this case it is "No books available in the library yet") immediately if id array m is null
                    if not then continue*/
                    /** The equivalent code is 
                     * if(m == null) {
                            throw new NullPointerException(
                                "No books available in the library yet"
                            );
                        } */
                    Objects.requireNonNull(m, "No books available in the library yet");
                    int an = Integer.parseInt(IO.readln("Give the id of the book:- "));
                    boolean found = false;
                    for (int i = 0;i < num;i++) {
                        if (m[i] != null && m[i].getId() == an) {
                            IO.println("Found-> Name:- " + m[i].getName() + " Id:- " + m[i].getId());
                            m[i] = null;
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        IO.println("Invalid Id or Books is already issued.");
                    }
                }
                case "return" -> {
                    /*3."Lazy message genetation" using supplier if array m is null
                     and this version use the supplier which in this case is "()" also The message is generated only if needed.*/
                     /** The equivalent is 
                      * if (m == null) {
                      *     throw new NullPointerException (
                                "The library has not been initialized with books yet."
                            ); 
                        }  */  
                    Objects.requireNonNull(m, () -> "The library has not been initialized with books yet.");
                    int returnId = Integer.parseInt(IO.readln("Give Id of the books you want to return:- "));
                    boolean returned = false;
                    for (int b = 0;b < num;b++) {
                        if (m[b] == null) { 
                            String name = IO.readln("Confirm the name of the returning book:- ");
                            m[b] = Books.ShowBooks(name, returnId);
                            IO.println("Book returned successfully to slot " + b);
                            returned = true;
                            break;
                        }    
                    }
                    if(!returned) {
                        IO.println("Cannot return book. The library shelves are already completely full!"); 
                    }
                }
                case "show" -> {
                    if(m == null) {
                        IO.println("The library has not been initialized with books yet.");
                        continue;
                    }
                    IO.println("--- Current Books in Library ---");
                    for (int i = 0;i < num;i++) {
                        if(m[i] != null) {
                            IO.println("Name:- " + m[i].getName() + " | Id:- " + m[i].getId());
                        }
                        else {
                            IO.println("Slot " + i + ": [Empty / Issued]");
                        }
                    }
                }
                case "exit" -> {
                    IO.println("Exiting the program");
                    return;
                }
                default -> {
                    IO.println("Invalid input");
                }
            }
            if (m != null) {
                IO.println("---------Books Summary---------");
                for (Books e : m) {
                    /*4.Create a default book object if e is null
                     if not then return e */
                    /** The equivalent code is 
                     * Books displayBook;

                        if(e != null) {
                            displayBook = e;
                        }
                        else {
                            displayBook =
                                Books.ShowBooks("Empty Slot", 0);
                        } */
                    Books displayBook = Objects.requireNonNullElseGet(e, () -> Books.ShowBooks("Empty Slot", 0));
                    IO.println("Name:- " + displayBook.getName() + " Id:- " + displayBook.getId());
                       
                }
            }    
        }
    }        
}
/**
 * Represents a book in the library.
 * 
 * Each book contains a name and a unique identifier.
 */
class Books {
    private String Name;
    private int Id;
    /**
     * creates a book with the specified name and identifier.
     * 
     * @param n the book name
     * @param i the book identifier
     * @throws NullPointerException if the book name is null
     */
    Books (String n , int i) {
        //5.Validate that the book name parameter is never null upon creation
        Name = Objects.requireNonNull(n , "Books can not be null");
        Id = i;
    }
    /**
     * Creates and returns a book objects
     * 
     * @param a the book name
     * @param b the book identifier
     * @return a new book objects
     * @throws NullPointerException if the book name is null
     */
    public static Books ShowBooks(String a , int b) {
        return new Books(a, b);
    }
    /**
     * {@return the book name}
     */
    public String getName() {
        return Name;
    }
    /**
     * {@return the book id}
     */
    public int getId() {
        return Id;
    }
}
