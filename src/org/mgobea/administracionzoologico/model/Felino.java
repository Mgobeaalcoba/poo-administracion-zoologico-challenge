package org.mgobea.administracionzoologico.model;

abstract public class Felino extends Mamifero{
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, largo, altura, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
