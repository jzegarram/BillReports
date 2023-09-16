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
public class Recibo {
    private String emisor;
    private Date fecha;
    private double monto;
    private double neto;
    private String clienteName;

    public Recibo(String emisor, Date fecha,  double monto, String clienteName ){
        this.emisor = emisor;
        this.fecha = fecha;
        this.monto = monto;
        this.clienteName = clienteName;
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

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }
    
    public void calcularTotalNeto() {};
    
}
