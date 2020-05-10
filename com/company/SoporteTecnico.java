package com.company;

public class SoporteTecnico extends Persona {

    private String areaEspecializacion;

    public SoporteTecnico(String name, String surname, int edad, String localidad, String areaEspecializacion) {
        super(name, surname, edad, localidad);
        this.areaEspecializacion = areaEspecializacion;
    }


    @Override
    public String toString() {
        return  super.toString() +  "SoporteTecnico{" +
                "areaEspecializacion='" + areaEspecializacion + '\'' +
                '}';
    }
}
