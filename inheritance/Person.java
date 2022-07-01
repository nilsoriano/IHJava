package inheritance;
  
class Person {
  private String name;
  private int age;

  public Person (String name, int age) {
    setName(name);
    setAge(age);
  }
  // setters
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  // getters
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  
  public void sayHi() {
    System.out.println("Greetings! My name is "+this.getName());
  }
}