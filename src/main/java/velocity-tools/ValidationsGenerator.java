package velocitytools;

import static org.apache.avro.Schema.Field;

public class ValidationsGenerator {
  public String validationsFor(Field field) {
    return field.name() + " should not be null.";
  }
}
