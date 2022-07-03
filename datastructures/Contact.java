package datastructures;

class Contact {
  private String name;
  private int phone;

  public Contact(String name, int phone) {
    setName(name);
    setPhone(phone);
  }
  // setters
  public void setName(String name) {
    this.name = name;
  }
  public void setPhone(int phone) {
    this.phone = phone;
  }
  // getters
  public String getName() {
    return this.name;
  }
  public int getPhone() {
    return this.phone;
  }
}