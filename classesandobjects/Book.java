package classesandobjects;

class Book {
  // attributes
  private String title; 
  private String author;
  private int length;
  // constructor
  public Book(String title, String author, int length){
   this.title = title;
   this.author = author;
   this.setLength(length);
  }
  // setters
  public void setTitle(String title){
    this.title = title;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public void setLength(int length){
    if (length >= 100){
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