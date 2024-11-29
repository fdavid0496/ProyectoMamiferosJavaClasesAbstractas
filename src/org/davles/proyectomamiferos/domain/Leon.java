package org.davles.proyectomamiferos.domain;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    String comer() {
        return "Este león come Cebras";
    }

    @Override
    String dormir() {
        return "Este león duerme en una sabana";
    }

    @Override
    String correr() {
        return "Este león corre a 75 km/h";
    }

    @Override
    String comunicarse() {
        return "Este léon se comunica con gestiones faciales";
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumManada=" + numManada +
                "\npotenciaRugidoDecibel=" + potenciaRugidoDecibel;
    }
}
