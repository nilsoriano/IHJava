package inheritance;

class Employee extends Person {
  private String title;

  public Employee(String name, int age, String title) {
    super(name, age);
    setTitle(title);
  }
   // setter
  public void setTitle(String title){
    this.title = title;
  }
  // getter
  public String getTitle(){
    return this.title;
  }

  public void sayHi() {
    System.out.println("Greetings! My name is "+this.getName() + " and my title is " + this.getTitle());
  }
}