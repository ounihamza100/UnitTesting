package unit_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Hamza Ouni
 */
public class ExceptionTestingDemo {

    private List<String> list  = new ArrayList<>();

    @org.junit.Test
    public void testAdd() {
        list.add("Foo");
        Assert.assertEquals(1,list.size());
    }

    @org.junit.Test
    public void testAdd2() {
        list.add("Foo");
        list.add("Foo2");
        Assert.assertEquals(2,list.size());
    }


    //*********************************************

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
