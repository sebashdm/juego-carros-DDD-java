package co.com.sofka.juegocarro.carril;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.juegocarro.carril.events.CarrilCreado;
import co.com.sofka.juegocarro.carril.events.CarroAsignadoACarril;
import co.com.sofka.juegocarro.carril.events.carroMovido;
import co.com.sofka.juegocarro.carril.events.recorridoFinalizado;
import co.com.sofka.juegocarro.carril.objetosdevalor.*;

public class Carril extends AggregateEvent<CarroId> {

    protected Integer longitudCarril;
    protected CarroId carroId;
    protected Lugarcarril lugarcarril;
    protected Boolean finalizoRecorrido;


    public Carril(CarroId entityId, int longitudCarril) {
        super(entityId);
        appendChange( new CarrilCreado(longitudCarril)).apply();
    }


    private Carril(CarroId entityId){
        super(entityId);
        subscribe(new CarrilState(this));
    }

    public void asignarCarro(CarroId carroId){
        appendChange( new CarroAsignadoACarril(carroId)).apply();
    }

    public void finalizarRecorrido(){
        appendChange(new recorridoFinalizado(carroId)).apply();
    }

    public void moverCarro(int kilometros){
        appendChange(new carroMovido(new Lugarcarril(kilometros )));
    }

    public Integer longitudCarril() {
        return longitudCarril;
    }

    public Lugarcarril lugarcarril() {
        return lugarcarril;
    }

    public Boolean finalizoRecorrido() {
        return finalizoRecorrido;
    }
}
