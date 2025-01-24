


public class ChessPlayer extends SportMen {

  //
  // Fields
  //

  private int Category;
  
  //
  // Constructors
  //
  public ChessPlayer (Coach coach, String serName, String name,
                      String middleName, String country, int category) {
    super(coach, serName, name, middleName, country);
    Category = category;
  };

  @Override
  public void ShowInformation(){
    System.out.println("Information of Player:");
    super.ShowInformation();
    super.ShowCoach();
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Category
   * @param newVar the new value of Category
   */
  public void setCategory (int newVar) {
    Category = newVar;
  }

  /**
   * Get the value of Category
   * @return the value of Category
   */
  public int getCategory () {
    return Category;
  }

  //
  // Other methods
  //

}
