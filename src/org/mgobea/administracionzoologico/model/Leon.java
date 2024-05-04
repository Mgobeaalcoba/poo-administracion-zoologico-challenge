package org.mgobea.administracionzoologico.model;

public class Leon extends Felino {
    private Integer numeroManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numeroManada, Float potenciaRugidoDecibel) {
        super(habitat, largo, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumeroManada() {
        return numeroManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon come junto con su manada de "+ this.getNumeroManada() + " individuos";
    }

    @Override
    public String dormir() {
        return "El leon duerme en su habitat de "+ this.getHabitat() + " horas al dia";
    }

    @Override
    public String correr() {
        return "El leon corre a "+ this.getVelocidad() + "km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica con otros leones a través de rugidos con una potencia de " + this.getPotenciaRugidoDecibel() +"decibeles y maullidos";
    }
}
