package datastructures;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* datastructures/Main
*/

class Main {
  // Lists
  static void DataStructures1() {
    List<String> brandList = new ArrayList<>();
    brandList.add("Mitsurrari");
    brandList.add("Seault");
    brandList.add("Mazvo");
    brandList.add("Koenigoyce");
    
    for (int i = 0; i < brandList.size(); i++) {
      System.out.println(brandList.get(i));
    }

    brandList.remove(2);
    for (int i = 0; i < brandList.size(); i++) {
      System.out.println(brandList.get(i));
    }
  }

  // Lists II
  static void DataStructures2() {
    List<Contact> contactList = new ArrayList<>();
    contactList.add(new Contact("Juan",611622633));
    contactList.add(new Contact("Ana",622633644));
    contactList.add(new Contact("Juan",633644655));
    
    for (int i = 0; i < contactList.size(); i++) {
      System.out.println(contactList.get(i).getName());
      System.out.println(contactList.get(i).getPhone());
    }
  }

  // Maps
  static void DataStructures3(){
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
  
  // Main
  public static void main(String[] args) {
    Scanner exerciseSelector = new Scanner(System.in);
    System.out.println("Select the Prework snippet you wish to run (1-3)");
    int userSelection = exerciseSelector.nextInt();
    exerciseSelector.close();
    
    switch (userSelection) {
      case 1:
        DataStructures1();
        break;
      case 2:
        DataStructures2();
        break;
      case 3:
        DataStructures3();
        break;
      default:
        System.out.println("Input is not within expected values.");
        break;
    }
  }
}