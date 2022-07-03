package intermediateoop;

class Tower{
  // property
  private int modelNumber;
  // constructor
  public Tower (int modelNumber) {
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