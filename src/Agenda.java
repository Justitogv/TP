import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    private String nombre;
    private List<Nota> notas;

    public Agenda(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
        System.out.println("Nota agregada: " + nota.getTitulo());
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas en la agenda.");
        } else {
            System.out.println("--- Listado de Notas ---");
            for (Nota nota : notas) {
                System.out.println(nota);
            }
        }
    }

    public void buscarXcontacto(String nombreContacto) {
        boolean encontrado = false;
        for (Nota nota : notas) {
            if (nota.getContacto().getNombre().equalsIgnoreCase(nombreContacto)) {
                System.out.println(nota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron notas para el contacto " + nombreContacto);
        }
    }

    public void listaContactosAlfa() {
        List<Contactos> contactos = new ArrayList<>();
        for (Nota nota : notas) {
            contactos.add(nota.getContacto());
        }
        contactos.sort(Comparator.comparing(Contactos::getNombre));
        System.out.println("--- Contactos Ordenados Alfabéticamente ---");
        for (Contactos contacto : contactos) {
            System.out.println(contacto.getNombre());
        }
    }

    public void buscaXtitulos(String prefijo) {
        boolean encontrado = false;
        for (Nota nota : notas) {
            if (nota.getTitulo().startsWith(prefijo)) {
                System.out.println(nota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron notas que comiencen con " + prefijo);
        }
    }
}
