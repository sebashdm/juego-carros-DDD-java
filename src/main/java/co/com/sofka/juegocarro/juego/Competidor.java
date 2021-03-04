package co.com.sofka.juegocarro.juego;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.juegocarro.juego.values.CompetidorId;
import co.com.sofka.juegocarro.juego.values.Edad;
import co.com.sofka.juegocarro.juego.values.Nombre;

public class Competidor extends Entity<CompetidorId> {

    protected Nombre nombre;
    protected Edad edad;


    public Competidor(CompetidorId cedula, Nombre nombre, Edad edad) {
        super(cedula);
        this.nombre = nombre;
        this.edad = edad;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }
}
