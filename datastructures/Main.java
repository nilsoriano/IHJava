package datastructures;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* datastructures/Main
*/

class Main {
  public static void main (String[] args) {
    List<Pet> perseusPets = new ArrayList<>();
    perseusPets.add(new Pet("Pegasus V2", 2557));
    perseusPets.add(new Pet("Bellepheron's refactored Pegasus", 2764));

    List<Pet> hadesPets = new LinkedList<>();
    hadesPets.add(new Pet("Cerberus", 4652));
    hadesPets.add(new Pet("Lernaean hydra", 4632));

    HashMap<String, List<Pet>> petOwners = new HashMap<>();
    petOwners.put("perseus@mycenae.gr", perseusPets);
    petOwners.put("management@underworld.gr", hadesPets);

    for (HashMap.Entry<String, List<Pet>> o: petOwners.entrySet()) {
      System.out.println("Pets assigned to user " + o.getKey() + ":");
      for (Pet pN : o.getValue()) {
        System.out.println(pN.getName());
      }
    }
  }
}