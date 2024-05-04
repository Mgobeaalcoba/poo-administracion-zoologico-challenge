package org.mgobea.administracionzoologico.model;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, largo, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "Los tigres de la especio: " + this.getEspecieTigre() + " comen carne";
    }

    @Override
    public String dormir() {
        return "Los tigres de un tamaño de: " + this.getAltura() + " duermen en la selva";
    }

    @Override
    public String correr() {
        return "Los tigres de un tamaño de: " + this.getAltura() + " corren a una velocidad de: " + this.getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "Los tigres de un largo de: " + this.getLargo() + " se comunican con rugidos y maullidos";
    }
}
