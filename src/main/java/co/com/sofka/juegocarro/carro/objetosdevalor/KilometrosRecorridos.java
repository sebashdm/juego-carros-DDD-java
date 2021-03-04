package co.com.sofka.juegocarro.carro.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class KilometrosRecorridos implements ValueObject<Integer> {

    private final int kilometrosAvanzados;

    public KilometrosRecorridos(int kilometrosAvanzados) {
        this.kilometrosAvanzados = Objects.requireNonNull(kilometrosAvanzados, "el kilometraje no puede ser null") ;
    }

    @Override
    public Integer value() {
        return kilometrosAvanzados;
    }
}
