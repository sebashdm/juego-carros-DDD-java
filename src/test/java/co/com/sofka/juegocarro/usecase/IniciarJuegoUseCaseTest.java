package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.juegocarro.juego.Competidor;
import co.com.sofka.juegocarro.juego.commands.IniciarJuegoCommand;
import co.com.sofka.juegocarro.juego.values.CompetidorId;
import co.com.sofka.juegocarro.juego.values.Edad;
import co.com.sofka.juegocarro.juego.values.Nombre;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IniciarJuegoUseCaseTest {


    @Test
    void iniciarJuego(){

        IniciarJuegoUseCase iniciarJuegoUseCase = new IniciarJuegoUseCase();
        List<Competidor> listaCompetidor = new ArrayList<>();
        listaCompetidor.add(new Competidor(
                CompetidorId.of("1040746957"), new Nombre("Sebastian Hernandez"), new Edad(24)));
        listaCompetidor.add(new Competidor(
                CompetidorId.of("1879548524"), new Nombre("Raul alzate"), new Edad(30)));
        listaCompetidor.add(new Competidor(
                CompetidorId.of("1258963741"), new Nombre("Daniela Posada"), new Edad(26)));
        listaCompetidor.add(new Competidor(
                CompetidorId.of("2548956358"), new Nombre("Sebastian Serna"), new Edad(21)));
        listaCompetidor.add(new Competidor(
                CompetidorId.of("1236587485"), new Nombre("Camilo grisales"), new Edad(22)));

        IniciarJuegoCommand iniciarJuegoCommand = new IniciarJuegoCommand(listaCompetidor, listaCompetidor.size());
        UseCaseHandler.getInstance().asyncExecutor(iniciarJuegoUseCase, new RequestCommand<>(iniciarJuegoCommand))
                .subscribe(new SubscriberMockTest());
    }

}