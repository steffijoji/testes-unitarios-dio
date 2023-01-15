package one.digitalinnovation.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    public static void main(String[] args) {

    }

    private String nome;
    private LocalDate nascimento;

    public Pessoa (String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public boolean ehMaiordeIdade() {
        return getIdade() >= 18;
    }
}
