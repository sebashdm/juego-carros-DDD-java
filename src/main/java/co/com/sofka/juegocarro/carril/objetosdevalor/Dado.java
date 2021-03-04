package co.com.sofka.juegocarro.carril.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Random;

public class Dado implements ValueObject<Integer> {

    private final int valorDado;

    public Dado() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(6);
        this.valorDado = valorAleatorio+1;
    }

    @Override
    public Integer value() {
        return valorDado;
    }
}
