package co.com.sofka.juegocarro.juego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.juegocarro.juego.Competidor;
import co.com.sofka.juegocarro.juego.values.Pista;

import java.util.List;

public class IniciarJuegoCommand implements Command {

    private List<Competidor> competidorList;
    private Integer cantidadCompetidores;
    private Pista pista;

    public IniciarJuegoCommand(List<Competidor> competidorList,  Integer cantidadCompetidores) {
        this.competidorList = competidorList;
        this.cantidadCompetidores = cantidadCompetidores;
    }

    public IniciarJuegoCommand() {

    }

    public List<Competidor> getCompetidorList() {
        return competidorList;
    }

    public void setCompetidorList(List<Competidor> competidorList) {
        this.competidorList = competidorList;
    }

    public Integer getCantidadCompetidores() {
        return cantidadCompetidores;
    }

    public void setCantidadCompetidores(Integer cantidadCompetidores) {
        this.cantidadCompetidores = cantidadCompetidores;
    }


    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }
}
