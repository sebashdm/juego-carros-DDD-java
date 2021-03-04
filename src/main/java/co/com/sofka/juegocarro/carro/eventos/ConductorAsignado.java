package co.com.sofka.juegocarro.carro.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carro.objetosdevalor.DNI;

public class ConductorAsignado extends DomainEvent {
    private final String nickname;
    private final DNI dni;
    public ConductorAsignado(String nickname, DNI dni) {
        super("juegocarro.carro.eventos");
        this.nickname = nickname;
        this.dni = dni;
    }

    public String getNickname() {
        return nickname;
    }

    public DNI getDni() {
        return dni;
    }
}
