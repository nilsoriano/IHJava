package inheritance;

class Keyboard{
  // property
  private int modelNumber;
  // constructor
  public Keyboard (int modelNumber) {
    setModelNumber(modelNumber);
  }
   // setter
  public void setModelNumber(int modelNumber){
    this.modelNumber = modelNumber;
  }
  // getter
  public int getModelNumber(){
    return this.modelNumber;
  }
}