package Prueba;

import java.util.ArrayList;

public class Contactos {
    private String nombre;
    private String localidad;
    private String direccion;
    String[] telefono = new String[5];

    public Contactos(String nombre, String localidad, String direccion, String[] telefono) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    public String[] getTelefono() {
        return telefono;
    }

    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }

    public void agregarTelefono() {
        int posicion = elementoVacio();
        if (posicion == -1) {
            System.out.println("No existe más lugar para agregar números telefónicos");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String caracteristica;
        int numero;

        do {
            System.out.print("Ingrese la característica telefónica: ");
            caracteristica = scanner.nextLine();
            if (!validarCaracteristica(caracteristica)) {
                System.out.println("Característica incorrecta. Intente nuevamente.");
            }
        } while (!validarCaracteristica(caracteristica));

        do {
            System.out.print("Ingrese el número de teléfono: ");
            numero = scanner.nextInt();
            if (!validarNumero(numero)) {
                System.out.println("Número de teléfono incorrecto. Intente nuevamente.");
            }
        } while (!validarNumero(numero));

        telefono[posicion] = caracteristica + "-" + numero;
        System.out.println("Número agregado correctamente: " + telefono[posicion]);
    }

    public void agregarTelefono(String caracteristica, int numero) {
        int posicion = elementoVacio();
        if (posicion == -1) {
            System.out.println("No existen elementos vacíos");
            return;
        }

        if (validarCaracteristica(caracteristica) && validarNumero(numero)) {
            telefono[posicion] = caracteristica + "-" + numero;
            System.out.println("Número agregado correctamente: " + telefono[posicion]);
        } else {
            System.out.println("El número ingresado es erróneo");
        }
    }

    public void eliminarTelefono(){
        Scanner scanner = new Scanner(System.in);

        listarTelefono();

        boolean hayTelefonos = false;
        for (String tel : telefono) {
            if (tel != null && !tel.isEmpty()) {
                hayTelefonos = true;
                break;
            }
        }

        if (!hayTelefonos) {
            System.out.println("No existen números de teléfonos en la lista.");
            return;
        }

        System.out.print("Ingrese el número de la posición del teléfono que desea eliminar: ");
        int posicion = scanner.nextInt();

        if (posicion < 1 || posicion > telefono.length || telefono[posicion - 1] == null || telefono[posicion - 1].isEmpty()) {
            System.out.println("Posición inválida o no hay un teléfono en esa posición.");
        } else {
            telefono[posicion - 1] = "";
            System.out.println("El teléfono en la posición " + posicion + " ha sido eliminado.");
        }
    }

    public void listarTelefono(){
        boolean hayTelefonos = false;

        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] != null && !telefono[i].isEmpty()) {
                hayTelefonos = true;
                System.out.println((i + 1) + ") " + telefono[i] + " (posición " + i + " del arreglo)");
            }
        }

        if (!hayTelefonos) {
            System.out.println("No hay números de teléfono almacenados.");
        }
    }

    public void modificarTelefono(){
        Scanner scanner = new Scanner(System.in);

        listarTelefono();

        boolean hayTelefonos = false;
        for (String tel : telefono) {
            if (tel != null && !tel.isEmpty()) {
                hayTelefonos = true;
                break;
            }
        }

        if (!hayTelefonos) {
            System.out.println("No existen números de teléfonos en la lista para modificar.");
            return;
        }

        System.out.print("Ingrese el número de la posición del teléfono que desea modificar: ");
        int posicion = scanner.nextInt();

        if (posicion < 1 || posicion > telefono.length || telefono[posicion - 1] == null || telefono[posicion - 1].isEmpty()) {
            System.out.println("Posición inválida o no hay un teléfono en esa posición.");
            return;
        }

        scanner.nextLine();
        System.out.print("Ingrese el nuevo número de teléfono en el formato CARACTERÍSTICA-NUMERO: ");
        String nuevoTelefono = scanner.nextLine();

        telefono[posicion - 1] = nuevoTelefono;
        System.out.println("El teléfono en la posición " + posicion + " ha sido modificado.");
    }

    public void validarPosicion(int p){

    }

    public int elementoVacio(){
        for (int i=0; i<= telefono.length;i++){
            if (telefono[i] == null || telefono[i].equals("")) {
                return i;
            }
        }
        return -1;
    }

    public boolean validarCaracteristica(String c){
        if (c == null) {
            return false;
        }
        if (c.length() >= 3 && c.length() <= 5 && c.startsWith("0")) {

            for (char caracteristica : c.toCharArray()) {
                if (!Character.isDigit(caracteristica)) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    public boolean validarNumero(int n){
        String numero = String.valueOf(n);

        if (numero.length() < 5 || numero.length() > 7) {
            return false;
        }

        if (numero.charAt(0) == '0') {
            return false;
        }

        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
