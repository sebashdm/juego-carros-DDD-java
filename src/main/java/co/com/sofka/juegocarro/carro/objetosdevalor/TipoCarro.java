package co.com.sofka.juegocarro.carro.objetosdevalor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCarro  implements ValueObject<String> {

    private final String tipocarro;

    public TipoCarro(String tipocarro) {
        this.tipocarro = Objects.requireNonNull(tipocarro, "No debe ser un valor nulo") ;
    }

    @Override
    public String value() {
        return tipocarro;
    }
}
