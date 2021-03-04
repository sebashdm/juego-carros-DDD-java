package co.com.sofka.juegocarro.carril.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carril.objetosdevalor.CarroId;

public class recorridoFinalizado extends DomainEvent {
    private final CarroId carroId;
    public recorridoFinalizado(CarroId carroId) {
        super("juegocarro.carril.events.recorridoFinalizado");
        this.carroId = carroId;
    }

    public CarroId getCarroId() {
        return carroId;
    }
}
