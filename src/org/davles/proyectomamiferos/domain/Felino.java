package org.davles.proyectomamiferos.domain;

abstract public class Felino extends Mamifero {
    // Atributos de instancia
    protected float tamanioGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public void setTamanioGarras(float tamanioGarras) {
        this.tamanioGarras = tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntamanioGarras=" + tamanioGarras +
                "\nvelocidad=" + velocidad;
    }
}
