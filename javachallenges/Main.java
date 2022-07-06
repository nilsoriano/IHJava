package javachallenges;
import java.util.Random;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* javachallenges/Main
*/
class Main {
  
  public static void main (String[] args) {
    Random rn = new Random();
    C2 numPrinter = new C2();
    System.out.println(numPrinter.printNumberInWord(rn.nextInt(10 - 1) + 1));
    /*
    Integer[] numList1 = new Integer[]{2,5,1,6,14};
    C1 maxFinder = new C1 (numList1);
    
    System.out.println("The largest integer in the list is " + maxFinder.getMax()); */
    
  }
}