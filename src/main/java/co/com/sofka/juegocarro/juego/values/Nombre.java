package co.com.sofka.juegocarro.juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "Debe ingresar un nombre");
    }

    @Override
    public String value() {
        return nombre ;
    }
}
