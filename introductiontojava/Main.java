package introductiontojava;
import java.util.Scanner;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* introductiontojava/Main
*/

class Main {
  // Foundational Data Types
  static void IntroToJava1() {
    String companyName = "The Awesome Store";
    int Employees = 135;
    boolean isOpen= true;
    String[] contactPhones = {"+1 (555) 555555", "+1 (222) 222222", "+34 (555) 3333333"};
    System.out.println("Company name: " + companyName);
    System.out.println("Employees: " + Employees);
    System.out.println("isOpen: " + isOpen);
    System.out.println("Third contact phone: " + contactPhones[2]);
  }

  // Loops and Conditionals
  static void IntroToJava2() {
    double[] doubleList = new double[5];
    int[] numList = new int[5];
    String[] stringList = new String[5];
    boolean[] booleanList = new boolean[5];
    
    for (int i = 0; i < doubleList.length ; i++) {
      System.out.println("The int equals " + doubleList[i]);
      System.out.println("The double's value is " + numList[i]);
      System.out.println("The String's content is " + stringList[i]);
      System.out.println("The boolean evaluates to " + booleanList[i]);
    }
  }

  // Methods I
  static void IntroToJava3() {
    String fullName = getFullName("Michael", "Alcocer");
    System.out.println(fullName);
  }
  static String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  // Main
  public static void main (String[] args) {
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Prework snippet you wish to run (1-3)");
    int userSelection = exerciseSelector.nextInt();
    exerciseSelector.close();
    
    switch (userSelection) {
      case 1:
        IntroToJava1();
        break;
      case 2:
        IntroToJava2();
        break;
      case 3:
        IntroToJava3();
        break;
      default:
        System.out.println("Input is not within expected values.");
        break;
    }
  }
}