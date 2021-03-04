package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.juegocarro.juego.Juego;
import co.com.sofka.juegocarro.juego.commands.AsignarCompetidorCommand;


public class AsignarCompetidorUseCase extends UseCase<RequestCommand<AsignarCompetidorCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AsignarCompetidorCommand> asignarCompetidorCommandRequestCommand) {
        var command = asignarCompetidorCommandRequestCommand.getCommand();
        var juego = Juego.from(command.getJuegoid(), retrieveEvents());
        juego.agregarCompetidor(command.getCompetidorId(), command.getNombre(), command.getEdad());
        emit().onSuccess(new ResponseEvents(juego.getUncommittedChanges()));
    }

}
