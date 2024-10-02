package Prueba;

import java.util.ArrayList;

public class Agenda {
    private String nombre;
    private ArrayList<Nota> nota;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
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
        System.out.println("*****************************************************************");
        System.out.println("Nombre: " + this.nombre);
        for (Nota nota : notas) {
            System.out.println("Título: " + nota.getTitulo() + " Texto: " + nota.getTexto());
            System.out.println("Mes: " + nota.getMes() + " Día: " + nota.getDia());
            Contacto contacto = nota.getContacto();
            System.out.println("Contacto: " + contacto.getNombre() + " Localidad: " + contacto.getLocalidad());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Teléfonos:");
            List<String> telefonos = contacto.getTelefonos();
            for (int i = 0; i < telefonos.size(); i++) {
                System.out.println((i + 1) + "- " + telefonos.get(i));
            }
            System.out.println("*****************************************************************");
        }
    }

    public void buscarXcontacto(String nombre){

    }

    public void listarContactosAlfa(){

    }

    public void buscarXtitulos(String inicio){

    }
}
