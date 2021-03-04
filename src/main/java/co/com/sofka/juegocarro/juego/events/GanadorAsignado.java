package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.values.CompetidorId;

public class GanadorAsignado extends DomainEvent {

    private final CompetidorId competidorId;

    public GanadorAsignado(CompetidorId competidorId) {
        super("juegocarro.juego.events.GanadorAsignado");
        this.competidorId = competidorId;
    }

    public CompetidorId getCompetidorId() {
        return competidorId;
    }
}
