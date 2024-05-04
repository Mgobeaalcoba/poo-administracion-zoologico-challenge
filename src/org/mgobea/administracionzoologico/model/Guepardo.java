package org.mgobea.administracionzoologico.model;

public class Guepardo extends Felino{

    public Guepardo(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, largo, altura, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come solo lo que encuentra en su habitat: " + this.getHabitat();
    }

    @Override
    public String dormir() {
        return "El guepardo es muy rápido, corre a "+ this.getVelocidad()+ "por eso duerme mucho";
    }

    @Override
    public String correr() {
        return "El guepardo corre a "+ this.getVelocidad()+ "km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica con otros guepardos a través de rugidos y maullidos";
    }
}
