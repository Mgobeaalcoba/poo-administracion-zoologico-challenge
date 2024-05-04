package org.mgobea.administracionzoologico.model;

public class Perro extends Canino{
    private Integer fuerzaMordida;

    public Perro(String habitat, Float largo, Float altura, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, largo, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros con fuerza de mordida de: " + this.getFuerzaMordida() + " comen carne y huesos.";
    }

    @Override
    public String dormir() {
        return "Los perros de un tamaño de: " + this.getAltura() + " duermen en la selva";
    }

    @Override
    public String correr() {
        return "Los perros de un tamaño de: " + this.getAltura() + " corren a una velocidad de: 30 km/h";
    }

    @Override
    public String comunicarse() {
        return "Los perros de color: " + this.getColor() + " se comunican con ladridos y aullidos.";
    }
}
