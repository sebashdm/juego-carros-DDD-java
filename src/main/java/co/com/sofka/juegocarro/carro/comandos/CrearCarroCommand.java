package co.com.sofka.juegocarro.carro.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.juegocarro.carro.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.objetosdevalor.Color;
import co.com.sofka.juegocarro.carro.objetosdevalor.Modelo;
import co.com.sofka.juegocarro.carro.objetosdevalor.TipoCarro;

import java.util.Objects;

public class CrearCarroCommand  implements Command {

    private CarroId carroId;
    private Color color;
    private Modelo modelo;
    private TipoCarro tipoCarro;

    public CrearCarroCommand() {
    }

    public CrearCarroCommand(CarroId carroId, Color color, Modelo modelo, TipoCarro tipoCarro) {
        this.carroId = Objects.requireNonNull(carroId);
        this.color = Objects.requireNonNull(color);
        this.modelo = Objects.requireNonNull(modelo);
        this.tipoCarro = Objects.requireNonNull(tipoCarro);
    }

    public CarroId getCarroId() {
        return carroId;
    }

    public void setCarroId(CarroId carroId) {
        this.carroId = carroId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
}
