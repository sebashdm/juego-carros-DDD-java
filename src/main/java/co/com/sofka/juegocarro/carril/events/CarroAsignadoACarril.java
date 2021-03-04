package co.com.sofka.juegocarro.carril.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carril.objetosdevalor.CarroId;

public class CarroAsignadoACarril extends DomainEvent {

    private final CarroId carroId;
    public CarroAsignadoACarril(CarroId carroId) {
        super("juegocarro.carril.events.CarroAsignadoAcarril");
        this.carroId = carroId;
    }

    public CarroId getCarroId() {
        return carroId;
    }
}
