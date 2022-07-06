package javachallenges;

/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* javachallenges/Main
*/

class Main {
  
  public static void main (String[] args) {
    Integer[] numList1 = new Integer[]{2,5,1,6,14};
    C1 maxFinder = new C1 (numList1);
    
    System.out.println("The largest integer in the list is " + maxFinder.getMax());
    
  }
}