package org.mgobea.administracionzoologico.main;

import org.mgobea.administracionzoologico.model.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        // Implementación de al menos 10 objetos de la clase Mamifero y uso de sus métodos:
        Mamifero leon = new Leon("Savannah", 1.5f, 1.2f, 150f, "Panthera leo", 0.5f, 80, 4, 25.5f);
        Mamifero tigre = new Tigre("Selva", 1.8f, 1.4f, 200f, "Panthera tigris", 0.6f, 90, "Siberiano");
        Mamifero lobo = new Lobo("Bosque", 1.6f, 1.3f, 180f, "Canis lupus", "Gris", 0.4f, 60, "Lobo Asiático");
        Mamifero perro = new Perro("Casa", 0.5f, 0.4f, 10f, "Canis lupus familiar", "Marron", 0.2f, 30);
        Mamifero guepardo = new Guepardo("Sabana", 1.7f, 1.1f, 120f, "Acinonyx jubatus", 0.3f, 100);

        Mamifero[] listaMamiferos = {leon, tigre, lobo, perro, guepardo};

        for (Mamifero mamifero : listaMamiferos) {
            System.out.println("-------------------------------");
            // Imprimo la clase del objeto
            System.out.println(mamifero.getClass().getSimpleName());
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println("-------------------------------");
        }
    }
}
