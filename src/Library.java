/**
 * Represents a library with a name and location.
 */
@XmlJsonRoot("library")
public class Library {

  @XmlJsonField("name")
  private String name;

  @XmlJsonField("location")
  private String location;

  /**
   * Constructs a new Library with the specified name and location.
   *
   * @param name     the name of the library
   * @param location the location of the library
   */
  public Library(String name, String location) {
    this.name = name;
    this.location = location;
  }


  // Getters
  public String getName() {
    return name;
  }


  public String getLocation() {
    return location;
  }

}