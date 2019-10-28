package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Hamza Ouni
 */
public class ExceptionTestingDemo {


    @org.junit.jupiter.api.Test
    public void newApproach() {
        NumberFormatException exception= assertThrows(NumberFormatException.class, () ->{
            Integer.parseInt("foo");
        } );

        assertEquals("For input string: \"foo\"",exception.getMessage());
    }
}
