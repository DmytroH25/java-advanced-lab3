public class LibrarySerializer {

  /**
   * Serializes a Library object to JSON format.
   *
   * @param library the Library object to serialize
   * @return the JSON representation of the Library object
   */
  public static String toJson(Library library) {
    return String.format("{\"name\": \"%s\", \"location\": \"%s\"}",
        library.getName(), library.getLocation());
  }

  /**
   * Serializes a Library object to XML format.
   *
   * @param library the Library object to serialize
   * @return the XML representation of the Library object
   */
  public static String toXml(Library library) {
    return String.format("<library><name>%s</name><location>%s</location></library>",
        library.getName(), library.getLocation());
  }
}