package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.juegocarro.carro.comandos.CrearCarroCommand;
import co.com.sofka.juegocarro.carro.eventos.CarroCreado;
import co.com.sofka.juegocarro.carro.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.objetosdevalor.Color;
import co.com.sofka.juegocarro.carro.objetosdevalor.Modelo;
import co.com.sofka.juegocarro.carro.objetosdevalor.TipoCarro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class CrearCarroUseCaseTest extends UseCaseHandleBaseTest {

    @Test
    void crearCarro(){
        var useCase = new CrearCarroUseCase();
        var comando = new CrearCarroCommand(CarroId.of("DJM634"), new Color("azul"),new Modelo("2020")
        ,new TipoCarro("Chevrolet spark"));
        UseCaseHandler.getInstance()
                .setIdentifyExecutor("DJM634")
                .asyncExecutor(useCase, new RequestCommand<>(comando))
                .subscribe(subscriber);

        verify(subscriber).onNext(eventCaptor.capture());

        var event = (CarroCreado)eventCaptor.getValue();
        Assertions.assertEquals("azul",event.getColor().value());
        Assertions.assertEquals("2020" , event.getModelo().value());
        Assertions.assertEquals("Chevrolet spark", event.getTipoCarro().value());
        Assertions.assertEquals("DJM634", event.getCarroId().value());

    }
}