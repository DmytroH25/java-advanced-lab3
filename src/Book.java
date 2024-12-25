/**
 * Represents a book with a title, author, and ISBN.
 */
@XmlJsonRoot("book")
public class Book {

  @XmlJsonField("title")
  private String title;

  @XmlJsonField("author")
  private String author;

  @XmlJsonField("isbn")
  private String isbn;

  /**
   * Constructs a new Book with the specified title, author, and ISBN.
   *
   * @param title  the title of the book
   * @param author the author of the book
   * @param isbn   the ISBN of the book
   */
  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  // Getters
  public String getTitle() {
    return title;
  }


  public String getAuthor() {
    return author;
  }


  public String getIsbn() {
    return isbn;
  }

}