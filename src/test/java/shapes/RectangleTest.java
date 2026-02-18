package shapes;

import com.pixcel.shapes.Rectangle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RectangleTest {

    static Rectangle rect; // shared for all tests

    @BeforeAll
    static void initAll() {
        System.out.println("RectangleTest.initAll");
        rect = new Rectangle(5, 5);
        System.out.println("rect = " + rect);
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("RectangleTest.cleanupAll");
        rect = null;
        System.out.println("rect = " + null);
    }

    @Test
    @Order(1)
    void shouldDetectSquare() {
        assertTrue(rect.isSquare());
    }

    @Test
    @Order(2)
    void shouldCalculateArea() {
        assertEquals(25, rect.getArea());
    }

    @Test
    @Order(3)
    void shouldHaveCorrectSidesArray() {
        double[] expectedSides = {rect.getLength(), rect.getWidth()};
        double[] actualSides = {5, 5};
        assertArrayEquals(expectedSides, actualSides);
    }
}
