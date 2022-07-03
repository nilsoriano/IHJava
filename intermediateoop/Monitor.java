package intermediateoop;

class Monitor{
  // property
  private int modelNumber;
  // constructor
  public Monitor (int modelNumber) {
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