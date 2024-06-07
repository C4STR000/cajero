package cajero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * GestorIO es una clase que facilita la entrada y salida de datos por consola.
 * Proporciona métodos para leer datos de entrada y escribir datos de salida.
 */
public class GestorIO {

    private static BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Lee una cadena de texto desde la entrada estándar (consola).
     *
     * @return La cadena de texto ingresada por el usuario.
     */
    public String inString() {
        String entrada = null;
        try {
            entrada = b.readLine();
        } catch (Exception e) {
            // En caso de error, se llama al método salir().
            this.salir();
        }
        return entrada;
    }

    /**
     * Lee un número entero desde la entrada estándar (consola).
     *
     * @return El número entero ingresado por el usuario.
     */
    public int inInt() {
        int entrada = 0;
        try {
            entrada = Integer.parseInt(this.inString());
        } catch (Exception e) {
            // En caso de error, se llama al método salir().
            this.salir();
        }
        return entrada;
    }

    /**
     * Imprime un mensaje en la salida estándar (consola).
     *
     * @param salida El mensaje que se va a imprimir.
     */
    public void out(String salida) {
        System.out.println(salida);
    }

    /**
     * Imprime un mensaje de error en la salida estándar y termina el programa.
     */
    private void salir() {
        System.out.println("ERROR de entrada/salida");
        System.exit(0);
    }
}
