package co.com.sofka.juegocarro.carro;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.juegocarro.carro.eventos.CarroCreado;
import co.com.sofka.juegocarro.carro.eventos.CarroDesplazado;
import co.com.sofka.juegocarro.carro.eventos.ConductorAsignado;
import co.com.sofka.juegocarro.carro.objetosdevalor.KilometrosRecorridos;

import java.util.Objects;

public class CarroState extends EventChange {

    public CarroState(Carro carro){
        apply(( CarroCreado event)->{
           carro.color = event.getColor();
           carro.modelo = event.getModelo();
           carro.tipoCarro = event.getTipoCarro();
           carro.kilometrosrecorrridos = new KilometrosRecorridos(0);
        });

        apply((CarroDesplazado event)->{
            var kilometrosrecorridos = event.getKilometrosRecorridos().value();
            Objects.requireNonNull(kilometrosrecorridos,"el desplazamiento no debe ser null");
            if(kilometrosrecorridos <= 0){
                throw new IllegalArgumentException("No se puede desplazar en reversa");
            }
            carro.kilometrosrecorrridos = new KilometrosRecorridos(+event.getKilometrosRecorridos().value());
        });

        apply((ConductorAsignado event)->{
            carro.conductor = new Conductor(event.getDni(), event.getNickname());
        });
    }
}
