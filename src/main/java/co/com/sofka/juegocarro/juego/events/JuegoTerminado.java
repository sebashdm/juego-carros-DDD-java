package co.com.sofka.juegocarro.juego.events;

public class JuegoTerminado extends co.com.sofka.domain.generic.DomainEvent {

    public JuegoTerminado(){
        super("juegocarro.juego.events.JuegoTerminado");
    }

}
