package co.com.sofka.juegocarro.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.juegocarro.carro.Carro;
import co.com.sofka.juegocarro.carro.comandos.CrearCarroCommand;

public class CrearCarroUseCase  extends UseCase<RequestCommand<CrearCarroCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCarroCommand> crearCarroCommandRequestCommand) {
        var comman = crearCarroCommandRequestCommand.getCommand();
        var carro = new Carro(comman.getCarroId(), comman.getColor(),
                comman.getTipoCarro(),comman.getModelo());
        emit().onSuccess(new ResponseEvents(carro.getUncommittedChanges()));
    }
}
