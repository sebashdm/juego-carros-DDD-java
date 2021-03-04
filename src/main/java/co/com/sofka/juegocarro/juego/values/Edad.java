package co.com.sofka.juegocarro.juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<Integer>
{

    private final int edad;

    public Edad(int edad) {
        this.edad = Objects.requireNonNull(edad,"Debe ingresar la edad");
    }


    @Override
    public Integer value() {
        return edad;
    }
}
