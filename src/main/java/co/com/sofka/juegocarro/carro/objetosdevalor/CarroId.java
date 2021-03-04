package co.com.sofka.juegocarro.carro.objetosdevalor;

import co.com.sofka.domain.generic.Identity;

public class CarroId extends Identity {

    public CarroId(String placa) {
        super(placa);
    }

    public static CarroId of(String value){
        return new CarroId(value);
    }

}
