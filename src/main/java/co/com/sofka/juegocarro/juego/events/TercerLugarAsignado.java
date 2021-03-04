package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.values.CompetidorId;

public class TercerLugarAsignado extends DomainEvent {
    private final CompetidorId competidorId;
    public TercerLugarAsignado(CompetidorId competidorId) {
        super("juegocarro.juego.events'.tercerlugarasignado");
        this.competidorId =competidorId;
    }

    public CompetidorId getCompetidorId() {
        return competidorId;
    }
}
