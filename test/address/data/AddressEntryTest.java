package address.data;

public class AddressEntryTest {
    public static void main(String[] args) {
        // Crear una instancia de AddressEntry
        AddressEntry entry = new AddressEntry("Fernanda", "Magaña", "Peras 1 ", "Coatzacoalcos", "Veracruz", "95655", "mafer25@gmail.com", "921-456-7890");

        // Obtener y mostrar los atributos de la entrada
        System.out.println("Nombre: " + entry.getNombre());
        System.out.println("Apellido: " + entry.getApellido());
        System.out.println("Calle: " + entry.getCalle());
        System.out.println("Ciudad: " + entry.getCiudad());
        System.out.println("Estado: " + entry.getEstado());
        System.out.println("Código Postal: " + entry.getCodigoPostal());
        System.out.println("Correo Electrónico: " + entry.getCorreoElectronico());
        System.out.println("Teléfono: " + entry.getTelefono());

        // Actualizar algunos atributos de la entrada
        entry.setNombre("Jane");
        entry.setApellido("Smith");
        entry.setCalle("456 Elm St");

        // Mostrar la entrada actualizada
        System.out.println(entry.toString());
    }
}
