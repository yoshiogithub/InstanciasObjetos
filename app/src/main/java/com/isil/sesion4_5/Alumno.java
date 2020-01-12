package com.isil.sesion4_5;

public class Alumno {

    //Atributos
    String nombre;
    String apellido;
    int codigo;

    //Constructor
    Alumno(String nombre, String apellido, int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    //Métodos
    String RegistrarDatos(String datos){
        return "Los datos : "+datos+
                " se registraron satisfactoriamente.";
    }

    String RegistrarNotas(int nota){
        return "Nota registrada: "+nota;
    }

}
