// LIST SET MAP QUEUE
// Libraray management system
//list- store book titles
//set- unique authors
//map - book id : book name
//queue- borrowing requests managing
import java.util.*;
class Library //declaring
{
    private List<String> books ;
    private Set<String> authors;
    private Map<String,String> bookCatalog;
    private Queue<String> borrowingRequests;

public Library()//initialisisng
{
    books =new ArrayList<>();
    authors =new HashSet<>();
    bookCatalog =new HashMap<>();
    borrowingRequests =new LinkedList<>();
}
//adding a book
public void addbook(int id,String bname,String author)
{
books.add(bname);
authors.add(author);
bookCatalog.put(bname,author);
System.out.println("added " +bname ); 
}
//borrow book
public void borrowBook(String bname){
    if(bookCatalog.containsKey(bname)){
        borrowingRequests.add(bname);
        System.out.println("Borrowing request added in queue for : " + bname );
    }else{
        System.out.println("Book not here!");
    }
}
//prosessing a borrow request
public void processBR(){
    if (!borrowingRequests.isEmpty()){
        System.out.println("Book issued : "+ borrowingRequests.peek());
        borrowingRequests.poll();
    }else{
        System.out.println("No requests in queue");
    }
}
//show book author catalog
public void show(){
    System.out.println("BOOKS "+ books);
    System.out.println("AUTHORS " + authors);
    System.out.println("CATALOG "+ bookCatalog);
}}
public class Collection_framework{
    public static void main (String[] args){
        Library myLib =new Library();
        //adding books
        myLib.addbook(1,"Red ridding hood","Oliver");
        myLib.addbook(2, "Harry potter", "JK Rowling");
        myLib.addbook(3,"The Hobbit", "J.R.R. Tolkien");
        //show
        myLib.show();
        //borrowing
        myLib.borrowBook("Harry potter");
        myLib.processBR();
        myLib.borrowBook("The Hobbit");
        myLib.processBR();

    }   
}