package com.company;

public class Jugador extends Persona {

    private String posicion;
    private String nickname;
    private int cantVictorias;


    public Jugador(String name, String surname, int edad, String localidad, String posicion, String nickname, int cantVictorias) {
        super(name, surname, edad, localidad);
        this.posicion = /*if( posicion =="soporte"||
                            posicion == "tirador"||
                            posicion == "Recolector");*/
        this.nickname = nickname;
        this.cantVictorias=cantVictorias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCantVictorias() {
        return cantVictorias;
    }

    public void setCantVictorias(int cantVictorias) {
        this.cantVictorias = cantVictorias;
    }



    @Override
    public String toString() {
        return super.toString() + "Jugador{" +
                "posicion='" + posicion + '\'' +
                ", nickname='" + nickname + '\'' +
                ", cantVictorias=" + cantVictorias +
                '}';
    }
}
