package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.juegocarro.carro.Carro;
import co.com.sofka.juegocarro.carro.comandos.AsignarConductorCommand;

public class AsignarConductorUseCase extends UseCase<RequestCommand<AsignarConductorCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarConductorCommand> asignarConductorUseCaseRequestCommand) {

        var command = asignarConductorUseCaseRequestCommand.getCommand();
        var carro = Carro.from(command.getCarroId(), retrieveEvents());
        carro.asignarConductor(command.getNickname(),command.getDni());
        emit().onSuccess(new ResponseEvents(carro.getUncommittedChanges()));
    }
}
