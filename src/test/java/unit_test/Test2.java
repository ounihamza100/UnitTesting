package unit_test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hamza Ouni
 */
public class Test2 {


    @BeforeAll
    public static void beforeAll() {
        System.out.println("startup - creating DB connection beforeAll");
    }

//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("startup - creating DB connection beforeClass");
//    }



    @Test
    public void simpleTest() {
        System.out.println("simple test");
    }

    @Test
    public void anotherSimpleTest() {
        System.out.println("another simple test");
    }
}
