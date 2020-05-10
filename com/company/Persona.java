package com.company;

public abstract class Persona {

    private String name;
    private String surname;
    private int edad;
    private String localidad;

    public Persona(String name, String surname, int edad, String localidad) {
        this.name = name;
        this.surname = surname;
        this.edad = edad;
        this.localidad = localidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }






    @Override
    public String toString() {
        return "Plantel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
