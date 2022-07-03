package datastructures;


class Pet {
  private String name;
  private int age;

  public Pet(String name, int age) {
    setName(name);
    setAge(age);
  }
  // setters
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  // getters
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
}