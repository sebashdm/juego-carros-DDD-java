package co.com.sofka.juegocarro.carro.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carril.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.objetosdevalor.KilometrosRecorridos;

public class CarroDesplazado extends DomainEvent {
    private final KilometrosRecorridos kilometrosRecorridos;
    private  final CarroId carrilId;

    public CarroDesplazado(KilometrosRecorridos kilometrosrecorrridos, CarroId carrilId) {
        super("juegocarro.carro.eventos.carroDesplazado");
        this.carrilId = carrilId;
        this.kilometrosRecorridos = kilometrosrecorrridos;
    }

    public KilometrosRecorridos getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public CarroId getCarrilId() {
        return carrilId;
    }
}
