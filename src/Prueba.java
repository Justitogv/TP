public class Prueba {
    public void ejecutarPrueba() {
        // Crear 4 instancias de la clase Contacto
        String[] telefonos1 = {"0341-111111"};
        String[] telefonos2 = {"0342-222222"};
        String[] telefonos3 = {"0343-333333"};
        String[] telefonos4 = {"0344-444444"};

        Contactos c1 = new Contactos("Juan Prueba1", "Santa Fe", "25 de mayo 1111", telefonos1);
        Contactos c2 = new Contactos("Pedro Prueba2", "Rosario", "9 de Julio 2222", telefonos2);
        Contactos c3 = new Contactos("Maria Prueba3", "Córdoba", "San Martín 3333", telefonos3);
        Contactos c4 = new Contactos("Ana Prueba4", "Buenos Aires", "Belgrano 4444", telefonos4);

        // Agregar teléfonos a cada contacto
        c1.agregarTelefono("0342", 457737);
        c1.agregarTelefono("0344", 454437);
        c1.agregarTelefono("0341", 457757);
        c1.agregarTelefono("051", 356776);

        c2.agregarTelefono("0342", 123456);
        c3.agregarTelefono("0343", 789012);
        c4.agregarTelefono("0344", 345678);

        // Crear 4 instancias de la clase Nota y asignar un contacto a cada una
        Nota nota1 = new Nota("Reunión Proyecto", "Reunión con el equipo de desarrollo", 9, 15, c1);
        Nota nota2 = new Nota("Entrega Documento", "Entregar reporte financiero", 10, 5, c2);
        Nota nota3 = new Nota("Llamada Cliente", "Llamada con el cliente para soporte técnico", 11, 12, c3);
        Nota nota4 = new Nota("Planificación Viaje", "Planificar el viaje de negocios a Buenos Aires", 12, 20, c4);

        // Crear una instancia de la clase Agenda
        Agenda agenda = new Agenda("Agenda de Trabajo");

        // Agregar las 4 notas a la agenda
        agenda.agregarNota(nota1);
        agenda.agregarNota(nota2);
        agenda.agregarNota(nota3);
        agenda.agregarNota(nota4);

        // Listar las notas de la Agenda
        agenda.listarNotas();
    }
}