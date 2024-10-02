
public class Nota {
    private String titulo;
    private String texto;
    private int mes;
    private int dia;
    private Contactos contactos;

    public Nota(String titulo, String texto, int mes, int dia, Contactos contactos) {
        this.titulo = titulo;
        this.texto = texto;
        this.mes = mes;
        this.dia = dia;
        this.contactos = contactos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Contactos getContactos() {
        return contactos;
    }

    public void setContactos(Contactos contactos) {
        this.contactos = contactos;
    }
}
