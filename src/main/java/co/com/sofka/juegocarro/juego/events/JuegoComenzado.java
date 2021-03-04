package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;

public class JuegoComenzado extends DomainEvent {

    public JuegoComenzado() {
        super("juegocarro.juego.events.JuegoComenzado");
    }
}
