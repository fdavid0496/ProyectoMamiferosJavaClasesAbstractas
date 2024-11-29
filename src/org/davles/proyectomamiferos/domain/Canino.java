package org.davles.proyectomamiferos.domain;

abstract public class Canino extends Mamifero {
    // Atributos de instancia
    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }

    public void setTamanioColmillos(float tamanioColmillos) {
        this.tamanioColmillos = tamanioColmillos;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolor='" + color + '\'' +
                "\ntamanioColmillos=" + tamanioColmillos;
    }
}
