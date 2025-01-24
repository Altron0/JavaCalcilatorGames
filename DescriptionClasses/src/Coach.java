


public class Coach extends SportMen {

  //
  // Fields
  //

  private String SpeciaLization;
  
  //
  // Constructors
  //
  public Coach (String Country, Coach coach, String serName, String name, String middleName, String country) {
    super(coach, serName, name, middleName, country);
  };


  public Coach(String Country,String serName, String name, String middleName,String speciaLization){
    super(serName, name, middleName, Country);
    SpeciaLization = speciaLization;
  }
  @Override
  public void ShowInformation(){
    super.ShowInformation();
    System.out.println("SpeciaLization: " + SpeciaLization);
  }


  @Override
  public void ShowCoach(){
    super.ShowCoach();
    System.out.println("SpeciaLization: " + SpeciaLization);
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of SpeciaLization
   * @param newVar the new value of SpeciaLization
   */
  public void setSpeciaLization (String newVar) {
    SpeciaLization = newVar;
  }

  /**
   * Get the value of SpeciaLization
   * @return the value of SpeciaLization
   */
  public String getSpeciaLization () {
    return SpeciaLization;
  }

  //
  // Other methods
  //

}
