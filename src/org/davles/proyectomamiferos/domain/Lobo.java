package org.davles.proyectomamiferos.domain;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    String comer() {
        return "Este lobo come Corzos";
    }

    @Override
    String dormir() {
        return "Este lobo duerme en el refugio de una montaña";
    }

    @Override
    String correr() {
        return "Este lobo corre a 60 km/h";
    }

    @Override
    String comunicarse() {
        return "Este lobo se comunica por medio de la caca";
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumCamada=" + numCamada +
                "\nespecieLobo='" + especieLobo + '\'';
    }
}
