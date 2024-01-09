package ejerciciosApuntes.claseMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClaseAuxiliarTest {

    @Test
    void numAleat() {
    }

    @Test
    void eliminarEnUnaLista() {
    }

    @Test
    void agregarAUnaLista() {
    }

    @Test
    void primosTest()
    {
        assertTrue(ClaseAuxiliar.esPrimo(7));
        assertTrue(ClaseAuxiliar.esPrimo(11));
        assertFalse(ClaseAuxiliar.esPrimo(121));
    }
}