/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * La clase Evento representa un evento relacionado con una cuenta bancaria,
 * como una transacción o un registro de operación.
 * Proporciona métodos para obtener los detalles del evento.
 */
public class Evento {

    private String nroCuenta;     // Número de cuenta relacionado con el evento
    private String descripcion;   // Descripción del evento
    private String monto;         // Monto relacionado con el evento
    private String saldo;         // Saldo después del evento

    /**
     * Constructor para crear un objeto Evento con los detalles especificados.
     *
     * @param nroCuenta El número de cuenta relacionado con el evento.
     * @param descripcion La descripción del evento.
     * @param monto El monto relacionado con el evento.
     * @param saldo El saldo después del evento.
     */
    public Evento(String nroCuenta, String descripcion, String monto, String saldo) {
        this.nroCuenta = nroCuenta;
        this.descripcion = descripcion;
        this.monto = monto;
        this.saldo = saldo;
    }

    /**
     * Obtiene el número de cuenta relacionado con el evento.
     *
     * @return El número de cuenta.
     */
    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     * Obtiene la descripción del evento.
     *
     * @return La descripción del evento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el monto relacionado con el evento.
     *
     * @return El monto relacionado con el evento.
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Obtiene el saldo después del evento.
     *
     * @return El saldo después del evento.
     */
    public String getSaldo() {
        return saldo;
    }

    /**
     * Obtiene la fecha actual formateada como "yyyy/MM/dd".
     *
     * @return La fecha actual en formato "yyyy/MM/dd".
     */
    public String getFecha() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fechaFormateada = fechaActual.format(formato);
        return fechaFormateada;
    }
}
