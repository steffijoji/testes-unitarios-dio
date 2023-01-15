package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class) //segue a ordem dada aos nomes
//@TestMethodOrder(MethodOrderer.Random.class) //executa em ordem aleatória
//@TestMethodOrder(MethodOrderer.DisplayName.class) //inserir @DisplayName("nome")


public class OrdenandoTest {

    //@DisplayName("2. Segundo")
    @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    //@DisplayName("1. Primeiro")
    @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    //@DisplayName("3. Terceiro")
    @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
