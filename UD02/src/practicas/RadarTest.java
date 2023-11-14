package practicas;

import org.junit.jupiter.api.Test;

public class RadarTest {
    @Test
    void testExcesoVelocidad() {
        assert Radar.excesoVelocidad(10.0, 600, 60) == 0;
        assert Radar.excesoVelocidad(10, 600, 50) == 10;
        assert Radar.excesoVelocidad(10, 600, 30) == 30;
        assert Radar.excesoVelocidad(15, 300, 120) == 60;
        assert Radar.excesoVelocidad(15, 300, 90) == 90;
        assert Radar.excesoVelocidad(10, 300, 120) == 0;
        assert Radar.excesoVelocidad(10, 300, 90) == 30;

    }

    @Test
    void excesoVelocidad() {
        assert Radar.multaInfraccion(20, 0) == 0;
        assert Radar.multaInfraccion(20, 15) == 100;
        assert Radar.multaInfraccion(30, 21) == 300;
        assert Radar.multaInfraccion(40, 31) == 400;
        assert Radar.multaInfraccion(50, 50) == 500;
        assert Radar.multaInfraccion(50, 51) == 600;
        assert Radar.multaInfraccion(60, 0) == 0;
        assert Radar.multaInfraccion(70, 30) == 100;
        assert Radar.multaInfraccion(80, 31) == 300;
        assert Radar.multaInfraccion(90, 51) == 400;
        assert Radar.multaInfraccion(100, 61) == 500;
        assert Radar.multaInfraccion(110, 71) == 600;
        assert Radar.multaInfraccion(120, 1) == 100;

    }
}
