
package address.data;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AddressBookTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    public static void main(String[] args) {
        // Crear una instancia de AddressBook
        AddressBook addressBook = AddressBook.getInstance();
        
        // Agregar algunas entradas a la libreta de direcciones
        addressBook.addEntry("Christian", "Hernandez", "Juan Osorio", "Coatzacoacos", "Veracruz", "12345", "Jahir323@hotmail.com", "123-456-7890");
        addressBook.addEntry("Oliver", "Galvez", "Tepitp", "Mexico", "Mexico", "67890", "Oliver@gmail.com", "987-654-3210");
        
        // Mostrar las entradas en la libreta de direcciones
        addressBook.displayEntries();
        
        // Eliminar una entrada por apellido
        addressBook.removeEntryByLastName("Hernandez");
        
        // Mostrar las entradas actualizadas en la libreta de direcciones
        addressBook.displayEntries();
        
        // Buscar una entrada por apellido
        addressBook.searchEntryByLastName("Galvez");
    }

    
}
