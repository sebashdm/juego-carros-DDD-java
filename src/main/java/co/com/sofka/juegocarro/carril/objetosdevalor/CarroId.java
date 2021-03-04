package co.com.sofka.juegocarro.carril.objetosdevalor;

import co.com.sofka.domain.generic.Identity;

public class CarroId extends Identity {

    public CarroId(String carrilId) {
        super(carrilId);
    }

    public static CarroId of(String carrilId){
        return new CarroId(carrilId);
    }
}
