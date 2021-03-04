package co.com.sofka.juegocarro.juego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.values.Pista;

public class JuegoCreado extends DomainEvent {

   private final Pista pista;
   private final int limiteCompetidores;

    public JuegoCreado(Pista pista, int limiteCompetidores) {
        super("com.juegocarro.JuegoIniciado");
        this.pista = pista;
        this.limiteCompetidores = limiteCompetidores;
    }

    public Pista getPista() {
        return pista;
    }

    public int getLimiteCompetidores() {
        return limiteCompetidores;
    }
}
