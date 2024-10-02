
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agenda {
    private String nombre;
    private ArrayList<Nota> nota;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.nota = new ArrayList<>();
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
        for (Nota nota : nota) {
            System.out.println("Título: " + nota.getTitulo() + " Texto: " + nota.getTexto());
            System.out.println("Mes: " + nota.getMes() + " Día: " + nota.getDia());
            Contactos contacto = nota.getContactos();
            System.out.println("Contacto: " + contacto.getNombre() + " Localidad: " + contacto.getLocalidad());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Teléfonos:");
            List<String> telefonos = Arrays.asList(contacto.getTelefono());
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
