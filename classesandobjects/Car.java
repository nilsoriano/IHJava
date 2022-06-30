package classesandobjects;

class Car {
  // atributes
  private String make;
  private boolean forSale;
  private int vin;
  private double price;
  // constructors
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
    setPrice(price);  
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
  // getters
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
  // Methods II
  public static String describeSale (Car car){
    if (car.isForSale()) {
      return "This car has been built by " + car.getMake() + ", its VIN number is #" + car.getVin() + ", and it can be yours for " + car.getPrice() + " euros.";
    } else {
      return "Our apologies, this " + car.getMake() + " is not currently for sale";
    }
  }
  public static double assessInventoryValue(Car[] cars) {
    double totalValue = 0.00;
    for (int i = 0; i < cars.length; i++) {
      double carPrice = cars[i].getPrice();
      totalValue += carPrice;
    }
    return totalValue;
  }
}