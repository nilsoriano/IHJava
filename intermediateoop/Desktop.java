package intermediateoop;

class Desktop {
  // properties
  private Monitor mn;
  private Keyboard kb;
  private Tower tw;
  // constructors
  public Desktop(Monitor mn, Keyboard kb, Tower tw) {
    setMonitor(mn);
    setKeyboard(kb);
    setTower(tw);
  }
  // setters
  public void setMonitor(Monitor mn) {
    this.mn = mn;
  }
  public void setKeyboard(Keyboard kb) {
    this.kb = kb;
  }
  public void setTower(Tower tw) {
    this.tw = tw;
  }
  // getters
  public Monitor getMonitor() {
    return this.mn;
  }
  public Keyboard getKeyboard() {
    return this.kb;
  }
  public Tower getTower() {
    return this.tw;
  }

  public void getModelNumbers() {
    System.out.println("This monitor's model number is "+this.mn.getModelNumber());
    System.out.println("This keyboard's model number is "+this.kb.getModelNumber());
    System.out.println("This tower's model number is "+this.tw.getModelNumber());
  }
} 