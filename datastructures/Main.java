package datastructures;
import java.util.List;
import java.util.ArrayList;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* datastructures/Main
*/

class Main {
  public static void main (String[] args) {
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
}