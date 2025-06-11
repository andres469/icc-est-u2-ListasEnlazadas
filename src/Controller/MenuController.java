package Controller;

import Models.Contact;
import java.util.Scanner;

public class MenuController {
    private final ContactManager manager;
    private final Scanner scanner;

    public MenuController() {
        manager = new ContactManager();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n----- AGENDA -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Ver todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    manager.printContacts();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void agregar() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Contact<String, String> contacto = new Contact<>(nombre, telefono);
        manager.addContact(contacto);
        System.out.println("Contacto agregado.");
    }

    private void buscar() {
        System.out.print("Nombre del contacto a buscar: ");
        String nombre = scanner.nextLine();
        Contact<?, ?> contacto = manager.findContactByName(nombre);
        if (contacto != null) {
            System.out.println("Encontrado: " + contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    private void eliminar() {
        System.out.print("Nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        if (manager.deleteContactByName(nombre)) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró el contacto.");
        }
    }
}
