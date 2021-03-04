package co.com.sofka.juegocarro.juego;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.juegocarro.juego.events.*;
import co.com.sofka.juegocarro.juego.values.PodioGanadores;

import java.util.ArrayList;

public class JuegoState extends EventChange {
    public JuegoState(Juego juego) {

       apply((JuegoCreado event) ->{
           juego.ListaCompetidores = new ArrayList<>();
           juego.pista = event.getPista();
           juego.juegoEnCurso = false;
           juego.podio = new PodioGanadores();
           juego.limiteCompetidores = event.getLimiteCompetidores();
       });


       apply((CompetidorAgregado event)->{
           if(juego.limiteCompetidores > juego.ListaCompetidores.size() || !juego.juegoEnCurso){
               juego.ListaCompetidores.add(new Competidor(event.getCompetidorId(),event.getNombre(),event.getEdad()));
           }else{
               throw  new IllegalArgumentException("Error!! No se pueden agregar mas competidores");
           }
       });

       apply((JuegoTerminado event)->{
           juego.juegoEnCurso = false;
        });

       apply((GanadorAsignado event) ->{
           if(juego.juegoEnCurso){
               Competidor ganador = getCompetidor(juego, event.getCompetidorId());
               juego.podio = juego.podio.asignarGanador(ganador);
           }else {
               throw new IllegalArgumentException("error al asignar ganador");
           }
       });

        apply((SegundoLugarAsignado event) ->{
            if(juego.juegoEnCurso){
                Competidor ganador = getCompetidor(juego, event.getCompetidorId());
                juego.podio = juego.podio.asignarSegundoLugar(ganador);
            }else {
                throw new IllegalArgumentException("error al asignar ganador");
            }
        });

        apply((TercerLugarAsignado event) ->{
            if(juego.juegoEnCurso){
                Competidor ganador = getCompetidor(juego, event.getCompetidorId());
                juego.podio = juego.podio.asignarTercerLugar(ganador);
            }else {
                throw new IllegalArgumentException("error al asignar ganador");
            }
        });
    }

    private Competidor getCompetidor(Juego juego, Identity id){
        return juego.ListaCompetidores.stream().filter(competidor -> competidor.identity().equals(id))
                .findFirst().orElseThrow(()->new IllegalArgumentException("el competidor no existe"));
    }



}
