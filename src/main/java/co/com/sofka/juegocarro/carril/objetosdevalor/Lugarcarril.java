package co.com.sofka.juegocarro.carril.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Lugarcarril  implements ValueObject<Integer> {

    private final int posicionActual;

    public Lugarcarril(int posicionActual) {
        this.posicionActual = posicionActual;
        if(posicionActual < 0){
            throw  new IllegalArgumentException("la posicion no debe ser negativa");
        }
    }

    @Override
    public Integer value() {
        return posicionActual;
    }
}
