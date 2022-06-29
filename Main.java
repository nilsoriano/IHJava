import java.util.Scanner;

class Main {
  
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

  static void Prework_2() {
    for (int i = 0; i < 10 ; i++) {
      System.out.println(i);
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