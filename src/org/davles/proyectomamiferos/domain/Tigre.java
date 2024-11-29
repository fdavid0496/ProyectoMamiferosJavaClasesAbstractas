package org.davles.proyectomamiferos.domain;

public class Tigre extends Felino {
    private String especieTigre;


    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    String comer() {
        return "Este tigre va a comer Monos";
    }

    @Override
    String dormir() {
        return "Este tigre duerme en Rocas";
    }

    @Override
    String correr() {
        return "Este tigre corre a unos 50 km/h";
    }

    @Override
    String comunicarse() {
        return "Este tigre se comunica con vocalizaciones";
    }

    @Override
    public String toString() {
        return super.toString() + "especieTigre='" + especieTigre + '\'';
    }
}
