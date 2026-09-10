import AtvPessoa.main;
import org.junit.Test;
import static org.junit.Assert.*;

public class mainTest {

    @Test
    public void testSomarDoisMaisDoisDeveriaRetornarQuatro() {
        assertEquals(4, main.somar(2, 2));
    }

    @Test
    public void testSomarNegativoComPositivo() {
        assertEquals(1, main.somar(-4, 5));
    }

    @Test
    public void testSubtrairCincoMenosTresDeveriaRetornarDois() {
        assertEquals(2, main.subtrair(5, 3));
    }

    @Test
    public void testIsPositivoComNumeroPositivo() {
        assertTrue(main.isPositivo(10));
    }

    @Test
    public void testIsPositivoComNumeroNegativo() {
        assertFalse(main.isPositivo(-5));
    }

    @Test
    public void testIsPositivoComZero() {
        assertFalse(main.isPositivo(0));
    }
}
