package Ejercicio09.Imagenes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class povOf2Test {

    pov2 pov = new pov2();

    @Test
    void povOf2 () {
        assertEquals("4", pov2.povOf2(2));
    }

    @Test
    void povOf5 () {
        assertEquals("32", pov2.povOf2(5));
    }

    @Test
    void povOf0 () {
        assertEquals("0", pov2.povOf2(0));
    }

    @Test
    void povOfNegative1 () {
        assertEquals("0,5", pov2.povOf2(-1));
    }

    @Test
    void povOfNegative4 () {
        assertEquals("0,0625", pov2.povOf2(-4));
    }
}
