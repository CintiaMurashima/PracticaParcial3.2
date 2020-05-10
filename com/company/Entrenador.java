package com.company;

public class Entrenador extends Persona {

    private int aniosExperiencia;
    private String indicaciones;


    public Entrenador(String name, String surname, int edad, String localidad, int aniosExperiencia, String indicaciones) {
        super(name, surname, edad, localidad);
        this.aniosExperiencia = aniosExperiencia;
        this.indicaciones = indicaciones;
    }


    @Override
    public String toString() {
        return super.toString() + "Entrenador{" +
                "aniosExperiencia=" + aniosExperiencia +
                ", indicaciones='" + indicaciones + '\'' +
                '}';
    }
}
