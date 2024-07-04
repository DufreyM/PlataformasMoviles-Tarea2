import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    // Pruebas JUnit para suma
    @Test
    void testSuma() {
        Calc calc = new Calc();
        assertEquals(5, calc.suma(2, 3), "2 + 3 debería ser 5");
    }

    // JUnit para la operación de resta
    @Test 
    void testResta() {
        Calc calc = new Calc();
        assertEquals(6, calc.resta(12, 6), "12 - 6 debería ser 6");
    }

    // JUnit para la operación de multiplicación
    @Test
    void testMultiplicacion() {
        Calc calc = new Calc();
        assertEquals(15, calc.multiplicacion(5, 3), "5 * 3 debería dar 15");
    }
}
