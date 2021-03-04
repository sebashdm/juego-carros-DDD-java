package co.com.sofka.juegocarro.juego;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.events.*;
import co.com.sofka.juegocarro.juego.values.*;

import java.util.List;

public class Juego extends AggregateEvent<JuegoId>{

    protected List<Competidor> ListaCompetidores;
    protected Integer limiteCompetidores;
    protected Boolean juegoEnCurso;
    protected Pista pista;
    protected PodioGanadores podio;


    public Juego(JuegoId entityId, Pista pista , int limiteCompetidores) {
        super(entityId);
        appendChange(new JuegoCreado(pista,limiteCompetidores)).apply();
    }

    private Juego(JuegoId entityId){
        super(entityId);
        subscribe(new JuegoState(this));
    }

    public static Juego from(JuegoId juegoId, List<DomainEvent> events){
        var juego = new Juego(juegoId);
        events.forEach(juego::applyEvent);
        return juego;
    }

    public void agregarCompetidor(CompetidorId competidorId, Nombre nombre, Edad edad){
        appendChange( new CompetidorAgregado(competidorId,nombre,edad)).apply();
    }

    public void comenzarJuego(){
        appendChange(new JuegoComenzado()).apply();
    }


    public void asignarGanador(CompetidorId competidorId){
        appendChange(new GanadorAsignado(competidorId)).apply();
    }

    public void  asignarSegundoLugar(CompetidorId competidorId){
        appendChange(new SegundoLugarAsignado(competidorId)).apply();
    }

    public void  asignarTercerLugar(CompetidorId competidorId){
        appendChange(new TercerLugarAsignado(competidorId)).apply();
        appendChange(new JuegoTerminado()).apply();
    }



}
