package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.juegocarro.juego.Juego;
import co.com.sofka.juegocarro.juego.commands.IniciarJuegoCommand;
import co.com.sofka.juegocarro.juego.values.JuegoId;

public class CrearCarrilUseCase extends UseCase<RequestCommand<IniciarJuegoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<IniciarJuegoCommand> iniciarJuegoCommandRequestCommand) {

    }
}
