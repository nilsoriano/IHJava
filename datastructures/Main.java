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
    perseusPets.add(new Pet("Pegasus", 2557));
    perseusPets.add(new Pet("Bellepheron's stolen Pegasus", 2764));

    List<Pet> hadesPets = new LinkedList<>();
    hadesPets.add(new Pet("Cerberus", 4652));
    hadesPets.add(new Pet("Lernaean hydra", 4632));

    HashMap<String, List<Pet>> petOwners = new HashMap<>();
    petOwners.put("management@underworld.gr", perseusPets);
    petOwners.put("perseus@mycenae.my", hadesPets);

    for (String key: petOwners.keySet()) {
      System.out.println(petOwners.get(key));
    }
    
  }
}