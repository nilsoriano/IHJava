package classesandobjects;

class Car {
  //atributes
  private String make;
  private boolean forSale;
  private int vin;
  private double price;
  //constructors
  public Car (int vin) {
    setVin(vin);
    this.make = "Dacia";
    this.forSale = true;
    this.price = 15600.75;
  }
  public Car (String make, int vin) {
    setMake(make);
    setVin(vin);
    this.forSale = true;
    this.price = 18400.50;
  }
  public Car (String make, int vin, boolean forSale, double price) {
    setMake(make);
    setVin(vin);
    setForSale(forSale);
    if (this.isForSale()) {
      setPrice(price);
      System.out.println("This " + getMake() + " car, with VIN #" + getVin() + ", is for sale: it costs " + price + " euros.");
    } else {
      System.out.println("Apologies, this " + getMake() + " car is not for sale");
    }
  }
  // setters
  public void setMake(String make){
    this.make = make;
  }
  public void setForSale(boolean forSale){
    this.forSale = forSale;
  }
  public void setVin(int vin){
    this.vin = vin;
  }
  public void setPrice(double price){
    this.price = price;
  }
  //getters
  public String getMake(){
    return this.make;
  }
  public boolean isForSale(){
    return this.forSale;
  }
  public int getVin(){
    return this.vin;
  }
  public double getPrice(){
    return this.price;
  }
}