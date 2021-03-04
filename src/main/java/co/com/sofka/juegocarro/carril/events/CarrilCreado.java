package co.com.sofka.juegocarro.carril.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CarrilCreado extends DomainEvent {

   private final int longitudCarril;

    public CarrilCreado(int longitudCarril) {
        super("com.juegocarros.carrilcreado");
        this.longitudCarril = longitudCarril;
    }

    public int getLongitudCarril() {
        return longitudCarril;
    }
}
