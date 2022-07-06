package javachallenges;

class C1 {
  private Integer max;

  public C1 (Integer [] numList) {
    maximum(numList);
  }
  
  public Integer maximum (Integer[] numList){
    Integer temp = 0;
    for (int i = 0; i < numList.length ; i++) {
      if (temp < numList[i]){
        setMax(numList[i]);
      }
    }
    return temp;
  }

  // setter
  public void setMax(Integer max){
      this.max = max;
  }
  // getter
  public Integer getMax(){
    return this.max;
  }
}