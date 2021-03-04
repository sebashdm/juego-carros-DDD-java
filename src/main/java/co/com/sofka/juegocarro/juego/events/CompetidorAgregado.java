package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.values.CompetidorId;
import co.com.sofka.juegocarro.juego.values.Edad;
import co.com.sofka.juegocarro.juego.values.Nombre;

public class CompetidorAgregado extends DomainEvent {

    protected final CompetidorId competidorId;
    protected final  Nombre nombre;
    protected final Edad edad;

    public CompetidorAgregado(CompetidorId competidorId, Nombre nombre, Edad edad) {
        super("com.juegocarro.competidorAgregado");
        this.competidorId = competidorId;
        this.nombre = nombre;
        this.edad = edad;
    }

    public CompetidorId getCompetidorId() {
        return competidorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }
}
