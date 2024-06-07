package ventanas;

/**
 * Clase que gestiona el estado del índice seleccionado en un ComboBox.
 * Esta clase es estática y mantiene un único estado para todo el programa.
 * 
 * Permite establecer y obtener el índice seleccionado en un ComboBox.
 * 
 * Ejemplo de uso:
 * - Para establecer el índice seleccionado: EstadoComboBox.setIndiceSeleccionado(2);
 * - Para obtener el índice seleccionado: int indice = EstadoComboBox.getIndiceSeleccionado();
 * 
 * El índice seleccionado es inicialmente 0.
 */
public class EstadoComboBox {
   
    private static int indiceSeleccionado = 0;

    /**
     * Establece el índice seleccionado en el ComboBox.
     * 
     * @param indice Índice a establecer como seleccionado.
     */
    public static void setIndiceSeleccionado(int indice) {
        indiceSeleccionado = indice;
    }

    /**
     * Obtiene el índice seleccionado en el ComboBox.
     * 
     * @return Índice seleccionado.
     */
    public static int getIndiceSeleccionado() {
        return indiceSeleccionado;
    }
}
