package Introduction_to_Java;
import java.util.Scanner;
/* This compiles, but doesn't run using repl.it's button.
   To run it, write this into the console:
   java -classpath .:target/dependency/* Introduction_to_Java/Main */

class Main {
  // Foundational Data Types
  static void Prework_1() {
    String companyName = "The Awesome Store";
    int Employees = 135;
    boolean isOpen= true;
    String[] contactPhones = {"+1 (555) 555555", "+1 (222) 222222", "+34 (555) 3333333"};
    System.out.println("Company name: " + companyName);
    System.out.println("Employees: " + Employees);
    System.out.println("isOpen: " + isOpen);
    System.out.println("Last contact phone: " + contactPhones[2]);
  }

  // Loops and Conditionals
  static void Prework2() {
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
  public static void Prework3() {
    String fullName = getFullName("Michael", "Alcocer");
    System.out.println(fullName);
  }
  public static String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  // Main
  public static void main (String[] args) {
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Prework snippet you wish to run (1-3)");
    int userSelection = exerciseSelector.nextInt();
    
    switch (userSelection) {
      case 1:
        Prework_1();
        break;
      case 2:
        Prework2();
        break;
      case 3:
        Prework3();
        break;
      default:
        System.out.println("Input is not within expected values.");
        break;
    }
  }
}