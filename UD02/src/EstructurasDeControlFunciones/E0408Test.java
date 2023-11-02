package EstructurasDeControlFunciones;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class E0408Test {
    @Test
    void testCalculadora() {
        assertEquals(4, E0408.calculadora(1, 2, 2));
        assertEquals(-1, E0408.calculadora(2, 2, 3));
        assertEquals(9, E0408.calculadora(3, 3, 3));
        assertEquals(3, E0408.calculadora(4, 13, 4));
    }

    @Test
    void testCalculadora2() {
        
    }
}
