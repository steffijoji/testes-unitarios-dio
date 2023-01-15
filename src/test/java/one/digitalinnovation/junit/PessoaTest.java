package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1)); // cria um cenário
        Assertions.assertTrue(jessica.ehMaiordeIdade()); // executa a validação

        Pessoa joao = new Pessoa("João", LocalDate.of(2015, 1, 1));
        Assertions.assertFalse(joao.ehMaiordeIdade());
    }
}
