package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456789", 100);

        TransferenciaEntrecontas transferenciaEntrecontas = new TransferenciaEntrecontas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntrecontas.transfere(contaOrigem, contaDestino, -1));
    }

}
