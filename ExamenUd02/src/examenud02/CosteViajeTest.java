//David Sánchez Peso
package examenud02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CosteViajeTest {
    @Test
    void testCosteViaje() {
        assertEquals(CosteViaje.costeViaje(1, (byte)0, 100), 1.638);
        assertEquals(CosteViaje.costeViaje(1, (byte)1, 100), 1.638);
        assertEquals(CosteViaje.costeViaje(1, (byte)2, 100), 0.1692);
        assertEquals(CosteViaje.costeViaje(100, (byte)0, 6), 9.828);
        assertEquals(CosteViaje.costeViaje(100, (byte)1, 5), 8.19);
        assertEquals(CosteViaje.costeViaje(100, (byte)2, 15), 2.538);
    }
}
