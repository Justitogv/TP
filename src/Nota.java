public class Nota {
    private String titulo;
    private String descripcion;
    private int dia;
    private int mes;
    private Contactos contacto;

    public Nota(String titulo, String descripcion, int dia, int mes, Contactos contacto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.mes = mes;
        this.contacto = contacto;
    }

    public String getTitulo() {
        return titulo;
    }

    public Contactos getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Nota [Título=" + titulo + ", Descripción=" + descripcion + ", Fecha=" + dia + "/" + mes + ", Contacto=" + contacto.getNombre() + "]";
    }
}
