package classesandobjects;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* classesandobjects/Main
*/
class Main {
  public static void main(String[] args){
    /*
    Book book1 = new Book("The Pragmatic Programmer", "David Thomas & Andrew Hunt", 321);
    Book book2 = new Book("Software Craftsmanship", "Sandro Mancuso", 305);
    
    System.out.println("The book " + book1.getTitle() + " contains " + book1.getLength() + " pages.");
    System.out.println("The book " + book2.getTitle() + " contains " + book2.getLength() + " pages."); 
    */
    Friend friend1 = new Friend ("Alex", "Pérez" , "Granollers", true);
    Friend friend2 = new Friend ("Sandra", "López", "Tossa de Mar", false);
    
    System.out.println(friend2.getFirstName() + " " + friend2.getLastName() + " was born in " + friend2.getBirthplace() + ". The fact that their profile is publicly visible is " + friend2.isPublic() + ".");
  }
}