/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 * La clase Cuenta representa una cuenta bancaria con su número de cuenta, divisa y monto.
 * Proporciona métodos para obtener estos detalles.
 */
public class Cuenta {

    private String nroCuenta; // Número de la cuenta bancaria
    private String divisa;    // Divisa de la cuenta bancaria
    private String monto;     // Monto en la cuenta bancaria

    /**
     * Constructor para crear un objeto Cuenta con los detalles especificados.
     *
     * @param nroCuenta El número de cuenta bancaria.
     * @param divisa La divisa de la cuenta bancaria.
     * @param monto El monto en la cuenta bancaria.
     */
    public Cuenta(String nroCuenta, String divisa, String monto) {
        this.nroCuenta = nroCuenta;
        this.divisa = divisa;
        this.monto = monto;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     *
     * @return El número de cuenta bancaria.
     */
    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     * Obtiene la divisa de la cuenta bancaria.
     *
     * @return La divisa de la cuenta bancaria.
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * Obtiene el monto en la cuenta bancaria.
     *
     * @return El monto en la cuenta bancaria.
     */
    public String getMonto() {
        return monto;
    }
    
    /**
     * Proporciona una representación en cadena de la cuenta bancaria.
     *
     * @return Una cadena que representa la cuenta bancaria en el formato: Número de Cuenta (Divisa).
     */
    @Override
    public String toString(){
        return nroCuenta + "(" + getDivisa() + ")";
    }
}
