

/**
 * Class BasketBallPlayer
 */
public class BasketBallPlayer extends SportMen {

  //
  // Fields
  //

  private String Name;

  //
  // Constructors
  //
  public BasketBallPlayer (Coach coach, String serName, String name, String middleName,
                           String country, String Name) {
    super(coach, serName, name, middleName, country);
    this.Name = Name;
  };

  //
  // Methods
  //


  //
  // Accessor methods
  //

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

  //
  // Other methods
  //

}
