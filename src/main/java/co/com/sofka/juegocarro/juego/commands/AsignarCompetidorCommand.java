package co.com.sofka.juegocarro.juego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.juegocarro.juego.values.*;

public class AsignarCompetidorCommand implements Command {
    private Nombre nombre;
    private Edad edad;
    private CompetidorId competidorId;
    private JuegoId juegoid;

    public AsignarCompetidorCommand(Nombre nombre, Edad edad, CompetidorId competidorId) {
        this.nombre = nombre;
        this.edad = edad;
        this.competidorId = competidorId;
    }

    public AsignarCompetidorCommand(){

    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    public CompetidorId getCompetidorId() {
        return competidorId;
    }

    public void setCompetidorId(CompetidorId competidorId) {
        this.competidorId = competidorId;
    }

    public JuegoId getJuegoid() {
        return juegoid;
    }

    public void setJuegoid(JuegoId juegoid) {
        this.juegoid = juegoid;
    }
}
