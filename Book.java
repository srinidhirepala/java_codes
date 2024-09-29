4.Create a class called Book to represent a book. A Book should include four pieces of information as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class should have a constructor that initializes the four instance variables. Provide a set method and get method for each instance variable. In addition, provide a method named getBookInfo that returns the description of the book as a String.

import java.util.*;
class Book
{
 String bookname;
String isbn;
String author;
String publisher;
Book()
{
 Scanner sc = new Scanner(System.in);
 bookname = sc.nextLine();
 isbn = sc.nextLine();
 author = sc.nextLine();
 publisher = sc.next();
}
void setbookname(String bookname)
{
 this.bookname = bookname;
}
void setisbn(String isbn){
 this.isbn =isbn;
}
void setauthor(String author)
{
 this.author = author;
}
void setpublisher(String publisher)
{
 this.publisher = publisher;
}
String getbookname()
{
  return bookname;
}
String getisbn()
{
  return isbn;
}
String getauthor()
{
  return author;
}
String getpublisher()
{
  return publisher;
}
String getbookinfo()
  return("Bookname : "+bookname+"ISBN : "+isbn + "Author: " +author+ "Publisher:"+publisher);
}
public static void main(String s[])
{
  Book b = new Book();
System.out.println("Book Details are:");
System.out.println(b.getbookinfo());
}

}



  
  

  

  

  


  
  


