package co.com.sofka.juegocarro.juego.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.juegocarro.juego.Competidor;

public class PodioGanadores implements ValueObject<PodioGanadores.Ganadores> {

    private final Competidor primerLugar;
    private final Competidor segundoLugar;
    private final Competidor tercerLugar;

    public PodioGanadores(Competidor primerLugar, Competidor segundoLugar, Competidor tercerLugar) {
        this.primerLugar = primerLugar;
        this.segundoLugar = segundoLugar;
        this.tercerLugar = tercerLugar;
    }

    public PodioGanadores() {
        primerLugar = null;
        segundoLugar = null;
        tercerLugar = null;
    }

    public PodioGanadores asignarGanador(Competidor competidor){
        return new PodioGanadores(competidor, segundoLugar ,tercerLugar);
    }

    public PodioGanadores asignarSegundoLugar(Competidor competidor){
        return new PodioGanadores(primerLugar, competidor ,tercerLugar);
    }
    public PodioGanadores asignarTercerLugar(Competidor competidor){
        return new PodioGanadores(primerLugar, segundoLugar ,competidor);
    }


    @Override
    public Ganadores value(){
        return  new Ganadores() {
            @Override
            public Competidor primerLugar() {
                return primerLugar ;
            }

            @Override
            public Competidor segundoLugar() {
                return segundoLugar;
            }

            @Override
            public Competidor tercerLugar() {
                return tercerLugar;
            }
        };
    }

    public interface Ganadores {
        Competidor primerLugar();
        Competidor segundoLugar();
        Competidor tercerLugar();
    }

}
