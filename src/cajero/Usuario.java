package cajero;

/**
 * La clase Usuario representa a un usuario del sistema de cajero automático.
 */
public class Usuario {

    private String nombreUsuario;
    private String nombreTitular;
    private String contrasena;
    private String nroCuenta;
    private String divisa;
    private String monto;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombreUsuario  Nombre de usuario.
     * @param nombreTitular  Nombre del titular de la cuenta.
     * @param contrasena     Contraseña del usuario.
     * @param nroCuenta      Número de cuenta del usuario.
     * @param divisa         Tipo de divisa de la cuenta.
     * @param montoInicial   Monto inicial de la cuenta.
     */
    public Usuario(String nombreUsuario, String nombreTitular, String contrasena, String nroCuenta, String divisa, String montoInicial) {
        this.nombreUsuario = nombreUsuario;
        this.nombreTitular = nombreTitular;
        this.contrasena = contrasena;
        this.nroCuenta = nroCuenta;
        this.divisa = divisa;
        this.monto = montoInicial;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return Nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular.
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Obtiene el número de cuenta del usuario.
     *
     * @return Número de cuenta.
     */
    public String getNumeroCuenta() {
        return nroCuenta;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return Contraseña del usuario.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Obtiene el tipo de divisa de la cuenta.
     *
     * @return Tipo de divisa en minúsculas.
     */
    public String getTipoDivisa() {
        return divisa.toLowerCase();
    }

    /**
     * Obtiene el monto actual de la cuenta.
     *
     * @return Monto actual de la cuenta.
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Procesa la contraseña de entrada y la convierte en una cadena.
     *
     * @param contrasena Contraseña ingresada como arreglo de caracteres.
     * @return Contraseña procesada como cadena.
     */
    private String procesarContrasena(char[] contrasena) {
        StringBuilder contrasenaCadena = new StringBuilder();
        for (char c : contrasena) {
            contrasenaCadena.append(c);
        }
        return contrasenaCadena.toString();
    }
}
