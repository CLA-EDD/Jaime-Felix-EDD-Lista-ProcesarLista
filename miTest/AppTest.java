package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static ProcesarLista pl;

    @BeforeAll public static void setUp() {
        pl = new ProcesarLista( new int[] {10, 9, 8, 7, 6} );
    }

    @Test public void testSumar() {
        assertTrue(pl.sumar() == 40);
    }

    @Test public void testPromediar() {
        assertTrue(pl.promediar() == 8.0);
    }

    @Test public void testMayoresQuePromedio() {
        assertTrue(pl.elementosMayoresQuePromedio().toString().equals("10\n9\n"));
    }

    @Test public void testPares() {
        assertTrue(pl.elementosPares().toString().equals("10\n8\n6\n"));
    }
}