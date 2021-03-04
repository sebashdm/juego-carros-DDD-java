package co.com.sofka.juegocarro.juego.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.juegocarro.juego.Competidor;

public class CompetidorId extends Identity {

    public CompetidorId(String cedula) {
        super(cedula);
    }

    public CompetidorId() {
    }

    public static CompetidorId of(String value){
        return new CompetidorId(value);
    }
}
