

/**
 * Class BasketBallPlayer
 */

public class Human {

  //
  // Fields
  //

  private String SerName;
  private String Name;
  private String MiddleName;
  private String Country;
  
  //
  // Constructors
  //
  public Human (String serName, String name, String middleName, String country) {
    SerName = serName;
    Name = name;
    MiddleName = middleName;
    Country = country;
  };


  public void ShowInformation(){
    System.out.println("SerName: "+ SerName + ", Name: " + Name + ", MiddleName: " + MiddleName +  ", Country: " + Country + "\n");
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of SerName
   * @param newVar the new value of SerName
   */
  public void setSerName (String newVar) {
    SerName = newVar;
  }

  /**
   * Get the value of SerName
   * @return the value of SerName
   */
  public String getSerName () {
    return SerName;
  }

  /**
   * Set the value of Name
   * @param newVar the new value of Name
   */
  public void setName (String newVar) {
    Name = newVar;
  }

  /**
   * Get the value of Name
   * @return the value of Name
   */
  public String getName () {
    return Name;
  }

  /**
   * Set the value of MiddleName
   * @param newVar the new value of MiddleName
   */
  public void setMiddleName (String newVar) {
    MiddleName = newVar;
  }

  /**
   * Get the value of MiddleName
   * @return the value of MiddleName
   */
  public String getMiddleName () {
    return MiddleName;
  }

  /**
   * Set the value of Country
   * @param newVar the new value of Country
   */
  public void setCountry (String newVar) {
    Country = newVar;
  }

  /**
   * Get the value of Country
   * @return the value of Country
   */
  public String getCountry () {
    return Country;
  }

  //
  // Other methods
  //

}
