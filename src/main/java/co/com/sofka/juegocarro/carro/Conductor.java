package co.com.sofka.juegocarro.carro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.juegocarro.carro.objetosdevalor.DNI;

import java.util.Objects;
import java.util.Random;


public class Conductor extends Entity<DNI> {
    private final String nickName;


    public Conductor(DNI entityId, String nickName) {
        super(entityId);
        this.nickName = Objects.requireNonNull(nickName,"el nickname es obligatorio");
    }

    public String nickName() {
        return nickName;
    }

    public int lanzarDado() {
        var resultadoDado = new Random();
        return 1 + resultadoDado.nextInt(6 - 1 + 1);
    }
}
