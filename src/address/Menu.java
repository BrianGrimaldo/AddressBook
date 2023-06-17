/**
 * La clase Menu representa un menú de opciones para interactuar con la libreta de direcciones.
 * Proporciona métodos para mostrar el menú, leer la opción seleccionada por el usuario y ejecutar la acción correspondiente.
 */

package address;

import address.data.AddressBook;

import java.util.Scanner;

public class Menu {
     /**
     * Crea una nueva instancia de Menu y obtiene la instancia única de AddressBook.
     */
    private final AddressBook addressBook;
    private final Scanner sc;

    public Menu() {
        addressBook = AddressBook.getInstance();
        sc = new Scanner(System.in);
    }

    public void displayMenu() {
         
    /**
     * Muestra el menú de opciones y ejecuta la acción correspondiente según la opción seleccionada por el usuario.
     */
        char option;
        do {
            System.out.println("====================");
            System.out.println("a) Cargar de archivo.");
            System.out.println("b) Agregar");
            System.out.println("c) Eliminar");
            System.out.println("d) Buscar");
            System.out.println("e) Mostrar");
            System.out.println("f) Salir");
            System.out.print("====================== ");
            option = sc.nextLine().charAt(0);

            switch (option) {
                case 'a' -> addressBook.loadEntriesFromFile();
                case 'b' -> addressBook.addEntry();
                case 'c' -> addressBook.removeEntry();
                case 'd' -> addressBook.searchEntry();
                case 'e' -> addressBook.displayEntries();
                case 'f' -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println();
            
            /*El ciclo se repetira con la condicion de que el valor ingresado sea diferente a f */
        } while (option != 'f');
    }
}