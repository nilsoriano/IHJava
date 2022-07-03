package intermediateoop;
import java.util.Scanner;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* intermediateoop/Main
*/

class Main {
  // Super keyword
  static void IntermediateOOP1() {
    Person per1 = new Person("Maria", 34);
    Employee emp1 = new Employee("Ana", 27, "Software Engineer");

    per1.sayHi();
    emp1.sayHi();
  }

  // Composition
  static void IntermediateOOP2() {
    Monitor mn1 = new Monitor(217423);
    Keyboard kb1 = new Keyboard(932195);
    Tower tw1 = new Tower(382024);
    Desktop d1 = new Desktop(mn1,kb1,tw1);

    Monitor mn2 = new Monitor(111111);
    Keyboard kb2 = new Keyboard(333333);
    Tower tw2 = new Tower(777777);
    Desktop d2 = new Desktop(mn2,kb2,tw2);

    d1.getModelNumbers();
    d2.getModelNumbers();
  }

  // Main
  public static void main(String[] args) {
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Prework snippet you wish to run (1-2)");
    int userSelection = exerciseSelector.nextInt();
    exerciseSelector.close();


    switch (userSelection) {
      case 1:
        IntermediateOOP1();
        break;
      case 2:
        IntermediateOOP2();
        break;
      default:
        System.out.println("Input is not within expected values.");
        break;
    }
  }
} 