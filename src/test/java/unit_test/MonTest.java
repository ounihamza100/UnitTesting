package unit_test;

import org.junit.jupiter.api.*;

/**
 * @author Hamza Ouni
 */
@DisplayName("Ma classe de test JUnit5") //sera affiché par les tests runners ou dans le rapport d'exécution des tests.
public class MonTest {




    @BeforeAll
    static void initAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("afterAll");
    }

    @Test
    @DisplayName("Mon simpleTest method")
    void simpleTest() {
        System.out.println("simpleTest");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Mon secondTest method")
    void secondTest() {
        System.out.println("secondTest");
        Assertions.assertTrue(true);
    }
}
