package javachallenges;

class ChallengeSolution {
  private Integer max;

  public ChallengeSolution () {
  }

  public Integer maximum (Integer[] numList){
    Integer temp = 0;
    for (int i = 0; i < numList.length ; i++) {
      if (temp < numList[i]){
        temp = numList[i];
      }
    }
    return temp;
  }
  
  public String printNumberInWord(int num) {
    switch (num) {
      case 1:
        return "ONE";
      case 2:
        return "TWO";
      case 3:
        return "THREE";
      case 4:
        return "FOUR";
      case 5:
        return "FIVE";
      case 6:
        return "SIX";
      case 7:
        return "SEVEN";
      case 8:
        return "EIGHT";
      case 9:
        return "NINE";
      default:
        return "OTHER";
    }
  }

  public void checkOddEven (int num) { 
    if (num % 2 != 0 ) {
      System.out.println("Odd Number");
    } else {
      System.out.println("Even Number");
    }
  }

  public double average(Integer[] numList) { 
    double temp = 0.00;
    for (int i = 0; i < numList.length; i++) {
      temp += numList[i];
    }
    return temp / numList.length;
  }
}