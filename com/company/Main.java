package com.company;

public class Main {

    public static void main(String[] args) {


        Jugador jugador1= new Jugador("Matias","Montenegro",20,"Mar del Plata","tirador","Loro",10);
        Jugador jugador2= new Jugador("Andres","Merlo",20,"Mar del Plata","tirador","Campi",10);
        Jugador jugador3= new Jugador("Monica","Di Marco",25,"Mar del Plata","Recolector","Gallo",15);

        Entrenador entrenador=new Entrenador("Georgina","Rus",39,"Balcarce",10,"mejorias");
        Entrenador entrenador1=new Entrenador("Marcelo","Chus",56,"Barecelona",15,"mejorias");
        Entrenador entrenador2=new Entrenador("Georgina","Ryti",25,"Londres",2,"mejorias");


        SoporteTecnico soportTec1= new SoporteTecnico("Micaela","Gordszieksuk",29,"MardelPlata","mouse");
        SoporteTecnico soportTec2= new SoporteTecnico("Leandro","Praga",39,"MardelPlata","auriculares");
        SoporteTecnico soportTec3= new SoporteTecnico("Roberto","De castro",89,"MardelPlata","teclado");

        System.out.println("----------------AGREGAR PERSONAS AL PLANTEL ------------------------");

        Plantel plantel= new Plantel();

        plantel.agregarEntrenador(entrenador);
        plantel.agregarjugador(jugador1);
        plantel.agregarjugador(jugador2);
        plantel.agregarjugador(jugador3);
        plantel.agregarjugador(jugador3);
        plantel.agregarEntrenador(entrenador1);
        plantel.agregarSoporteTecnico(soportTec1);

        System.out.println("----------------MOSTRAR ELEMENTOS DEL PLANTEL ------------------------");

        System.out.println(plantel);

        System.out.println("----------------CANTIDAD DE VICTORIAS---------------------------------");
        int cantVictorias= plantel.cantVictorias();
        System.out.println("Cantidad de victorias: "+ cantVictorias);

        System.out.println("----------------MOSTRAR ELEMENTOS DE CADA TIPO -----------------------");

        plantel.mostrarUnTipo();


    }
}
