package co.com.sofka.juegocarro.carril.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.juegocarro.carril.objetosdevalor.Lugarcarril;

public class carroMovido extends DomainEvent {
    private final  Lugarcarril lugarcarril;
    public carroMovido(Lugarcarril lugarcarril) {
        super("juegocarro.carril.events.carroMovido");
        this.lugarcarril = lugarcarril;
    }

    public Lugarcarril getLugarcarril() {
        return lugarcarril;
    }
}
