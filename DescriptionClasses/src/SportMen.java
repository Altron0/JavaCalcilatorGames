


public class SportMen extends Human {

  //
  // Fields
  //

  private Coach Coach;
  
  //
  // Constructors
  //
  public SportMen (Coach coach, String serName, String name, String middleName, String country) {
    super(serName, name, middleName, country);
    Coach = coach;
  };


  public SportMen(String serName, String name, String middleName, String country){
    super(serName, name, middleName, country);
  }


  @Override
  public void ShowInformation(){
    super.ShowInformation();
  }


  public void ShowCoach(){
    System.out.println("Information of Coach:");
    Coach.ShowInformation();
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Coutry
   * @param newVar the new value of Coutry
   */

  /**
   * Get the value of Coutry
   * @return the value of Coutry
   */

  /**
   * Set the value of Coach
   * @param newVar the new value of Coach
   */
  public void setCoach (Coach newVar) {
    Coach = newVar;
  }

  /**
   * Get the value of Coach
   * @return the value of Coach
   */
  public Coach getCoach () {
    return Coach;
  }


    //
  // Other methods
  //

}
