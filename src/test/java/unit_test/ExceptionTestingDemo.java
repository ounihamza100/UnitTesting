package unit_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Hamza Ouni
 */
public class ExceptionTestingDemo {


    @Test
    public void oldSchoolApproach() {

        try {
            Integer.parseInt("foo");
            fail("NumberFormatException Expected");
        } catch (NumberFormatException expected) {
            assertEquals("For input string: \"foo\"",expected.getMessage());
        }

    }


    @org.junit.Test(expected = NumberFormatException.class)
    public void annotationParameterApproach() { Integer.parseInt("foo"); }


    //*****************************************************************


    @org.junit.jupiter.api.Test
    public void newApproach() {
        NumberFormatException exception= assertThrows(NumberFormatException.class, () ->{
            Integer.parseInt("foo");
        } );

        assertEquals("For input string: \"foo\"",exception.getMessage());
    }
}
