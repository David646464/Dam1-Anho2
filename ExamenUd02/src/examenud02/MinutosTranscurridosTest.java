//David Sánchez Peso
package examenud02;

import org.junit.jupiter.api.Test;

public class MinutosTranscurridosTest {
    @Test
    void testMinutosTranscurridos() {
        //assert MinutosTranscurridos.minutosTranscurridos(13,20,10,10) == 190;
        assert MinutosTranscurridos.minutosTranscurridos(13,10,10,20) == 170;
        assert MinutosTranscurridos.minutosTranscurridos(10,10,13,20) == 190;
        assert MinutosTranscurridos.minutosTranscurridos(10,20,13,10) == 170;
        assert MinutosTranscurridos.minutosTranscurridos(11,20,10,10) == 70;
        assert MinutosTranscurridos.minutosTranscurridos(11,10,10,20) == 50;
        assert MinutosTranscurridos.minutosTranscurridos(10,10,11,20) == 70;
        assert MinutosTranscurridos.minutosTranscurridos(10,20,11,10) == 50;
        assert MinutosTranscurridos.minutosTranscurridos(10,10,10,10) == 0;
        assert MinutosTranscurridos.minutosTranscurridos(10,20,10,10) == 10;
        assert MinutosTranscurridos.minutosTranscurridos(10,10,10,20) == 10;
        assert MinutosTranscurridos.minutosTranscurridos(24,10,10,20) == -1;
        assert MinutosTranscurridos.minutosTranscurridos(10,24,24,20) == -1;
        assert MinutosTranscurridos.minutosTranscurridos(10,60,10,20) == -1;
        assert MinutosTranscurridos.minutosTranscurridos(10,10,10,60) == -1;
    }
}
