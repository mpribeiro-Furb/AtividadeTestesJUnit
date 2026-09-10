import AtvPessoa.Pessoa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PessoaTest {

    @Test
    public void testPessoa(){
        Pessoa ps = new Pessoa();
        ps.setNome("João");
        assertEquals("João", ps.getNome());

    }

    @Test(expected=IllegalArgumentException.class)
    public void TesteIdade(){
        Pessoa ps = new Pessoa();
        ps.setIdade(-9);

    }
}
