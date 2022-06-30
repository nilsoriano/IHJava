package ClassesAndObjects;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* ClassesAndObjects/BookDescription 
*/
class Book {
  // attributes
  private String title; 
  private String author;
  private int length;
  // constructor
  public Book(String title, String author, int length){
   setTitle(title);
   setAuthor(author);
   setLength(length);
  }
  // setters
  public void setTitle(String title){
    this.title = title;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public void setLength(int length){
    if (length > 100){
      this.length = length;
    } else {
      this.length = 101;
    }
  }
  // getters
  public String getTitle(){
    return this.title;
  }
  public String getAuthor(){
    return this.author;
  }
  public int getLength(){
    return this.length;
  }  
}

class BookDescription {
  public static void main(String[] args){
    Book book1 = new Book("The Pragmatic Programmer", "David Thomas & Andrew Hunt", 321);
    Book book2 = new Book("Software Craftsmanship", "Sandro Mancuso", 305);
    
    System.out.println("The book " + book1.getTitle() + " contains " + book1.getLength() + " pages.");
    System.out.println("The book " + book2.getTitle() + " contains " + book2.getLength() + " pages.");
  }
}
