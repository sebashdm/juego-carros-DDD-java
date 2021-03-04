package co.com.sofka.juegocarro.carro.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carro.objetosdevalor.CarroId;
import co.com.sofka.juegocarro.carro.objetosdevalor.Color;
import co.com.sofka.juegocarro.carro.objetosdevalor.Modelo;
import co.com.sofka.juegocarro.carro.objetosdevalor.TipoCarro;

public class CarroCreado extends DomainEvent {
    private final CarroId carroId;
    private final Color color;
    private final TipoCarro tipoCarro;
    private final Modelo modelo;

    public CarroCreado(CarroId carroId, Color color, TipoCarro tipoCarro, Modelo modelo) {
        super("juegocarro.carro.eventos");
        this.carroId = carroId;
        this.color = color;
        this.tipoCarro = tipoCarro;
        this.modelo = modelo;

    }

    public CarroId getCarroId() {
        return carroId;
    }

    public Color getColor() {
        return color;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
