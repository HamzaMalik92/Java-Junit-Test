package shapes;

import com.pixcel.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldDetectSquare() {
        Rectangle rect = new Rectangle(5.5, 5.5);
        assertTrue(rect.isSquare());
    }

    @Test
    void shouldDetectNonSquare() {
        Rectangle rect = new Rectangle(5, 3);
        assertFalse(rect.isSquare());
    }

    @Test
    void shouldCalculateArea() {
        Rectangle rect = new Rectangle(5, 3);
        assertEquals(15, rect.getArea());
    }
}
