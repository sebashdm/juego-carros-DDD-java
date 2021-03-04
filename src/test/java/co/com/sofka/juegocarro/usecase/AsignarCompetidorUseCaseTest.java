package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.juego.commands.AsignarCompetidorCommand;
import co.com.sofka.juegocarro.juego.events.CompetidorAgregado;
import co.com.sofka.juegocarro.juego.events.JuegoCreado;
import co.com.sofka.juegocarro.juego.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.Request;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AsignarCompetidorUseCaseTest extends UseCaseHandleBaseTest{

    @Test
     void AsignarCompetidorTest_happyPath(){
        var useCase = new AsignarCompetidorUseCase();
        when(repository.getEventsBy("1040746957")).thenReturn(List.of(
           new JuegoCreado(new Pista(600,5),5)
        ));
        useCase.addRepository(repository);

        var comando = new AsignarCompetidorCommand(
            new Nombre("sebastian Hernandez") , new Edad(24),CompetidorId.of("1040746957")
        );

        UseCaseHandler.getInstance()
                .setIdentifyExecutor("1040746957")
                .asyncExecutor(useCase, new RequestCommand<>(comando))
                .subscribe(subscriber);
        verify(subscriber).onNext(eventCaptor.capture());

        var competidorAgregado = (CompetidorAgregado) eventCaptor.getAllValues().get(0);
        Assertions.assertEquals("sebastian Hernandez", competidorAgregado.getNombre().value());
        Assertions.assertEquals(24, competidorAgregado.getEdad().value());
        Assertions.assertEquals("1040746957", competidorAgregado.getCompetidorId().value());
    }

}




