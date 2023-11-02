package EstructurasDeControlFunciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class E0410Test {
    @Test
    void testPow() {
        assertEquals(9, E0410.pow(3, 2));
        assertEquals(27, E0410.pow(3, 3));
        assertEquals(8, E0410.pow(2, 3));
        assertEquals(16, E0410.pow(4, 2));
        assertEquals(1, E0410.pow(3, 0));
    }
}
