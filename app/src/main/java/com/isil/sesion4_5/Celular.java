package com.isil.sesion4_5;

public class Celular {
    //atributos
    String modelo;
    String marca;
    String colorCel;
    Alumno dueno;
    int numero;
    boolean encontrado;

    //constructor


    Celular(String modelo, String marca,
                   String colorCel, Alumno dueno,
                   int numero, boolean encontrado) {
        this.modelo = modelo;
        this.marca = marca;
        this.colorCel = colorCel;
        this.dueno = dueno;
        this.numero = numero;
        this.encontrado = encontrado;
    }

    //métodos
    String Llamar(int numero){
        return "Llamando a "+numero;
    }

    String GuardarNumero(int numero){
        return "Numero " +numero+
                "guardado en Agenda";
    }

    String GuardarTarea(String tarea){
        return "Tarea Guardada: "+tarea;
    }

    String TocarMusica(String nombre, String formato){
        return "Reproduciendo: "+nombre +"."+formato;
    }

    String MostrarInfo(){
        String msg = "Es un celular de marca "+marca+
                " modelo "+modelo + " de color "+
                colorCel + " que pertenece al alumno "+
                dueno.nombre + " " +dueno.apellido +
                " ("+dueno.codigo + ")" + " cuyo número es "+
                numero;

        if(encontrado) msg += ". Ya ha sido recogido.";
        else msg += ". Aún no ha sido recogido.";

        return msg;
    }
}
