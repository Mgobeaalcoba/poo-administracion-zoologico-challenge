package org.mgobea.administracionzoologico.model;

abstract public class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillos;

    public Canino(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, largo, altura, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
