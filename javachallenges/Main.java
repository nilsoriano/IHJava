package javachallenges;
import java.util.Scanner;
import java.util.Random;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* javachallenges/Main
*/
class Main {
  
  public static void main (String[] args) {
    Scanner challengeSelector = new Scanner(System.in);
    Random rn = new Random();
    Integer[] numList = new Integer[]{21,135,43,86,52};
    ChallengeSolution cs = new ChallengeSolution();
    
    System.out.println("Select the Challenge snippet you wish to run (1-4)");
    int userSelection = challengeSelector.nextInt();
    challengeSelector.close();

    switch (userSelection) {
      case 1:
        System.out.println("This list's average equals " + cs.average(numList));
        break;
      case 2:
        int rnInt1 = rn.nextInt((11 - 1) + 1);
        System.out.println(rnInt1 + " is spelled: " +cs.printNumberInWord(rnInt1));
        break;
      case 3:
        int rnInt2 = rn.nextInt((31 - 1) + 1);
        System.out.print(rnInt2 + " is an ");
        cs.checkOddEven(rnInt2);
        break;
      case 4:
        System.out.println("The largest integer in the list is " + cs.maximum(numList));
        break;
      default:
        System.out.println("Input not within expected values.");
    }
  }
}