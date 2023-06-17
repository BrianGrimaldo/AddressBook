package address.data;
/**
 * La clase AddressEntry representa una entrada en una libreta de direcciones.
 * Contiene información como el nombre, apellido, dirección, correo electrónico y número de teléfono de una persona.
 * Implementa la interfaz Comparable para permitir la comparación de entradas por apellido.
 */
public class AddressEntry implements Comparable<AddressEntry> {

    private String nombre;
    private String apellido;
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String correoElectronico;
    private String telefono;

    /** Linea 29 - 39
     * Crea una nueva instancia de AddressEntry con los datos proporcionados.
     *
     * @param nombre            el nombre de la persona
     * @param apellido          el apellido de la persona
     * @param calle             la calle de la dirección
     * @param ciudad            la ciudad de la dirección
     * @param estado            el estado de la dirección
     * @param codigoPostal      el código postal de la dirección
     * @param correoElectronico el correo electrónico de la persona
     * @param telefono          el número de teléfono de la persona
     */
    public AddressEntry(String nombre, String apellido, String calle, String ciudad, String estado,
                        String codigoPostal, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    
    public String getNombre() {
       /**
     * Obtiene el nombre de la persona.
     *
     * @return el nombre de la persona
     */ return nombre;
    }

   
    public void setNombre(String nombre) {
         /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nombre de la persona
     */
         this.nombre = nombre;
    }

    
    public String getApellido() {
        /**
     * Obtiene el apellido de la persona.
     *
     * @return el apellido de la persona
     */
        return apellido;
    }

    
    public void setApellido(String apellido) {
        /**
     * Establece el apellido de la persona.
     *
     * @param apellido el apellido de la persona
     */
        this.apellido = apellido;
    }

  
    public String getCalle() {
          /**
     * Obtiene la calle de la dirección.
     *
     * @return la calle de la dirección
     */
          return calle;
    }

    
    public void setCalle(String calle) {
        /**
     * Establece la calle de la dirección.
     *
     * @param calle la calle de la dirección
     */
        this.calle = calle;
    }

   
    public String getCiudad() {
         /**
     * Obtiene la ciudad de la dirección.
     *
     * @return la ciudad de la dirección
     */
         return ciudad;
    }

    
    public void setCiudad(String ciudad) {
        /**
     * Establece la ciudad de la dirección.
     *
     * @param ciudad la ciudad de la dirección
     */
        this.ciudad = ciudad;
    }

  
    public String getEstado() {
          /**
     * Obtiene el estado de la dirección.
     *
     * @return el estado de la dirección
     */
          return estado;
    }

    public void setEstado(String estado) {
        /**
     * Establece el estado de la dirección.
     */
        this.estado = estado;
    }

   
    public String getCodigoPostal() {
         /**
     * Obtiene el código postal de la dirección.
     *
     * @return el código postal de la dirección
     */
         return codigoPostal;
    }


    public void setCodigoPostal(String codigoPostal) {
            /**
     * Establece el código postal de la dirección.
     *
     * @param codigoPostal el código postal de la dirección
     */
            this.codigoPostal = codigoPostal;
    }

    
    public String getCorreoElectronico() {
        /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return el correo electrónico de la persona
     */
        return correoElectronico;
    }

    
    public void setCorreoElectronico(String correoElectronico) {
        /**
     * Establece el correo electrónico de la persona.
     *
     * @param correoElectronico el correo electrónico de la persona
     */
        this.correoElectronico = correoElectronico;
    }

    
    public String getTelefono() {
        /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return el número de teléfono de la persona
     */
        return telefono;
    }

    
    public void setTelefono(String telefono) {
       /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono el número de teléfono de la persona
     */ 
       this.telefono = telefono;
    }

    
    @Override
    public String toString() {
        /**
     * Devuelve una representación en formato de cadena de la entrada de la dirección.
     *
     * @return la representación en formato de cadena de la entrada de la dirección
     */
        return "Nombre: " + nombre + "\n" +
                " Apellido: " + apellido + "\n" +
                " Calle: " + calle + "\n" +
                " Ciudad: " + ciudad + "\n" +
                " Estado: " + estado + "\n" +
                " Código Postal: " + codigoPostal + "\n" +
                ",Correo Electrónico: " + correoElectronico + "\n" +
                " Teléfono: " + telefono;
    }


    @Override
    public int compareTo(AddressEntry other) {    /**
     * Compara esta entrada de dirección con otra entrada de dirección basándose en el apellido. 
     * @return un valor negativo si esta entrada es menor, cero si son iguales, o un valor positivo si esta entrada es mayor
     */
        return apellido.compareTo(other.getApellido());
    }
}