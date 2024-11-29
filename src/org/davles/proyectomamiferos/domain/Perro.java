package org.davles.proyectomamiferos.domain;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    String comer() {
        return "Este perro come croquetas Pedigree";
    }

    @Override
    String dormir() {
        return "Este perro duerme en un colchón especial";
    }

    @Override
    String correr() {
        return "Este perro es perezoso para correr";
    }

    @Override
    String comunicarse() {
        return "Este perro mueve la cola para expresar sus emociones";
    }

    @Override
    public String toString() {
        return super.toString() + "\nfuerzaMordida=" + fuerzaMordida;
    }
}
