package unit_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


/**
 * @author Hamza Ouni
 */
public class Test3 {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("startup - creating DB connection beforeAll");
    }

    @Test
    public void simpleTest() {
        System.out.println("simple test");
    }
}
