package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.Competidor;
import co.com.sofka.juegocarro.juego.values.CompetidorId;

public class SegundoLugarAsignado extends DomainEvent {

    private final CompetidorId competidorId;

    public SegundoLugarAsignado(CompetidorId competidorId) {
        super("juegocarro.juego.events.SegundoLugarAsignado");
        this.competidorId = competidorId;
    }

    public CompetidorId getCompetidorId() {
        return competidorId;
    }
}
