package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.juegocarro.juego.Juego;
import co.com.sofka.juegocarro.juego.commands.IniciarJuegoCommand;
import co.com.sofka.juegocarro.juego.values.JuegoId;

public class IniciarJuegoUseCase extends UseCase<RequestCommand<IniciarJuegoCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<IniciarJuegoCommand> iniciarJuegoCommandRequestCommand) {

        var command = iniciarJuegoCommandRequestCommand.getCommand();
        Juego juego = new Juego(new JuegoId(), command.getPista(), command.getCantidadCompetidores());
        command.getCompetidorList().forEach((competidor -> {
            juego.agregarCompetidor(competidor.identity(), competidor.nombre(), competidor.edad());
        }));
        emit().onSuccess(new ResponseEvents(juego.getUncommittedChanges()));
    }
}
