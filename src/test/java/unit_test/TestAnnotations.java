package unit_test;

import org.junit.After;


import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Hamza Ouni
 */
public class TestAnnotations {

    private List<String> list;

    /**
     * @Before annotation are executed before each test
     * <p> useful when we want to execute some common code before running a test.
     */
//    @BeforeEach
//    public void init() {
//        System.out.println("startup");
//        list = new ArrayList<>(Arrays.asList("test1", "test2"));
//    }

    /**
     * When we want to execute an expensive common operation before each test,
     * it's preferable to execute it only once before running all tests using @BeforeClass.
     * Some examples of common expensive operations are the creation of a database connection or the startup of a server.
     *
     * These methods have to be static.so they'll be executed before running the tests of the class.
     */
    @BeforeAll
    public static void setup() {
         List<String>  list = new ArrayList<>(Arrays.asList("test1", "test2"));
        System.out.println("startup - creating DB connection");
    }



    @Test
    public void whenCheckingListSize_thenSizeEqualsToInit() {
        System.out.println("executing test");
        assertEquals(2, list.size());

        list.add("another test");
    }

    @Test
    public void whenCheckingListSizeAgain_thenSizeEqualsToInit() {
        System.out.println("executing another test");
        assertEquals(2, list.size());

    }

        /**
         * clear the list after the execution of each test.
         */
    @After
    public void finalize(){
        System.out.println("finalize");
        list.clear();
    }

}
