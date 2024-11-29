package org.davles.proyectomamiferos.domain;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    String comer() {
        return "Este guepardo come Ñus";
    }

    @Override
    String dormir() {
        return "Este guepardo duerme bajo la sombra de los árboles";
    }

    @Override
    String correr() {
        return "Este guepardo corre a 100 km/h";
    }

    @Override
    String comunicarse() {
        return "Este guepardo se comunica por medio de ronroneos";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
