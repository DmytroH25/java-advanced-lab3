import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to define the root element for XML and JSON serialization.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface XmlJsonRoot {
  /**
   * The name of the root element.
   *
   * @return the name of the root element
   */
  String value();
}