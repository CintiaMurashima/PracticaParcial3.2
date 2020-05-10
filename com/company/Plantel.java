package com.company;

import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Plantel {

    private ArrayList<Persona> personasPlantel = new ArrayList<>();

    public Plantel() {
        this.personasPlantel = personasPlantel;
    }

    public ArrayList<Persona> getPersonasPlantel() {
        return personasPlantel;
    }

    public void setPersonasPlantel(ArrayList<Persona> personasPlantel) {
        this.personasPlantel = personasPlantel;
    }

    public void agregarSoporteTecnico(SoporteTecnico persona) {
        personasPlantel.add(persona);
    }


    public void agregarEntrenador(Entrenador entrenador) {
        boolean encontrado = false;
        int i = 0;
        while (i < personasPlantel.size() && encontrado == false) {
            if (personasPlantel.get(i) instanceof Entrenador) {
                encontrado = true;
                System.out.println("Ya hay un Entrenador");
            } else i++;
        }
        if (!encontrado) {
            personasPlantel.add(entrenador);
        }
    }


    public void agregarjugador(Jugador jugador) {
        boolean encontrado = false;
        Jugador p;
        int i = 0;

        while (i < personasPlantel.size() && encontrado == false) {
            if (personasPlantel.get(i) instanceof Jugador) {
                p = (Jugador) personasPlantel.get(i);
                if (p.getNickname().equals(jugador.getNickname())) {
                    encontrado = true;
                    System.out.println("El Nickname ya esta utilizado, probar otra opcion ");
                } else i++;
            } else i++;
        }
        if (!encontrado) {
            personasPlantel.add(jugador);
        }
    }

    public int cantVictorias() {
        int victorias = 0;
        Jugador a;
        for (int i = 0; i < personasPlantel.size(); i++) {

            if (personasPlantel.get(i) instanceof Jugador) {
                a = (Jugador) personasPlantel.get(i);
                victorias += a.getCantVictorias();
                System.out.println(a);
            }
        }
        return victorias;
    }

    public void mostrarUnTipo() {

        int opcion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que desea mostrar? \n 1)Entrenador \n 2)Jugadores \n 3)Soporte Tecnico ");
        opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("MOSTRAR ENTRENADOR");
                    for (int i = 0; i < personasPlantel.size(); i++) {
                        if (personasPlantel.get(i) instanceof Entrenador)
                            System.out.println(personasPlantel.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("MOSTRAR JUGADORES");
                    for (int i = 0; i < personasPlantel.size(); i++) {
                        if (personasPlantel.get(i) instanceof Jugador)
                            System.out.println(personasPlantel.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("MOSTRAR SOPORTE TECNICO");
                    for (int i = 0; i < personasPlantel.size(); i++) {
                        if (personasPlantel.get(i) instanceof SoporteTecnico)
                            System.out.println(personasPlantel.get(i).toString());
                    }
                    break;
            }
    }

        @Override
        public String toString () {
            return "Plantel{" +
                    "personasPlantel=" + personasPlantel +
                    '}';
        }
    }


