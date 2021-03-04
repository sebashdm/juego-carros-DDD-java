package co.com.sofka.juegocarro.carro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carril.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.eventos.ConductorAsignado;
import co.com.sofka.juegocarro.carro.eventos.CarroCreado;
import co.com.sofka.juegocarro.carro.eventos.CarroDesplazado;
import co.com.sofka.juegocarro.carro.objetosdevalor.*;

import java.util.List;

public class Carro extends AggregateEvent<co.com.sofka.juegocarro.carro.objetosdevalor.CarroId> {
     protected Color color;
     protected KilometrosRecorridos kilometrosrecorrridos;
     protected TipoCarro tipoCarro;
     protected Modelo modelo;
     protected Conductor conductor;


    public Carro(co.com.sofka.juegocarro.carro.objetosdevalor.CarroId carroId) {
        super(carroId);
        subscribe(new CarroState(this));
    }
    public Carro(co.com.sofka.juegocarro.carro.objetosdevalor.CarroId carroId, Color color, TipoCarro tipoCarro, Modelo modelo) {
        super(carroId);
       appendChange(new CarroCreado(carroId, color , tipoCarro , modelo)).apply();
    }



    public static Carro from(co.com.sofka.juegocarro.carro.objetosdevalor.CarroId carroId, List<DomainEvent> events){
        var carro = new Carro(carroId);
        events.forEach(carro::applyEvent);
        return  carro;
    }

    public void asignarConductor(String nickname, DNI dni) {
        appendChange( new ConductorAsignado(nickname, dni)).apply();
    }


    public void avanzar(KilometrosRecorridos kilometrosRecorridos , CarroId carrilId){
        //kilometrosrecorrridos = new KilometrosRecorridos(kilometrosrecorrridos.value()+(valoraAvanzar*100));
        appendChange(new CarroDesplazado(kilometrosRecorridos, carrilId )).apply();
    }

    public Color color() {
        return color;
    }

    public KilometrosRecorridos kilometrosrecorrridos() {
        return kilometrosrecorrridos;
    }

    public TipoCarro tipoCarro() {
        return tipoCarro;
    }

    public Modelo modelo() {
        return modelo;
    }

}
