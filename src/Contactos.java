import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contactos {
    private String nombre;
    private String localidad;
    private String direccion;
    private List<String> telefonos;

    public Contactos(String nombre, String localidad, String direccion, List<String> telefonos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccion = direccion;
        this.telefonos = telefonos != null ? telefonos : new ArrayList<>();
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    // Add phone number
    public void agregarTelefono(String caracteristica, int numero) {
        if (validarCaracteristica(caracteristica) && validarNumero(numero)) {
            telefonos.add(caracteristica + "-" + numero);
            System.out.println("Número agregado correctamente: " + telefonos.get(telefonos.size() - 1));
        } else {
            System.out.println("El número ingresado es erróneo");
        }
    }

    // Remove a phone number
    public void eliminarTelefono() {
        Scanner scanner = new Scanner(System.in);
        listarTelefono();

        if (telefonos.isEmpty()) {
            System.out.println("No existen números de teléfonos en la lista.");
            return;
        }

        System.out.print("Ingrese el número de la posición del teléfono que desea eliminar: ");
        int posicion = scanner.nextInt() - 1;

        if (posicion < 0 || posicion >= telefonos.size()) {
            System.out.println("Posición inválida.");
        } else {
            String removed = telefonos.remove(posicion);
            System.out.println("El teléfono " + removed + " ha sido eliminado.");
        }
    }

    // List phone numbers
    public void listarTelefono() {
        if (telefonos.isEmpty()) {
            System.out.println("No hay números de teléfono almacenados.");
        } else {
            for (int i = 0; i < telefonos.size(); i++) {
                System.out.println((i + 1) + ") " + telefonos.get(i));
            }
        }
    }

    // Modify a phone number
    public void modificarTelefono() {
        Scanner scanner = new Scanner(System.in);
        listarTelefono();

        if (telefonos.isEmpty()) {
            System.out.println("No existen números de teléfonos en la lista para modificar.");
            return;
        }

        System.out.print("Ingrese el número de la posición del teléfono que desea modificar: ");
        int posicion = scanner.nextInt() - 1;
        scanner.nextLine();  // Consume newline

        if (posicion < 0 || posicion >= telefonos.size()) {
            System.out.println("Posición inválida.");
            return;
        }

        System.out.print("Ingrese el nuevo número de teléfono en el formato CARACTERÍSTICA-NUMERO: ");
        String nuevoTelefono = scanner.nextLine();

        telefonos.set(posicion, nuevoTelefono);
        System.out.println("El teléfono en la posición " + (posicion + 1) + " ha sido modificado.");
    }

    // Validation methods
    public boolean validarCaracteristica(String c) {
        return c != null && c.matches("0\\d{2,4}");  // Example: Must start with 0 and 3 to 5 digits
    }

    public boolean validarNumero(int n) {
        String numero = String.valueOf(n);
        return numero.matches("[1-9]\\d{4,6}");  // 5 to 7 digits not starting with 0
    }
}
