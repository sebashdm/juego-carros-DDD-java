package co.com.sofka.juegocarro.carro.objetosdevalor;

import co.com.sofka.domain.generic.Identity;

public class DNI extends Identity {
    public DNI(String value) {
        super(value);
    }

    public static DNI of(String value){
        return new DNI(value);
    }
}
