/**
 * The Main class serves as the entry point for the application.
 */
public class Main {

  /**
   * Main entry point of the program.
   *
   * @param args command-line arguments
   * @throws IllegalAccessException if the reflection-based serialization encounters an illegal access
   */
  public static void main(String[] args) throws IllegalAccessException {
    Book book = new Book("1984", "George Orwell", "1234567890");
    Library library = new Library("Central Library", "Main Street");
    Member member = new Member("M123", "Alice", "2024-01-01");

    long start, end;

    start = System.nanoTime();
    System.out.println(ReflectionSerializer.toJson(book));
    System.out.println(ReflectionSerializer.toJson(library));
    System.out.println(ReflectionSerializer.toJson(member));
    System.out.println(ReflectionSerializer.toXml(book));
    System.out.println(ReflectionSerializer.toXml(library));
    System.out.println(ReflectionSerializer.toXml(member));
    end = System.nanoTime();
    System.out.println("Reflection serialization time: " + (end - start) / 1_000_000 + " ms");

    start = System.nanoTime();
    System.out.println(BookSerializer.toJson(book));
    System.out.println(LibrarySerializer.toJson(library));
    System.out.println(MemberSerializer.toJson(member));
    System.out.println(BookSerializer.toXml(book));
    System.out.println(LibrarySerializer.toXml(library));
    System.out.println(MemberSerializer.toXml(member));
    end = System.nanoTime();
    System.out.println("Manual serialization time: " + (end - start) / 1_000_000 + " ms");
  }
}