package inheritance;
/* This compiles, but does not run using repl.it's button.
   To run it, paste this into the console:
   java -classpath .:target/dependency/* inheritance/Main
*/
class Main {
  public static void main(String[] args) {
    Person per1 = new Person("Maria", 34);
    Employee emp1 = new Employee("Ana", 27, "Software Engineer");

    per1.sayHi();
    emp1.sayHi();
  }
}