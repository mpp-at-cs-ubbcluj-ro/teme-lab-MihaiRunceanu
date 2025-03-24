
import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        assertEquals(3, 3);
    }

    @Test
    @DisplayName("Second Test")
    public void testExample2(){
        assertEquals(0, 0);
    }
}
