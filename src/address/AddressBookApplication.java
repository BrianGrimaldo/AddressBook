/**
 * La clase AddressBookApplication es la clase principal que inicia la aplicación de la libreta de direcciones.
 * Crea una instancia de la clase Menu y muestra el menú de opciones para interactuar con la libreta de direcciones.
 */

package address;



public class AddressBookApplication {
    /**
     * El método main es el punto de entrada de la aplicación.
     * Crea una instancia de la clase Menu y llama al método displayMenu() para mostrar el menú de opciones.
    
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}

        