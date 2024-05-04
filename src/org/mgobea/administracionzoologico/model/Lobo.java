package org.mgobea.administracionzoologico.model;

public class Lobo extends Canino{
    private Integer numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer numeroCamada, String especieLobo) {
        super(habitat, largo, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "Los lobos de la especie " + this.getEspecieLobo() + " comen carne.";
    }

    @Override
    public String dormir() {
        return "Los lobos de un tamaño de: " + this.getAltura() + " duermen en la selva";
    }

    @Override
    public String correr() {
        return "Los lobos de un tamaño de: " + this.getAltura() + " corren a una velocidad de: 40 km/h";
    }

    @Override
    public String comunicarse() {
        return "Los lobos que viven en camadas de: " + this.getNumeroCamada() + " se comunican con aullidos y ladridos.";
    }
}
