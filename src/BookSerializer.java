public class BookSerializer {
  /**
   * Serializes a Book object to JSON format.
   *
   * @param book the Book object to serialize
   * @return the JSON representation of the Book object
   */
  public static String toJson(Book book) {
    return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"isbn\": \"%s\"}",
        book.getTitle(), book.getAuthor(), book.getIsbn());
  }

  /**
   * Serializes a Book object to XML format.
   *
   * @param book the Book object to serialize
   * @return the XML representation of the Book object
   */
  public static String toXml(Book book) {
    return String.format("<book><title>%s</title><author>%s</author><isbn>%s</isbn></book>",
        book.getTitle(), book.getAuthor(), book.getIsbn());
  }
}