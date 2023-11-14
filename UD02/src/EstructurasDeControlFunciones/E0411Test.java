package EstructurasDeControlFunciones;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class E0411Test {
    @Test
    void testMcdMain() {
        assertEquals(4, E0411.mcdMain(8, 12));
        assertEquals(4, E0411.mcdMain(20, 12));
        assertEquals(7, E0411.mcdMain(21, 14));
        assertEquals(8, E0411.mcdMain(8, 8));
        assertEquals(12, E0411.mcdMain(0, 12));
        assertEquals(12, E0411.mcdMain(12, 0));
        

        
    }

    @Test
    void testMcdMain2() {
        
    }
}
