


public class Footballplayer extends SportMen {

  //
  // Fields
  //

  private int Experience;
  
  //
  // Constructors
  //
  public Footballplayer (Coach coach, String serName, String name, String middleName, String country,
                         int experience) {
    super(coach, serName, name, middleName, country);
    Experience = experience;

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Experience
   * @param newVar the new value of Experience
   */
  public void setExperience (int newVar) {
    Experience = newVar;
  }

  /**
   * Get the value of Experience
   * @return the value of Experience
   */
  public int getExperience () {
    return Experience;
  }

  //
  // Other methods
  //

}
