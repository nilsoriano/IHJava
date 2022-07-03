package datastructures;
import java.util.List;
import java.util.ArrayList;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* datastructures/Main
*/

class Main {
  public static void main (String[] args) {
    List<Contact> contactList = new ArrayList<>();

    contactList.add(new Contact("Juan",611622633));
    contactList.add(new Contact("Ana",622633644));
    contactList.add(new Contact("Juan",633644655));

    for (int i = 0; i < contactList.size(); i++) {
      System.out.println(contactList.get(i).getName());
      System.out.println(contactList.get(i).getPhone());
    }
    /*
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
    */
  }
}