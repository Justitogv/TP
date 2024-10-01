package Prueba;

import java.util.ArrayList;

public class Agenda {
    private String nombre;
    private ArrayList<Nota> nota;

    public Agenda(String nombre, ArrayList<Nota> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nota> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Nota> nota) {
        this.nota = nota;
    }

    public void agregarNota(Nota nota){

    }

    public void listarNotas(){

    }

    public void buscarXcontacto(String nombre){

    }

    public void listarContactosAlfa(){

    }

    public void buscarXtitulos(String inicio){

    }
}
