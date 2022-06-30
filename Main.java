import java.util.Scanner;

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
  static void Prework_2() {
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
  
  public static void main (String[] args) {
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Prework snippet you wish to run (1-5)");
    int userSelection = exerciseSelector.nextInt();
    
    switch (userSelection) {
      case 1:
        Prework_1();
        break;
      case 2:
        Prework_2();
        break;
      default:
        System.out.println("Input not within expected values.");
        break;
    }
  }
  
}