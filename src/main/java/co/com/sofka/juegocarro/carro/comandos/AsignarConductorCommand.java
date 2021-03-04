package co.com.sofka.juegocarro.carro.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.juegocarro.carro.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.objetosdevalor.DNI;
import co.com.sofka.juegocarro.juego.commands.AsignarCompetidorCommand;

import java.util.Objects;

public class AsignarConductorCommand implements Command {

    private String nickname;
    private DNI dni;
    private CarroId carroId;

    public AsignarConductorCommand(String nickname, DNI dni, CarroId carroId) {
        this.nickname = Objects.requireNonNull(nickname);
        this.dni = Objects.requireNonNull(dni);
        this.carroId = Objects.requireNonNull(carroId);
    }

    public AsignarConductorCommand() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public void setCarroId(CarroId carroId) {
        this.carroId = carroId;
    }
}
