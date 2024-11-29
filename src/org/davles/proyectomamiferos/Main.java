package org.davles.proyectomamiferos;

import org.davles.proyectomamiferos.domain.*;

public class Main {
    public static void main(String[] args) {
        Mamifero[] varObjMamiferos = new Mamifero[5];

        Mamifero objTigre = new Tigre("Montañas Nevadas", 1.1F, 2.2F, 90.0F, "Panthera tigris", 7.3F, 50, "Bengala");
        Mamifero objLeon =  new Leon("Bosques Secos", 1.2F, 1.8F, 190.0F, "Panthera leo", 3.5F, 55, 13, 114.0F);
        Mamifero objGuepardo = new Guepardo("Matorrales", 0.65F, 1.3F, 70.0F, "Acinonyx jubatus", 2.7F, 120);
        Mamifero objLobo = new Lobo("Selvas", 0.9F, 1.4F,  65.0F, "Canis lupus", "Gris", 6, 6,"Lobo árabe");
        Mamifero objPerro = new Perro("Casa amo", 0.6F, 1F, 54.5F, "Canis lupus familiaris", "Naranja con manchas blancas", 0.06F, 72);

        varObjMamiferos[0] = objTigre;
        varObjMamiferos[1] = objLeon;
        varObjMamiferos[2] = objGuepardo;
        varObjMamiferos[3] = objLobo;
        varObjMamiferos[4] = objPerro;

        for (Mamifero objMamifero : varObjMamiferos) {
            System.out.println("======================================= " + objMamifero.getClass().getSimpleName() + " =======================================");
            System.out.println(objMamifero.toString());

        }
    }
}
