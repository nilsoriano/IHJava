package classesandobjects;

class Friend {
  // attributes
  private String firstName;
  private String lastName;
  private String birthPlace;
  private boolean publicProfile;
  // constructor
  public Friend(String firstName, String lastName, String birthPlace, boolean publicProfile){
    setFirstName(firstName);
    setLastName(lastName);
    setBirthPlace(birthPlace);
    setPublic(publicProfile);
  }
  // setters
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public void setBirthPlace(String birthPlace){
    this.birthPlace = birthPlace;
  }
  public void setPublic(boolean publicProfile){
    this.publicProfile = publicProfile;
  }
  //getters
  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }
  public String getBirthplace(){
    return this.birthPlace;
  }
  public boolean isPublic(){
    return this.publicProfile;
  }
}