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

    public void agregarTelefono(){

    }

    public void eliminarTelefono(){

    }

    public void listarTelefono(){

    }

    public void modificarTelefono(){

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
}
