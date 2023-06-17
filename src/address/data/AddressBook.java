/**
 * La clase AddressBook representa una libreta de direcciones que contiene varias entradas.
 * Permite cargar entradas desde un archivo, agregar nuevas entradas, eliminar entradas, buscar entradas
 * y mostrar todas las entradas en la libreta de direcciones.
 */

package address.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static AddressBook instance;

    private final List<AddressEntry> entries;

    private AddressBook() {
        entries = new ArrayList<>();
    }

    public static AddressBook getInstance() {
        if (instance == null) {
            instance = new AddressBook();
        }
        return instance; /* la instancia única de AddressBook*/
    }

    public void loadEntriesFromFile() {
/**
     * Carga las entradas desde un archivo.
     * Esta funcionalidad no está implementada en el código proporcionado.
     */        System.out.println("Cargando entradas desde un archivo...");
    }

    public void addEntry() {/**
     * Agrega una nueva entrada a la libreta de direcciones.
     * Solicita al usuario que ingrese los datos de la nueva entrada.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la nueva entrada:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        AddressEntry newEntry = new AddressEntry(nombre, apellido, calle, ciudad, estado, codigoPostal, correoElectronico, telefono);
        entries.add(newEntry);

        System.out.println("Nueva entrada agregada correctamente.");
    }

    public void removeEntry() {
        /**
     * Elimina una entrada de la libreta de direcciones.
     * Solicita al usuario que ingrese el apellido de la entrada que desea eliminar
     * y muestra las entradas coincidentes para que el usuario seleccione la que desea eliminar.
     */
        System.out.println("Ingrese el apellido de la entrada que desea eliminar:");
        Scanner scanner = new Scanner(System.in);
        String apellido = scanner.nextLine();

        List<AddressEntry> matchingEntries = searchEntriesByLastName(apellido);
        if (matchingEntries.isEmpty()) {
            System.out.println("No se encontraron entradas con ese apellido.");
            return;
        }

        System.out.println("Se encontraron las siguientes entradas con el apellido '" + apellido + "':");
        for (int i = 0; i < matchingEntries.size(); i++) {
            System.out.println((i + 1) + ". " + matchingEntries.get(i));
        }

        System.out.println("Ingrese el número de la entrada que desea eliminar:");
        int entryNumber = scanner.nextInt();
        scanner.nextLine();

        if (entryNumber <= 0 || entryNumber > matchingEntries.size()) {
            System.out.println("Número de entrada inválido.");
            return;
        }

        AddressEntry entryToRemove = matchingEntries.get(entryNumber - 1);
        entries.remove(entryToRemove);
        System.out.println("Entrada eliminada correctamente.");
    }

    public void searchEntry() {
        /**
     * Busca las entradas por el inicio del apellido.
     * Solicita al usuario que ingrese el inicio del apellido para buscar
     * y muestra las entradas que coinciden con el apellido ingresado.
     */
        
        System.out.println("Ingrese el inicio del apellido para buscar:");
        Scanner scanner = new Scanner(System.in);
        String apellido = scanner.nextLine();

        List<AddressEntry> matchingEntries = searchEntriesByLastName(apellido);
        if (matchingEntries.isEmpty()) {
            System.out.println("No se encontraron entradas con ese apellido.");
            return;
        }

        System.out.println("Se encontraron las siguientes entradas con el apellido que comienza con '" + apellido + "':");
        for (AddressEntry entry : matchingEntries) {
            System.out.println(entry);
        }
    }

    public void displayEntries() {
        /**
     * Muestra todas las entradas en la libreta de direcciones.
     * Si no hay entradas, muestra un mensaje indicando que la libreta de direcciones está vacía.
     * Las entradas se muestran ordenadas por apellido.
     */

        if (entries.isEmpty()) {
            System.out.println("La libreta de direcciones está vacía.");
            return;
        }

        Collections.sort(entries);

        System.out.println("Listado de entradas en la libreta de direcciones:");
        for (AddressEntry entry : entries) {
            System.out.println(entry);
            System.out.println("--------------------");
        }
    }
/**
     * Busca las entradas por apellido.
     * Compara el apellido de cada entrada con el apellido buscado
     * y devuelve las entradas que coinciden (ignorando mayúsculas y minúsculas).
     *
     * @param lastName el apellido buscado
     * @return una lista de entradas que coinciden con el apellido buscado
     */
    private List<AddressEntry> searchEntriesByLastName(String lastName) {
        List<AddressEntry> matchingEntries = new ArrayList<>();
        for (AddressEntry entry : entries) {
            if (entry.getApellido().toLowerCase().startsWith(lastName.toLowerCase())) {
                matchingEntries.add(entry);
            }
        }
        return matchingEntries;
    }
        /** Metodos para la clase de pruebas*/
    void addEntry(String Christian, String Hernandez, String JuanOsorio, String Coatzacoalcos, String Veracruz, String string, String jahirgmailcom, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void removeEntryByLastName(String Christian) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void searchEntryByLastName(String Galvez) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
