package co.com.sofka.juegocarro.carro.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo  implements ValueObject<String> {

    private final String modelo;

    public Modelo(String modelo) {
        this.modelo = Objects.requireNonNull(modelo,"No puede ser un valoe nul");
    }

    @Override
    public String value() {
        return modelo;
    }
}
