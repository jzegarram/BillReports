/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billreports;

import java.util.Date;

/**
 *
 * @author jzegarram
 */
public abstract class Recibo {
    private String emisor;
    private Date fecha;
    private double monto;
    private double neto;
    private String clienteName;

    public Recibo(String _emisor, Date _fecha,  double _monto, String _clienteName ){
        this.emisor = _emisor;
        this.fecha = _fecha;
        this.monto = _monto;
        this.clienteName = _clienteName;
        this.neto = 0;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double monto) {
        this.neto = calcularNeto(monto);
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }
    
    public abstract double calcularNeto(double monto);
    
}
