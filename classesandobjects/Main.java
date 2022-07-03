package classesandobjects;
import java.util.Scanner;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* classesandobjects/Main
*/

class Main {
  // Classes And Objects
  public static void ClassesAndObjects1() {
    Book book1 = new Book("The Pragmatic Programmer", "David Thomas & Andrew Hunt", 321);
    Book book2 = new Book("Software Craftsmanship", "Sandro Mancuso", 305);

    System.out.println("The book " + book1.getTitle() + " contains " + book1.getLength() + " pages.");
    System.out.println("The book " + book2.getTitle() + " contains " + book2.getLength() + " pages."); 
  }

  // Getters & Setters
  public static void ClassesAndObjects2() {
    Friend friend1 = new Friend ("Alex", "Pérez" , "Granollers", true);
    Friend friend2 = new Friend ("Sandra", "López", "Tossa de Mar", false);

    System.out.println(friend2.getFirstName() + " " + friend2.getLastName() + " was born in " + friend2.getBirthplace() + ". The fact that their profile is publicly visible is " + friend2.isPublic() + "."); 
  }

  // Constructors + Methods II
  public static void ClassesAndObjects3() {
    Car car1 = new Car("Audi", 217823, true, 19800.35);
    Car car2 = new Car("Delorian", 000042, false, 35800.15);

    System.out.println(Car.describeSale(car1)); 
    System.out.println(Car.describeSale(car2));

    Car[] carList = {car1, car2};
    System.out.println("The total value of our current inventory is " + Car.assessInventoryValue(carList) + " euros."); 
  }

  // Main
  public static void main(String[] args){
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Classes and Objects snippet you wish to run (1-3)");
    int userSelection = exerciseSelector.nextInt();
    exerciseSelector.close();

    switch (userSelection) {
      case 1:
        ClassesAndObjects1();
        break;
      case 2:
        ClassesAndObjects2();
        break;
      case 3:
        ClassesAndObjects3();
        break;
      default:
        System.out.println("Input is not within expected values.");
        break;
    }     
  }  
} 