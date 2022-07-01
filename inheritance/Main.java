package inheritance;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* inheritance/Main
*/
class Main {
  public static void main(String[] args) {
    // D1
    Monitor mn1 = new Monitor(217423);
    Keyboard kb1 = new Keyboard(932195);
    Tower tw1 = new Tower(382024);
    Desktop d1 = new Desktop(mn1,kb1,tw1);
    // D2
    Monitor mn2 = new Monitor(111111);
    Keyboard kb2 = new Keyboard(333333);
    Tower tw2 = new Tower(777777);
    Desktop d2 = new Desktop(mn2,kb2,tw2);

    d1.getModelNumbers();
    d2.getModelNumbers();

    /*
    Person per1 = new Person("Maria", 34);
    Employee emp1 = new Employee("Ana", 27, "Software Engineer");

    per1.sayHi();
    emp1.sayHi();
    */
  }
}