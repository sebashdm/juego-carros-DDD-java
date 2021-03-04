package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.juegocarro.carril.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.comandos.AsignarConductorCommand;
import co.com.sofka.juegocarro.carro.eventos.CarroCreado;
import co.com.sofka.juegocarro.carro.eventos.CarroDesplazado;
import co.com.sofka.juegocarro.carro.eventos.ConductorAsignado;
import co.com.sofka.juegocarro.carro.objetosdevalor.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AsignarConductorUseCaseTest extends UseCaseHandleBaseTest {

    @Test
    void asignarConductorTest_correcto(){
        var useCase = new AsignarConductorUseCase();
        when(repository.getEventsBy("DJM634")).thenReturn(List.of(
           new CarroCreado(co.com.sofka.juegocarro.carro.objetosdevalor.CarroId.of("DJM634"),new Color("gris"),new TipoCarro("Chevrolet"),
                   new Modelo("2020")),
                   new CarroDesplazado(new KilometrosRecorridos(60), CarroId.of("x") )
        ));

        useCase.addRepository(repository);

        var comando = new AsignarConductorCommand(
                "Sebashdm", DNI.of("1040746957"), co.com.sofka.juegocarro.carro.objetosdevalor.CarroId.of("DJM634")
        );

        UseCaseHandler.getInstance()
                .setIdentifyExecutor("DJM634")
                .asyncExecutor(useCase, new RequestCommand<>(comando))
                .subscribe(subscriber);

        verify(subscriber).onNext(eventCaptor.capture());

        var conductorAsignado = (ConductorAsignado) eventCaptor.getAllValues().get(0);

        Assertions.assertEquals("Sebashdm",conductorAsignado.getNickname());
        Assertions.assertEquals("1040746957",conductorAsignado.getDni().value());

    }

}