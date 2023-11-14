package codigovariado;

import org.junit.jupiter.api.Test;

public class aTest {
    @Test
    void testExcesoVelocidad() {
        assert a.excesoVelocidad(10.0, 600, 60) == 0;
        assert a.excesoVelocidad(10, 600, 50) == 10;
        assert a.excesoVelocidad(10, 600, 30) == 30;
        assert a.excesoVelocidad(15, 300, 120) == 60;
        assert a.excesoVelocidad(15, 300, 90) == 90;
        assert a.excesoVelocidad(10, 300, 120) == 0;
        assert a.excesoVelocidad(10, 300, 90) == 30;

    }

    @Test
    void excesoVelocidad() {
        assert a.multaInfraccion(20, 0) == 0;
        assert a.multaInfraccion(20, 15) == 100;
        assert a.multaInfraccion(30, 21) == 300;
        assert a.multaInfraccion(40, 31) == 400;
        assert a.multaInfraccion(50, 50) == 500;
        assert a.multaInfraccion(50, 51) == 600;

        assert a.multaInfraccion(60, 0) == 0;
        assert a.multaInfraccion(70, 30) == 100;
        assert a.multaInfraccion(80, 31) == 300;
        assert a.multaInfraccion(90, 51) == 400;
        assert a.multaInfraccion(100, 61) == 500;
        assert a.multaInfraccion(110, 71) == 600;
        assert a.multaInfraccion(120, 1) == 100;

    }
}
